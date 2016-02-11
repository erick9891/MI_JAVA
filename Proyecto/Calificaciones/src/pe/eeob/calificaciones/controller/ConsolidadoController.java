/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.controller;

import pe.eeob.calificaciones.dto.dtoNotas;
import pe.eeob.calificaciones.service.CalificacionFactory;
import pe.eeob.calificaciones.service.CriteriosEvaluacion;

/**
 *
 * @author Erick Ore
 */
public class ConsolidadoController {

    public ConsolidadoController() {
    }
    
    public String[] obtenerTipos(){
        String tipos[] = { CalificacionFactory.TIPO_PRACTICO, 
            CalificacionFactory.TIPO_TEORICO,
            CalificacionFactory.TIPO_TEORICOPRACTICO
        };
        return tipos;
    }
    public String[] obtenerCursos(){
      String cursos[] = {
          "Fundamentos de la programación",
          "Programación I",
          "Programación II",
          "Ingeniería del Software",
          "Java avanzado"
          }; 
      return cursos;
    }    
    public float Procesar(dtoNotas dto1){   
        return CalificacionFactory.obtenerTipoCurso(dto1.getTipo()).Ponderado(dto1);
    }

    public String obtenerDescCriterios(dtoNotas dto1){
        CriteriosEvaluacion c3 = new CriteriosEvaluacion();
        return c3.criterios(dto1);
    }
}
