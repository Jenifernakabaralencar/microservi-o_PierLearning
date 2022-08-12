package com.ricardo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ricardo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer>{

}
