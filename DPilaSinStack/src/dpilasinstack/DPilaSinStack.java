/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpilasinstack;
import java.util.Scanner;
/**
 *
 * @author MSI GF65
 */
public class DPilaSinStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO A LA PILA");
        System.out.println("Digite el tamano de la pila");
        
        int tamano = leer.nextInt();
        int dato = 0, opc = 0;
        
        Pila a = new Pila(tamano);
        
        do {
            System.out.println("Que desea hacer? ");
            System.out.println("1. PUSH --- 2. POP --- 3. SABER SI ESTA VACIA ---");
            System.out.println("4. TAMANO --- 5. SALIR --- ");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("INSERTE DATO");
                    a.Insertar(dato = leer.nextInt());
                    System.out.println("DATO INSERTADO");
                    System.out.println("");
                    break;
                case 2:
                    a.Eliminar();
                    break;
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(a.Tamano());
                    System.out.println("");
                    break;
            }
        }while (opc != 5);
    }
    
}
