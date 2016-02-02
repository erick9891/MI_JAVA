/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.pedidoapp.prueba;

import pe.eeob.pedidoapp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dato
        double importe=7890;
        //proceso
        PedidoService service=new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
    
}
