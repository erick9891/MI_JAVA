/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.numerosprimos.service;

/**
 *
 * @author Erick Ore
 */
public class EsPrimo {
    private int acumulador = 0;
    //declaracion de metodo;
    public boolean Calcula(int num){
        boolean e=false;
        for (int i=1; i<=num; i++){
            if (num%i == 0) {
                acumulador++;
            }
        }
        if (acumulador <= 2){
            e=true;
        }
        return e;
    }
}
