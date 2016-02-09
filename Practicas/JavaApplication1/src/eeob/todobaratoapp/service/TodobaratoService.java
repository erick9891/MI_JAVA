/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeob.todobaratoapp.service;

/**
 *
 * @author Erick Ore
 */
public class TodobaratoService {
    
    private static double IGV = 0.18;
    
    public double CalculaImpuesto(double importe){
        double impuesto;
        impuesto = importe * IGV;
        return impuesto;
    }
    public double CalculaTotal (double importe){
        double total;
        total = importe + CalculaImpuesto(importe);
        return total;
    }
    
}
