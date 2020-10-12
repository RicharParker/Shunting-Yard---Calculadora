
package com.mycompany.ShuntingYardCalculadora;

public class LQueue {

    Queue inicio = null;
    Queue fin = null;

    public void add(char dato) {
        Queue nuevo = new Queue();
        nuevo.dato = dato;
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }

    public void recorre() {
        Queue aux = fin;
        while (aux != null) {
            System.out.print(aux.dato + " ");
            //System.out.println(aux.dat);
            aux = aux.anterior;
        }
    }

    public int sacar() {

        if (fin != null) {
            Queue aux = fin;
            int resultado = aux.dato;
            if (fin.anterior != null) {
                fin = fin.anterior;
                fin.siguiente = null;
                aux.anterior = null;
            } else {
                fin = null;
            }
            return resultado;
        }
        return 0;

    }

    public boolean isEmpty() {
        return (inicio == null) && (fin == null);
    }

}