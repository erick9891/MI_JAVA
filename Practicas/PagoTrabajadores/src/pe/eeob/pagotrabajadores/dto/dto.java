/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.pagotrabajadores.dto;

/**
 *
 * @author Erick Ore
 */
public class dto {
    public int horasDia;
    public int Dias;
    public double PagoHora;
    
    public double Renta;
    public double Total;

    public int getHorasDia() {
        return horasDia;
    }
    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return Dias;
    }
    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public double getPagoHora() {
        return PagoHora;
    }
    public void setPagoHora(double PagoHora) {
        this.PagoHora = PagoHora;
    }

    public double getRenta() {
        return Renta;
    }
    public void setRenta(double Renta) {
        this.Renta = Renta;
    }

    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
