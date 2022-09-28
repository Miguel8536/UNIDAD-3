/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpilasinstack;

/**
 *
 * @author MSI GF65
 */
public class Pila {
    
    int vectorPila[];
    int cima;
    
    public Pila(int tamano) {
        vectorPila = new int[tamano];
        cima = 0;
    }
    
    //METODO INSERTAR
    public void Insertar (int dato) {
        vectorPila[cima] = dato;
        cima++;
    }
    
    //METODO ELIMINAR
    public int Eliminar() {
        int eliminar = 0;
        if(cima == 0) {
        System.out.println("La pila esta vacia");
        } else {
            eliminar = vectorPila[cima];
            cima--;
        }
        return eliminar;
    }
    
    public boolean vacio() {
        if (cima == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int Tamano(){
        return vectorPila.length-1;
    }
}
