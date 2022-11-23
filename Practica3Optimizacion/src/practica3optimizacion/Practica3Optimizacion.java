package practica3optimizacion;

import java.util.Scanner;
public class Practica3Optimizacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0,f,valor,promedio;
        for(f = 1; f <= 10; f++){
            System.out.print("Ingrese valor: ");
            valor = teclado.nextInt();
            suma = suma + valor;
        }
        promedio = suma / 10;
        System.out.print("La suma es: "+suma+"El promedio es: " + promedio);
    }
    
}
