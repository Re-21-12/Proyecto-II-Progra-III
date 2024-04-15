/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
public class NodoOrtogonal {
    private int x;
    private int y;
    private Vehiculo vehiculo;
    private NodoOrtogonal arriba;
    private NodoOrtogonal abajo;
    private NodoOrtogonal izquierda;
    private NodoOrtogonal derecha;

    public NodoOrtogonal() {

    }

    public NodoOrtogonal(Vehiculo vehiculo, int x , int y) {
        this.vehiculo = vehiculo;
        this.x = x;
        this.y = y;
        //inicalmente deben apuntar a nulo
        this.arriba = null;
        this.abajo = null;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public NodoOrtogonal getArriba() {
        return arriba;
    }

    public void setArriba(NodoOrtogonal arriba) {
        this.arriba = arriba;
    }

    public NodoOrtogonal getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoOrtogonal abajo) {
        this.abajo = abajo;
    }

    public NodoOrtogonal getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoOrtogonal izquierda) {
        this.izquierda = izquierda;
    }

    public NodoOrtogonal getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoOrtogonal derecha) {
        this.derecha = derecha;
    }

}
