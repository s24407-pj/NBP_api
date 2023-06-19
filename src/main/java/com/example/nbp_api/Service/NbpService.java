package com.example.nbp_api.Service;

import com.example.nbp_api.Repository.ProjectRepository;
import com.example.nbp_api.model.ExchangeRateResponse;
import com.example.nbp_api.model.ExchangeRequest;
import com.example.nbp_api.model.Rate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class NbpService {
    private final ProjectRepository projectRepository;
    private final WebClient webClient;

    public NbpService(ProjectRepository projectRepository, WebClient webClient) {
        this.projectRepository = projectRepository;

        this.webClient = webClient;
    }

    public float averageExchangeRate(String currency,int days){
        ExchangeRateResponse response = webClient.get()
                .uri("exchangerates/rates/a/{currency}/last/{days}/?format=json",currency,days)
                .retrieve()
                .bodyToMono(ExchangeRateResponse.class)
                .block();
        float sum = 0;
        for(Rate rate : response.getRates()){
            sum += rate.getMid();
        }
        float rate = sum/response.getRates().size();
        ExchangeRequest exchangeRequest = new ExchangeRequest(currency,days,rate, LocalDateTime.now());
        projectRepository.save(exchangeRequest);
        return rate;
    }
}
