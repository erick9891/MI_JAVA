/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.prueba;

import pe.eeob.calificaciones.controller.ConsolidadoController;
import pe.eeob.calificaciones.dto.dtoNotas;

/**
 *
 * @author Erick Ore
 */
public class prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // datos
        dtoNotas dto1 = new dtoNotas();
        dto1.setNeparcial(18);
        dto1.setNefinal(15);
        dto1.setNproyecto(12);
        dto1.setTipo("PRACTICO");
        //proceso
        ConsolidadoController c1 = new ConsolidadoController();
        c1.Procesar(dto1);
        //reporte
        System.out.println("" + c1.obtenerDescCriterios(dto1));
        System.out.println("" + c1.Procesar(dto1));
    }
    
}
