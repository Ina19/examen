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
public class frutas {
    public void frutas(){
       int cantidad=0;
       Scanner sr=new Scanner(System.in);
       System.out.println("ingrese cantidad de frutas");
       cantidad=sr.nextInt();
       
       String []fruta=new String[cantidad];
       
       sr.nextLine();
        for (int i = 0; i < fruta.length; i++) {
            System.out.println("ingrese la fruta #"+(i+1));
            fruta[i]=sr.nextLine();
            
        }
        
        for (int i = 0; i < fruta.length; i++) {
           System.out.println(i +"\t"+ fruta[i]);
        }
    }
    
    
}
