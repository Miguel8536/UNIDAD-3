package practica3optimizacion;
import java.util.Scanner;

public class Optimizacion4 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el numero: "); numero = entrada.nextInt();
        if(numero==1){
            System.out.println("Tengo un lagarto");
        }else if(numero == 3){
            System.out.println("Tengo un gato");
        }else if(numero == 5){
            System.out.println("Tengo un loro");
        }else if(numero == 4){
            System.out.println("Tengo una serpiente");
        }else if(numero == 2){
            System.out.println("Tengo un perro");
        }else{
            System.out.println("No tengo masota");
        }
    }
}
