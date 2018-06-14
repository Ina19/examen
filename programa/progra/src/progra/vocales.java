/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;
import java.util.Scanner;



public class vocales {
    public void vocales(){
        
        contar("Amor al desarrollo");
    }
 
    public static void contar(String cadena)
    {
        String vocales="aeiou";
        int contador[]={0,0,0,0,0};
 
        
        for(int i=0;i<cadena.length();i++)
        {
            
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {
                    
                    contador[j]++;
                }
            }
        }
 
        for(int i=0;i<vocales.length();i++)
        {
            System.out.println("Cantidad de la letra "+vocales.charAt(i)+": "+contador[i]);
        }
    }
}
