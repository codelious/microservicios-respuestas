package com.codelious.microservicios.app.respuestas.microserviciosrespuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.codelious.microservicios.app.respuestas.microserviciosrespuestas.models.entity",
			"com.codelious.microservicios.commons.alumnos.commonsalumnos.models.entity",
			"com.codelious.microservicios.commons.examenes.commonsexamenes.models.entity"})
public class MicroserviciosRespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRespuestasApplication.class, args);
	}

}
