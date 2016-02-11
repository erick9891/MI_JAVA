/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.dto;

/**
 *
 * @author Erick Ore
 */
public class dtoNotas {
    float neparcial;
    float nefinal;
    float nproyecto;
    float nponderado;
    String tipo;

    public dtoNotas() {

    }    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    public float getNeparcial() {
        return neparcial;
    }

    public void setNeparcial(float neparcial) {
        this.neparcial = neparcial;
    }

    public float getNefinal() {
        return nefinal;
    }

    public void setNefinal(float nefinal) {
        this.nefinal = nefinal;
    }

    public float getNproyecto() {
        return nproyecto;
    }

    public void setNproyecto(float nproyecto) {
        this.nproyecto = nproyecto;
    }

    public float getNponderado() {
        return nponderado;
    }

    public void setNponderado(float nponderado) {
        this.nponderado = nponderado;
    }


    
}
