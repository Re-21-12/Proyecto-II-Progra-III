/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
public class MatrizOrtogonal {

    private NodosFilasIndice filas;
    private NodosColumnaIndice columnas;

    public MatrizOrtogonal() {
        filas = new NodosFilasIndice();
        columnas = new NodosColumnaIndice();
    }

    public void insertarEnMatriz(int x, int y, Vehiculo carro) {
        //Si me trae falso es por que esta vacioo
        NodoX tempFila;
        NodoY tempColumna;
        NodoOrtogonal _nodoOrtogonal = new NodoOrtogonal(carro, x, y);
        if (filas.estaDisponibleEnX(y) == false) {
            NodoX nodoX = new NodoX(y, carro);
            filas.insertarEnVertical(nodoX);
        }
        if (columnas.estaDisponibleEnX(x) == false) {
            NodoY nodoY = new NodoY(x, carro);
            columnas.insertarEnHorizontal(nodoY);
        }
        tempFila = filas.buscarEnFilas(y);
        tempColumna = columnas.buscarEnColumnas(x);

        tempFila.getFilas().insertarEnHorizontal(_nodoOrtogonal);
        tempColumna.getColumnas().insertarEnVertical(_nodoOrtogonal);
    }

    //falta implementar
    public void eliminarEnMatriz(int x, int y) {
        //Si me trae falso es por que esta vacioo
        NodoX tempFila;
        NodoY tempColumna;
        tempFila = filas.buscarEnFilas(y);
        tempColumna = columnas.buscarEnColumnas(x);
        if(tempFila == null || tempColumna==null){
            System.out.println("No se ha encontrado el dato");
        }
        
        filas.eliminarEnVertical(tempFila);
        columnas.eliminarEnHorizontal(tempColumna);
    }
    
     public void eliminarEnMatrizPorPropiedad(String placa, String color, String linea, String propietario,String modelo) {
        //Si me trae falso es por que esta vacioo
        NodoX tempFila;
        NodoY tempColumna;
        tempFila = filas.buscarEnFilasCarroPorPropiedad(placa, color, linea, propietario, modelo);
        tempColumna = columnas.buscarEnColumnasCarroPorPropiedad(placa, color, linea, propietario, modelo);
        if(tempFila == null || tempColumna==null){  
            System.out.println("No se ha encontrado el dato");
        }
        
        filas.eliminarEnVertical(tempFila);
        columnas.eliminarEnHorizontal(tempColumna);
    }

    public void buscarEnMatriz(int x, int y, Vehiculo carro) {
        //Si me trae falso es por que esta vacioo
        filas.buscarEnFilas(y);//->private NodosFilasIndice filas;
        columnas.buscarEnColumnas(x);//->private NodosColumnaIndice columnas;
    }

    public void buscarEnMatrizPorCarro(String placa, String color, String linea, String propietario,String modelo) {
        //Si me trae falso es por que esta vacioo
        filas.buscarEnFilasCarroPorPropiedad(placa, color, linea, propietario, modelo);//->private NodosFilasIndice filas;
        columnas.buscarEnColumnasCarroPorPropiedad(placa, color, linea, propietario,modelo);//->private NodosColumnaIndice columnas;
    }

    public void mostrarMatriz() {
        //Si me trae falso es por que esta vacioo
        columnas.mostrarLista();
        filas.mostrarLista();

    }

}
