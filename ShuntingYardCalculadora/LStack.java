
package com.mycompany.ShuntingYardCalculadora;

public class LStack {

    Stack inicio = null;

    public void push(int dato){
        Stack nuevo = new Stack();
        nuevo.dato = (char) dato;
        if(!isEmpty()){
            nuevo.siguiente = inicio;
        }
        inicio = nuevo;
    }
    
    public int pop(){
        int resultado=inicio.dato;
        Stack aux = inicio;
        inicio=inicio.siguiente;
        aux.siguiente = null;
        return resultado;
    }
    
    public int pick(){
        return inicio.dato;
    }
    
    public boolean isEmpty(){
        return inicio==null;
    }
}