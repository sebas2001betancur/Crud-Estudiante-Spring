package com.Crud.Estudiantes.servicio;

import com.Crud.Estudiantes.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {

    public List<Estudiante> listarTodosLosEstudiantes();

    public Estudiante guardarEstudiantes(Estudiante estudiante);

    public Estudiante obtenerEstudiantesPorId(Long id);

    public Estudiante ActualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);
}
