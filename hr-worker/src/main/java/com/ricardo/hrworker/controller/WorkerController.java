package com.ricardo.hrworker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.hrworker.entities.Worker;
import com.ricardo.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerController {

	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

	@Autowired
	private Environment env;

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<Iterable<Worker>> getWorkers() {
		return ResponseEntity.ok(workerRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Worker> getWorker(@PathVariable int id) {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}

		// log apenas para testar o balanceamento de carga
		logger.info("\nWorker Service - Port: " + env.getProperty("local.server.port"));

		return ResponseEntity.ok(workerRepository.findById(id).get());
	}	
}
