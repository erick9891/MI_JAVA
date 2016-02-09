/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eeob.strings1.service;

/**
 *
 * @author Erick Ore
 */
public class LeeStrings {
        
    public double SumaDeString (String s1){
        double suma=0;
        String[] s2 = s1.split(" ");
        for (int i=0;i<s2.length;i++){ 
            suma += Double.parseDouble(s2[i]);
        }
        return suma;    
    }
}