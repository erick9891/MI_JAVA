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
public class EncuentraPrimos {
    public int CuentaPrimos (int min, int max){
        int contador1 = 0; //contador de divisores posibles
        int contador2 = 0; //contador de numeros primos en el rango
        for (int i=min; i<=max; i++){
            for (int j=1; j<=i;j++){
                if (i%j == 0){
                    contador1++;
                }
            }
            if (contador1<=2){ //si es un numero primo
                contador2++;
            }
            contador1=0;
        }
        return contador2;
    }
    public int[] DevuelvePrimos(int min, int max){
        int[] array;
        int k=0;
        array = new int[CuentaPrimos(min,max)];
        int contador1=0;
        
        for (int i=min; i<=max; i++){
            for (int j=1; j<=i;j++){
                if (i%j == 0){
                    contador1++;
                }
            }
            if (contador1<=2){ //si es un numero primo
                array[k]=i;
                k++;
            }
            contador1=0;
        }
        
        return array;
    }
            
}