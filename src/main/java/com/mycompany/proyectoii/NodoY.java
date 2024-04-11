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
    private int x;//su coordenada en x
    private Vehiculo carro;
    private NodoY izquierda;
    private NodoY derecha;
    //cada nodoo Columna contiene una lista de fila 
    private NodoListaVertical columnas;

    public NodoY(int x,Vehiculo carro) {
        this.x = x;
        this.carro = carro;
        //creamos una columna por cada nodofila
        this.columnas = new NodoListaVertical();
        this.izquierda = this.derecha = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public NodoY getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoY izquierda) {
        this.izquierda = izquierda;
    }

    public NodoY getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoY derecha) {
        this.derecha = derecha;
    }

    public NodoListaVertical getColumnas() {
        return columnas;
    }

    public void setColumnas(NodoListaVertical columnas) {
        this.columnas = columnas;
    }



    
}
