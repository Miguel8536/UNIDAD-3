/*
* @author MSI GF65
*/
package Convertir;

import java.util.Scanner;
import java.util.Stack;

public class conversor {
  public static void main(String arg[]){
        Scanner x=new Scanner(System.in);
        
        String Infija=x.next();
        
        String sali="";
        
        Stack <Character>p=new <Character>Stack();
        
        
        for(int i=0; i<Infija.length(); i++){
            if(Infija.charAt(i)>='0' & Infija.charAt(i)<='9') 
                sali=sali+Infija.charAt(i);
            if(Infija.charAt(i)>='A' & Infija.charAt(i)<='Z') 
                sali=sali+Infija.charAt(i);
            if(Infija.charAt(i)>='a' & Infija.charAt(i)<='z') 
                sali=sali+Infija.charAt(i);
            if (Infija.charAt(i)>='*' & Infija.charAt(i)<='/')
                p.push(Infija.charAt(i));
            if (Infija.charAt(i)==')') 
                sali=sali+p.pop(); 
            
        }
        while(!p.isEmpty()) // Mientras la pila no este vacia
            sali=sali+p.pop();
        
        System.out.println("Salida: "+sali);
        
    }
}
    



