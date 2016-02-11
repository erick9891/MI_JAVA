/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.consolidadnotas.controller;

import pe.eeob.consolidadnotas.dto.consolidadDto;
import pe.eeob.consolidadnotas.service.ConsolidadoService;
import pe.eeob.consolidadnotas.service.CriteriosEvaluacion;

/**
 *
 * @author Erick Ore
 */
public class ConsolidadoController {
    
    public float Calcula(consolidadDto dto1){        
        ConsolidadoService s1 = new ConsolidadoService();
        return s1.Calcula(dto1);
    }
   
    public String obtenerCriterios(){
        String criterios="";
        CriteriosEvaluacion c2 = new CriteriosEvaluacion();
        return criterios;
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
    
    public String obtenerDescCriterios(consolidadDto dto1){
        CriteriosEvaluacion c3 = new CriteriosEvaluacion();
        return c3.criterios(dto1);
    }
}
