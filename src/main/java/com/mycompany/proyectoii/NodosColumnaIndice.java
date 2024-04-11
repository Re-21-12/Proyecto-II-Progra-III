/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
//Se mueven en y
public class NodosColumnaIndice {

    private NodoY cabeza;
    private NodoY cola;

    public NodosColumnaIndice() {
        cabeza = cola = null;
    }

    // creamos un método para insertar un nodo al inicio de la lista horizontal
    public void insertarEnHorizontal(NodoY nodoHorizontal) {
        // si la cabeza está vacía, asignamos el nuevo nodo como cabeza y cola
        if (cabeza == null) {
            cabeza = cola = nodoHorizontal;
        } else {
            // si el valor del nuevo nodo es menor que el de la cabeza, lo colocamos al inicio
            if (nodoHorizontal.getX() < cabeza.getX()) {
                cabeza = insertarInicio(nodoHorizontal);
            } // si el valor del nuevo nodo es mayor que el de la cola, lo colocamos al final
            else if (nodoHorizontal.getX() > cola.getX()) {
                cola = insertarFinal(nodoHorizontal);
            } // si no, lo colocamos en medio
            else {
                insertarEnMedio(nodoHorizontal);
            }
        }
    }
    public void eliminarEnHorizontal(NodoY nodoHorizontal) {
        if (cabeza == null) { // si la lista está vacía
            this.cabeza = this.cola = nodoHorizontal; // el nuevo nodo será la cabeza y la cola
        } else { // si la lista no está vacía
            if (nodoHorizontal.getX() < cabeza.getX()) { // si el nuevo nodo es menor que la cabeza
                cabeza = eliminarInicio(); // insertamos el nodo al principio
            } else if (nodoHorizontal.getX() > cola.getX()) { // si el nuevo nodo es mayor que la cola
                cola = eliminarFinal(); // insertamos el nodo al final
            } else { // si el nuevo nodo está entre la cabeza y la cola
                eliminarEnMedio(nodoHorizontal); // insertamos el nodo en medio
            }
        }
    }

    public NodoY eliminarInicio() {
        // Verificamos si la pila está vacía
        if (cabeza == null) {
            System.out.println("La pila está vacía, no se puede eliminar.");
            return null;
        }
        // Avanzamos al segundo elemento  a la izquierda
        //actualizamos el nuevo null
        NodoY nuevoTopeIzquierda = cabeza.getDerecha();
        // Eliminamos el tope actual asignando null como siguiente elemento
        cabeza.setDerecha(null);
        // Retornamos el nuevo tope de la pila
        return nuevoTopeIzquierda;
    }

    public NodoY eliminarFinal() {
        // verificamos si la lista está vacía
        if (cabeza == null) {
            System.out.println("la lista está vacía, no se puede eliminar.");
            return null;
        }
        // si solo hay un elemento en la lista, eliminamos la cabeza
        if (cabeza.getDerecha() == null) {
            NodoY nodoEliminado = cabeza;
            cabeza = null;
            return nodoEliminado;
        }
        // recorremos la lista hasta llegar al penúltimo elemento
        NodoY actual = cabeza;
        while (actual.getDerecha().getDerecha() != null) {
            actual = actual.getDerecha();
        }
        // guardamos una referencia al último nodo
        NodoY nodoEliminado = actual.getDerecha();
        // eliminamos la conexión al último nodo
        actual.setDerecha(null);
        return nodoEliminado;
    }

    public void eliminarEnMedio(NodoY nodoEliminar) {
        // verificamos si la lista está vacía
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }
        // si el nodo a eliminar es igual a la cabeza
        if (nodoEliminar.equals(cabeza)) {
            cabeza = cabeza.getDerecha(); // eliminamos el primer elemento
            return;
        }
        // buscamos el nodo anterior al que queremos eliminar
        NodoY actual = cabeza;
        while (actual != null && actual.getDerecha() != null && !actual.getDerecha().equals(nodoEliminar)) {
            actual = actual.getDerecha();
        }
        // si no encontramos el nodo a eliminar
        if (actual == null || actual.getDerecha() == null) {
            System.out.println("El nodo a eliminar no está en la lista.");
            return;
        }
        // eliminamos la conexión del nodo a eliminar
        actual.setDerecha(actual.getDerecha().getDerecha());
    }

    // creamos un método para colocar un nodo al inicio de la lista horizontal
    private NodoY insertarInicio(NodoY nodoHorizontal) {
        // establecemos los enlaces del nuevo nodo hacia la cabeza y viceversa
        nodoHorizontal.setDerecha(cabeza);
        if (cabeza != null) {
            cabeza.setIzquierda(nodoHorizontal);
        }
        // colocamos el nuevo nodo como cabeza de la lista
        cabeza = nodoHorizontal;
        return cabeza;
    }

    // creamos un método para colocar un nodo al final de la lista horizontal
    private NodoY insertarFinal(NodoY nodoHorizontal) {
        // si la cabeza está vacía, asignamos el nuevo nodo como cola
        if (cabeza == null) {
            return nodoHorizontal;
        }
        // si no está vacía, recorremos la lista hasta llegar al último nodo
        NodoY actual = cabeza;
        while (actual.getDerecha() != null) {
            actual = actual.getDerecha();
        }
        // establecemos los enlaces del último nodo hacia el nuevo nodo y viceversa
        actual.setDerecha(nodoHorizontal);
        nodoHorizontal.setIzquierda(actual);
        // colocamos el nuevo nodo como cola de la lista
        cola = nodoHorizontal;
        return cola;
    }

    // creamos un método para colocar un nodo en medio de la lista horizontal
    private NodoY insertarEnMedio(NodoY nodoHorizontal) {
        // buscamos el nodo después del cual se insertará el nuevo nodo
        NodoY actual = cabeza;
        while (actual != null && nodoHorizontal.getX() > actual.getX()) {
            actual = actual.getDerecha();
        }
        // si no se encuentra el nodo después del cual se insertará el nuevo nodo, no hacemos nada
        if (actual == null) {
            System.out.println("El valor después del cual se desea insertar no se encontró en la lista.");
            return cabeza;
        }
        // insertamos el nuevo nodo después del nodo actual
        NodoY anterior = actual.getIzquierda();
        nodoHorizontal.setDerecha(actual);
        nodoHorizontal.setIzquierda(anterior);
        actual.setIzquierda(nodoHorizontal);
        if (anterior != null) {
            anterior.setDerecha(nodoHorizontal);
        } else {
            cabeza = nodoHorizontal;
        }
        return cabeza;
    }

    

    
    public NodoY buscarEnColumnas(int x) {
        NodoY actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getX() == x) {
                //System.out.println("Encontrado " + actual.getX()); // imprimimos el valor del nodo actual
                return actual;
            }
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        return null;
    }

    public boolean estaDisponibleEnX(int x) {
        boolean bandera = false;
        NodoY actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getX() == x) {
                //System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                bandera = true;
                return bandera;
            }
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        return bandera;
    }

    public NodoY buscarEnColumnasCarroPorPropiedad(String placa, String color, String linea, String propietario) {

        NodoY actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getCarro().getColor().equalsIgnoreCase(color)) {
                System.out.println("Encontrado " + actual.getX()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Encontrado " + actual.getX()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getLinea().equalsIgnoreCase(linea)) {
                System.out.println("Encontrado " + actual.getX()); // imprimimos el valor del nodo actual
                break;
            }
            if (actual.getCarro().getPropietario().equalsIgnoreCase(propietario)) {
                System.out.println("Encontrado " + actual.getX()); // imprimimos el valor del nodo actual
                break;
            }
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        return null;
    }

    // creamos un método para mostrar los nodos de la lista horizontal
    public void mostrarLista() {
        NodoY actual = cabeza;
        System.out.print("|" + "i" + "|"); // imprimimos el valor del nodo actual
        while (actual != null) {
            System.out.print("|" + actual.getX() + "|"); // imprimimos el valor del nodo actual
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        System.out.println(); // agregamos "null" al final de la lista
    }
}
