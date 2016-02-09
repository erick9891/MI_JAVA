/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.numerosprimos.prueba;

import pe.eeob.numerosprimos.service.EncuentraPrimos;


/**
 *
 * @author Erick Ore
 */
public class prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //datos
        int min=4000;
        int max=5000;
        int cuenta;
        int[] array;
        //proceso
        EncuentraPrimos prim1 = new EncuentraPrimos();
        array = prim1.DevuelvePrimos(min, max);
        cuenta = prim1.CuentaPrimos(min, max);
        //reporte
        String repo="";
        for (int i=0;i<array.length;i++){
            repo += array[i] + ", ";
        }
        System.out.println(repo);
        System.out.println(String.valueOf(cuenta));
    }
    
}
