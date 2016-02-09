/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeob.todobaratoapp.prueba;

import eeob.todobaratoapp.service.TodobaratoService;

/**
 *
 * @author Erick Ore
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double importe = 100;
        double total, impuesto;
        TodobaratoService service = new TodobaratoService();
        total = service.CalculaTotal(importe);
        impuesto = service.CalculaImpuesto(importe);
       
        System.out.println("Importe: ");
        System.out.println(importe);
        System.out.println("Impuesto: ");
        System.out.println(impuesto);
        System.out.println("Total: ");
        System.out.println(total);
    }
    
}
