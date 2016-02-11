/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.consolidadnotas.service;

import pe.eeob.consolidadnotas.dto.consolidadDto;

/**
 *
 * @author Erick Ore
 */
public class CriteriosEvaluacion {
    public int[] CritTeo = {3,3,2};
    public int[] CritPrc = {2,3,5};
    public int[] CritPrcTeo = {1,3,3};
    
    public int suma (int n1, int n2, int n3){
        int suma = n1+n2+n3;
        return suma;
    }
    
    public String criterios(consolidadDto dto1){
        String s="";
        switch ( dto1.getTipo() ) {
            case 1: {
                s = "CURSO TEORICO. Criterio: EP*" + CritTeo[0] + " + EF*" + CritTeo[1] + " + Proyecto*"
                        + CritTeo[2];
                break;
            }
            case 2: {
                s = "CURSO PRACTICO. Criterio: EP*" + CritPrc[0] + " + EF*" + CritPrc[1] + " + Proyecto*"
                        + CritPrc[2];
                break;
            }
            case 3: {
                 s = "CURSO TEORICO-PRACTICO. Criterio: EP*" + CritPrcTeo[0] + " + EF*" + CritPrcTeo[1] +
                         " + Proyecto*" + CritPrcTeo[2];
                 break;
            }
        } 
        return s;
    }
}
