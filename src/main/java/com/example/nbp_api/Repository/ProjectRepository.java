package com.example.nbp_api.Repository;

import com.example.nbp_api.model.ExchangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<ExchangeRequest, Long> {
}
