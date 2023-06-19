package com.example.nbp_api;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Request,Long> {
}
