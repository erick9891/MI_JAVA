/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.service;

import pe.eeob.calificaciones.dto.dtoNotas;

/**
 *
 * @author Erick Ore
 */
public abstract class ConsolidadoAbstract {
    
    public abstract float Ponderado(dtoNotas dto1);
}
