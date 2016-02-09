/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.numerosprimos.prueba;

import pe.eeob.numerosprimos.service.EsPrimo;

/**
 *
 * @author Erick Ore
 */
public class prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dato
        int numero=1002;
        //operacion
        EsPrimo prim = new EsPrimo();
        //reporte
        String rpta = "Falso";
        if (prim.Calcula(numero)==true){
            rpta = "Verdad";
        }
        String repo="";
        repo += "El numero " + numero + " es un número primo es: " + rpta;
        System.out.println(repo);
    }
    
}
