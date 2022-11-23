package practica3optimizacion;
import java.util.Scanner;

public class Optimizacion3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2;
        System.out.print("Escriba el segundo entero: "); numero2 = entrada.nextInt();
        System.out.printf("Escriba el primer entero: "); numero1 = entrada.nextInt();
        if(numero1==numero2)
            System.out.printf("%d==%d\n",numero1,numero2);
        if(numero1!=numero2)
            System.out.printf(numero1+"!="+numero2);
            System.out.printf("\n");
        if(numero1<numero2)
            System.out.printf("%d<%d\n",numero1,numero2);
        if(numero1>numero2)
            System.out.printf(numero1+">"+numero2);
            System.out.printf("\n");
        if(numero1<=numero2)
            System.out.printf("%d<=%d\n",numero1,numero2);
        if(numero1>=numero2)
            System.out.printf(numero1+">="+numero2);
            System.out.printf("\n");
    }
}
