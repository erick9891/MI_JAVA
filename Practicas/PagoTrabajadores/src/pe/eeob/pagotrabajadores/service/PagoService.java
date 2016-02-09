/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.pagotrabajadores.service;

import pe.eeob.pagotrabajadores.dto.dto;

/**
 *
 * @author Erick Ore
 */
public class PagoService {  

    public double Renta;
    public double Total;
    private double Subtotal;
    
    public void CalculaRenta(dto dto1){
        
        Subtotal = dto1.getHorasDia()*dto1.getDias()*dto1.getPagoHora();
        
        if(Subtotal > 1500){
            Renta = Subtotal * 0.08; 
        } else {
            Renta = 0;
        }
        Total = (Subtotal) - Renta;  
        
        dto1.setRenta(Renta);
        dto1.setTotal(Total);
    }
}
