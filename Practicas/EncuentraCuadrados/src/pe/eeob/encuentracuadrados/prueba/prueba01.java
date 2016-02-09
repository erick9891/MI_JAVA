/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.encuentracuadrados.prueba;

import pe.eeob.encuentracuadrados.service.EncuentraCuadradosSv;

/**
 *
 * @author Erick Ore
 */
public class prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int min=1;
    int max=100;
    //proceso
    EncuentraCuadradosSv objeto1 = new EncuentraCuadradosSv();
    int[] anArray; 
    anArray = new int [objeto1.CuentaCuadrados(min, max)];
    anArray = objeto1.EncuentraCuadrados(min, max);
    //reporte
    String repo="Cuadrados: ";
    for (int i=0;i<(objeto1.CuentaCuadrados(min, max)-1);i++){
        repo += anArray[i] + ", ";
    }
    repo += anArray[objeto1.CuentaCuadrados(min, max)-1];
    repo += ".";

    System.out.println(repo);
    }
    
}
