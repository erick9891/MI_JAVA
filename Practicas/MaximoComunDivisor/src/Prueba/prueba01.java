/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Service.EncuentraPrimos;
import Service.MaximoDivisor;
import java.io.PrintStream;
import java.util.Arrays;

/**
 *
 * @author Erick Ore
 */
public class prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=1000;
        int anArray[][];
        
        MaximoDivisor objeto1 = new MaximoDivisor();
        anArray = objeto1.ComunDivisor(numero);
        int filas;
        filas = objeto1.DefineFilas(numero);
        
        for (int[] arr : anArray){
            System.out.println(Arrays.toString(arr));
        }    
        //System.out.println(String.valueOf(filas));
    }
    
}
