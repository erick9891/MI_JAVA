/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.calificaciones.service;

/**
 *
 * @author Erick Ore
 */
public class CalificacionFactory {

    public CalificacionFactory() {
    }   
    
    public static final String TIPO_TEORICO = "TEORICO";
    public static final String TIPO_PRACTICO = "PRACTICO";
    public static final String TIPO_TEORICOPRACTICO = "TEORICOPRACTICO";
    
    public static ConsolidadoAbstract obtenerTipoCurso(String tipo){
        ConsolidadoAbstract c1 = null;
        switch (tipo){
            case TIPO_TEORICO:
                c1 = new TeoricosService();
                break;
            case TIPO_PRACTICO:
                c1 = new PracticosService();
                break;
            case TIPO_TEORICOPRACTICO:
                c1 = new TeoricoPracticoService();
                break;
        }
        return c1;
    }
   
}
