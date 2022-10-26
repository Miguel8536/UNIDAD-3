/*
* @autor Juan Carlos Guillen
*/

package Convertir;



import java.util.Scanner;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class conversor {
    static void prefija(String infija,JTextField mostrarPre){
       
       mostrarPre.setText("  " + infijaAPrefija(infija));
      
     
    }
        static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
        
        
 
        
    static StringBuilder infijaAPrefija(String expression){

       StringBuilder result = new StringBuilder();
       StringBuilder input = new StringBuilder(expression);
       input.reverse();
       Stack<Character> stack = new Stack<>();

       char [] charsExp = new String(input).toCharArray();
       for (int i = 0; i < charsExp.length; i++) {

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            }
            else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i <charsExp.length ; i++) {
            char c = charsExp[i];
            //verificamos si C es operando o operador
            if(precedence(c)>0){
               //cuando es mayor que 0 significa que es un operando
                while(stack.isEmpty()==false && precedence(stack.peek())>precedence(c)){
                    //mientras la pila tenga datos, y 
                    //la precendencia de de la pila sea mayor 
                    //a la precendencia del caracter
                    //se colocan los datos de la pila en el resultado
                    Character dato = stack.pop();
                    result.append(dato);
                                   }
                //Si la pila esta vacia o el operando de la pila es de menor presedencia que 
                // el operando de del caracter se agrega el operando a la pila
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                    while(x!='('){
                    result.append(x);
                    x = stack.pop();
                    }
                }else if(c=='('){
                stack.push(c);
                    }else{
                    //el caracater no es operando ni "("
                    result.append(c);
                    }
        }

        for (int i = 0; i <=stack.size()+1 ; i++) {
           Character dato = stack.pop();
            result.append(dato);
        }
        return result.reverse();
    }
    //POSFIJO
 public static String Infijo2PosfijoTxt(String infijo){
		Pila p1 = Infijo2Posfijo(infijo);
		String text = "";
		while (p1.i > 0)
			text = p1.pop() + text;
		return text;
	}
   public static Pila Infijo2Posfijo(String infijo) {
		infijo +=')'; // Agregamos al final del infijo un &#8216;)&#8217
		int tamaño = infijo.length();
		Pila PilaDefinitiva = new Pila(tamaño);
		Pila PilaTemp = new Pila(tamaño);
		PilaTemp.push('('); // Agregamos a la pila temporal un &#8216;(&#8216;<br />
		for (int i = 0; i < tamaño; i++) {
			char caracter = infijo.charAt(i);
			switch (caracter) {
			case '(':
				PilaTemp.push(caracter);
				break;
			case '+':case '-':case '^':case '*':case '/':
				while (Jerarquia(caracter) <= Jerarquia(PilaTemp.nextPop()))
					PilaDefinitiva.push(PilaTemp.pop());
				PilaTemp.push(caracter);
				break;
			case ')':
				while (PilaTemp.nextPop() != '(')
					PilaDefinitiva.push(PilaTemp.pop());
				PilaTemp.pop();
				break;
			default:
				PilaDefinitiva.push(caracter);
			}
		}
		return PilaDefinitiva;
	}
   public static int Jerarquia(char elemento) {
		int res = 0;
		switch (elemento) {
		case ')':
			res = 5; break;
		case '^':
			res = 4; break;
		case '*': case '/':
			res = 3; break;
		case '+': case '-':
			res = 2; break;
		case '(':
			res = 1; break;
		}
		return res;
	}
   
   public static void main(String[] args){
       System.out.println("Dame la notacion en infijo");
       Scanner leer = new Scanner(System.in);
                String text=leer.nextLine();
		System.out.println("Posfijo : "+ Infijo2PosfijoTxt(text));
   }
}

