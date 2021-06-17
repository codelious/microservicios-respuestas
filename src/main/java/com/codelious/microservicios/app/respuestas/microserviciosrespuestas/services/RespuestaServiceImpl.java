package com.codelious.microservicios.app.respuestas.microserviciosrespuestas.services;

import com.codelious.microservicios.app.respuestas.microserviciosrespuestas.models.entity.Respuesta;
import com.codelious.microservicios.app.respuestas.microserviciosrespuestas.models.repository.RespuestaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RespuestaServiceImpl implements RespuestaService {

    @Autowired
    private RespuestaRepository repository;

    @Override
    @Transactional
    public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
        return repository.saveAll(respuestas);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId) {
        return repository.findRespuestaByAlumnoByExamen(alumnoId, examenId);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Long> findExamenesIdWithRespuestasByAlumno(Long alumnoId) {
        return repository.findExamenesIdWithRespuestasByAlumno(alumnoId);
    }
    
}
