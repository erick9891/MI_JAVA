/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.encuentracuadrados.service;

/**
 *
 * @author Erick Ore
 */
public class EncuentraCuadradosSv {
      
    public int CuentaCuadrados (int min, int max){
        int contador=0;
        //calcula cuantos numeros cuadrados hay en el rango
        for (int i=min; i<=max; i++){
            for (int j=1; j<=i; j++){
                if (j*j==i){ //condicion para que el numero se cuadrado
                    contador++;
                }
            }
        }
        return contador;
    }    
    public int[] EncuentraCuadrados (int min, int max){        
        //llena el array con los numeros cuadrados del rango
        int[] array; //declaracion de array
        int k=0;
        
        array = new int[CuentaCuadrados(min, max)];
        
        for (int i=min; i<=max; i++){
            for (int j=1; j<=i; j++){
                if (j*j==i){ //condicion para que el numero se cuadrado
                    array[k]=i;
                    k++;
                }
            }
        }        
        
        return array;
    }
}
