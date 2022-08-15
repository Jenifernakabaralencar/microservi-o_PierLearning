package com.pierleaning.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pierleaning.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer>{

}
