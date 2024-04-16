/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
public class NodoY {
    private int x; // Declara una variable privada x de tipo entero, representa la coordenada en x
    private Vehiculo carro; // Declara una variable privada carro de tipo Vehiculo
    private NodoY izquierda; // Declara una variable privada izquierda de tipo NodoY, representa el nodo ubicado a la izquierda del nodo actual
    private NodoY derecha; // Declara una variable privada derecha de tipo NodoY, representa el nodo ubicado a la derecha del nodo actual
    //cada nodo Columna contiene una lista de fila
    private NodoListaVertical columnas; // Declara una variable privada columnas de tipo NodoListaVertical, representa la lista vertical asociada al nodo actual

    public NodoY(int x,Vehiculo carro) { // Constructor de la clase NodoY con parámetros
        this.x = x; // Inicializa la variable x con el parámetro x
        this.carro = carro; // Inicializa la variable carro con el parámetro carro
        //creamos una columna por cada nodo fila
        this.columnas = new NodoListaVertical(); // Inicializa la variable columnas como una nueva instancia de NodoListaVertical
        this.izquierda = this.derecha = null; // Inicializa las variables izquierda y derecha como nulas
    }

    public int getX() { // Método para obtener el valor de x (coordenada en x)
        return x; // Retorna el valor de x
    }

    public void setX(int x) { // Método para establecer el valor de x (coordenada en x)
        this.x = x; // Asigna el valor de x con el parámetro x
    }

    public Vehiculo getCarro() { // Método para obtener el vehículo asociado al nodo
        return carro; // Retorna el vehículo asociado al nodo
    }

    public void setCarro(Vehiculo carro) { // Método para establecer el vehículo asociado al nodo
        this.carro = carro; // Asigna el vehículo con el parámetro carro
    }

    public NodoY getIzquierda() { // Método para obtener el nodo ubicado a la izquierda del nodo actual
        return izquierda; // Retorna el nodo ubicado a la izquierda del nodo actual
    }

    public void setIzquierda(NodoY izquierda) { // Método para establecer el nodo ubicado a la izquierda del nodo actual
        this.izquierda = izquierda; // Asigna el nodo ubicado a la izquierda del nodo actual
    }

    public NodoY getDerecha() { // Método para obtener el nodo ubicado a la derecha del nodo actual
        return derecha; // Retorna el nodo ubicado a la derecha del nodo actual
    }

    public void setDerecha(NodoY derecha) { // Método para establecer el nodo ubicado a la derecha del nodo actual
        this.derecha = derecha; // Asigna el nodo ubicado a la derecha del nodo actual
    }

    public NodoListaVertical getColumnas() { // Método para obtener la lista vertical asociada al nodo actual
        return columnas; // Retorna la lista vertical asociada al nodo actual
    }

    public void setColumnas(NodoListaVertical columnas) { // Método para establecer la lista vertical asociada al nodo actual
        this.columnas = columnas; // Asigna la lista vertical con el parámetro columnas
    }



    
}
