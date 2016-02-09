/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.edutec.promediarApp.Controller;

import pe.eeob.EduTec.Library.Promediar;

/**
 *
 * @author Erick Ore
 */
public class Controller {
    
    private Promediar prom1;

    public Controller() {
        prom1 = new Promediar();
    }
    public double Promedio(double n1, double n2){
        return prom1.PromedNumeros(n1, n2);
    }
    public double Promedio(double n1, double n2, double n3){
        return prom1.PromedNumeros(n1, n2, n3);
    }
    public double Promedio(double n1, double n2, double n3, double n4){
        return prom1.PromedNumeros(n1, n2, n3, n4);
    }    
    public double Promedio(double n1, double n2, double n3, double n4, double n5){
        return prom1.PromedNumeros(n1, n2, n3, n4, n5);
    }
}
