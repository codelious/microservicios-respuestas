package com.codelious.microservicios.app.respuestas.microserviciosrespuestas.services;

import com.codelious.microservicios.app.respuestas.microserviciosrespuestas.models.entity.Respuesta;

public interface RespuestaService {
    public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);

    public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId);

    public Iterable<Long> findExamenesIdWithRespuestasByAlumno(Long alumnoId);

}
