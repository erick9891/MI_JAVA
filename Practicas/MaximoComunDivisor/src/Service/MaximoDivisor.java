/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Erick Ore
 */
public class MaximoDivisor {
    
    public int DefineFilas (int num1){
        EncuentraPrimos primos = new EncuentraPrimos();
        int [] anArray;
        int contador2=0;
        anArray = primos.DevuelvePrimos(2, num1);
        //recorriendo el array1
        for (int i=0; i < primos.CuentaPrimos(2, num1) && num1!=1 ; i++){
            while (num1 % anArray[i] == 0){
                num1 = num1 / anArray[i];   
            }
            contador2=i;
        }
        return contador2+1;        
    }
    
    public int[][] ComunDivisor (int num1){
        //int rpta=0;
        EncuentraPrimos primos = new EncuentraPrimos();
        int[] anArray;
        int contador1=0;
        int[][] anArray2;
        
        anArray = primos.DevuelvePrimos(2, num1);
        
        anArray2 = new int [DefineFilas(num1)][2]; //definiendo tamaño del Array2
        
        //llenando valores del array2
        for (int i=0; i < primos.CuentaPrimos(2, num1) && num1!=1 ; i++){
            while (num1 % anArray[i] == 0){
                num1 = num1 / anArray[i];
                contador1++;
            }
            anArray2[i][1]= contador1;
            contador1=0;
            anArray2[i][0]= anArray[i];

        }
             
        return anArray2;
    }
}
