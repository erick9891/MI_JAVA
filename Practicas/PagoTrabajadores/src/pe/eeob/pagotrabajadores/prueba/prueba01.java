/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.pagotrabajadores.prueba;

import pe.eeob.pagotrabajadores.dto.dto;
import pe.eeob.pagotrabajadores.service.PagoService;

/**
 *
 * @author Erick Ore
 */
public class prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        dto dto1 = new dto();        
        dto1.setHorasDia(6);        
        dto1.setDias(20);
        dto1.setPagoHora(100.0);
        
        PagoService pago = new PagoService();
        
        pago.CalculaRenta(dto1);
        
        System.out.println("Renta: " + dto1.getRenta());
        System.out.println("Total: " + dto1.getTotal());
    }
    
}
