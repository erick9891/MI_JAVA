/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.consolidadnotas.service;

import pe.eeob.consolidadnotas.dto.consolidadDto;

/**
 *
 * @author Erick Ore
 */
public class ConsolidadoService {
      
    public float Calcula(consolidadDto dto1){
        float notafinal=0;
        CriteriosEvaluacion c1 = new CriteriosEvaluacion();

        switch (dto1.getTipo()) {
            case 1: { 
                notafinal = ( c1.CritPrc[0]*dto1.notaeparcial +
                        c1.CritPrc[1]*dto1.notaefinal + 
                        c1.CritPrc[2]*dto1.notaproyecto ) / 
                        c1.suma(c1.CritPrc[0], c1.CritPrc[1], c1.CritPrc[2]);
                break;
            }
            case 2: { 
                notafinal = ( c1.CritTeo[0]*dto1.notaeparcial +
                        c1.CritTeo[1]*dto1.notaefinal + 
                        c1.CritTeo[2]*dto1.notaproyecto ) / 
                        c1.suma(c1.CritTeo[0], c1.CritTeo[1], c1.CritTeo[2]);
                break;
            }
            case 3: { 
                notafinal = ( c1.CritPrcTeo[0]*dto1.notaeparcial +
                        c1.CritPrcTeo[1]*dto1.notaefinal + 
                        c1.CritPrcTeo[2]*dto1.notaproyecto ) / 
                        c1.suma(c1.CritPrcTeo[0], c1.CritPrcTeo[1], c1.CritPrcTeo[2]);
                break;
            }
        }
    return notafinal;    
    }
}
