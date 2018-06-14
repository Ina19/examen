/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class par_impar {
    public void par(){
    Scanner sr=new Scanner(System.in);
        int j=0;
        System.out.println("Ingrese numero");
        System.out.println("==►");
        j=sr.nextInt();
          
        
        if(j%2==0){
            System.out.println("El Numero es PAR ☺☻☺☻");
            
        }else
            System.out.println("El numero es IMPAR ♣♣♣♣");
    
}
}