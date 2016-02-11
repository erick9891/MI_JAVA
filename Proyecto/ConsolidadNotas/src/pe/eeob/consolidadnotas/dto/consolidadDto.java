/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.consolidadnotas.dto;

/**
 *
 * @author Erick Ore
 */
public class consolidadDto {
    public float notaeparcial;
    public float notaefinal;
    public float notaproyecto;
    public int tipo; 
    public float notafinal;

    public consolidadDto() {
    }

    public float getNotaeparcial() {
        return notaeparcial;
    }

    public void setNotaeparcial(float notaeparcial) {
        this.notaeparcial = notaeparcial;
    }

    public float getNotaefinal() {
        return notaefinal;
    }

    public void setNotaefinal(float notaefinal) {
        this.notaefinal = notaefinal;
    }

    public float getNotaproyecto() {
        return notaproyecto;
    }

    public void setNotaproyecto(float notaproyecto) {
        this.notaproyecto = notaproyecto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }
    
}
