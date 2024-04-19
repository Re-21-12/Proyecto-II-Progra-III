/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

public class MatrizOrtogonal {

    private NodosFilasIndice filas; // Declara una variable privada filas del tipo NodosFilasIndice
    private NodosColumnaIndice columnas; // Declara una variable privada columnas del tipo NodosColumnaIndice

    public MatrizOrtogonal() { // Constructor de la clase MatrizOrtogonal
        filas = new NodosFilasIndice(); // Inicializa la variable filas con una nueva instancia de NodosFilasIndice
        columnas = new NodosColumnaIndice(); // Inicializa la variable columnas con una nueva instancia de NodosColumnaIndice
    }

    public void insertarEnMatriz(int x, int y, Vehiculo carro) { // Método para insertar un vehículo en la matriz ortogonal
        NodoX tempFila; // Declara una variable tempFila del tipo NodoX
        NodoY tempColumna; // Declara una variable tempColumna del tipo NodoY
        NodoOrtogonal _nodoOrtogonal = new NodoOrtogonal(carro, x, y); // Crea un nuevo NodoOrtogonal con el vehículo y las coordenadas especificadas
        if (filas.estaDisponibleEnX(y) == false) { // Verifica si la fila en la posición y está disponible
            NodoX nodoX = new NodoX(y, carro); // Crea un nuevo NodoX con la coordenada y y el vehículo especificados
            filas.insertarEnVertical(nodoX); // Inserta el nuevo NodoX en la lista vertical de filas
        }
        if (columnas.estaDisponibleEnX(x) == false) { // Verifica si la columna en la posición x está disponible
            NodoY nodoY = new NodoY(x, carro); // Crea un nuevo NodoY con la coordenada x y el vehículo especificados
            columnas.insertarEnHorizontal(nodoY); // Inserta el nuevo NodoY en la lista horizontal de columnas
        }
        tempFila = filas.buscarEnFilas(y); // Busca el NodoX correspondiente a la coordenada y
        tempColumna = columnas.buscarEnColumnas(x); // Busca el NodoY correspondiente a la coordenada x

        tempFila.getFilas().insertarEnHorizontal(_nodoOrtogonal); // Inserta el nuevo NodoOrtogonal en la lista horizontal del NodoX encontrado
        tempColumna.getColumnas().insertarEnVertical(_nodoOrtogonal); // Inserta el nuevo NodoOrtogonal en la lista vertical del NodoY encontrado
        tempFila.getFilas().mostrarLista();
        tempColumna.getColumnas().mostrarLista();
    }

    //falta implementar
    public void eliminarEnMatriz(int x, int y) { // Método para eliminar un vehículo de la matriz ortogonal
        NodoX tempFila; // Declara una variable tempFila del tipo NodoX
        NodoY tempColumna; // Declara una variable tempColumna del tipo NodoY
        tempFila = filas.buscarEnFilas(y); // Busca el NodoX correspondiente a la coordenada y
        tempColumna = columnas.buscarEnColumnas(x); // Busca el NodoY correspondiente a la coordenada x
        if (tempFila == null || tempColumna == null) { // Verifica si no se encontró el vehículo en las coordenadas especificadas
            System.out.println("No se ha encontrado el dato"); // Imprime un mensaje indicando que no se encontró el dato
        } else {
            System.out.println("Se ha eliminado el vehiculo"); // Imprime un mensaje indicando que se ha eliminado el vehículo
            System.out.println(tempFila.getCarro()); // Imprime el vehículo contenido en el NodoX encontrado
        }
        filas.eliminarEnVertical(tempFila); // Elimina el NodoX correspondiente de la lista vertical de filas
        columnas.eliminarEnHorizontal(tempColumna); // Elimina el NodoY correspondiente de la lista horizontal de columnas
    }

    public void eliminarEnMatrizPorPropiedad(String placa, String color, String linea, String propietario, String modelo) { // Método para eliminar un vehículo de la matriz ortogonal por sus propiedades
        NodoX tempFila; // Declara una variable tempFila del tipo NodoX
        NodoY tempColumna; // Declara una variable tempColumna del tipo NodoY
        tempFila = filas.buscarEnFilasCarroPorPropiedad(placa, color, linea, propietario, modelo); // Busca el NodoX correspondiente al vehículo por sus propiedades
        tempColumna = columnas.buscarEnColumnasCarroPorPropiedad(placa, color, linea, propietario, modelo); // Busca el NodoY correspondiente al vehículo por sus propiedades
        if (tempFila == null || tempColumna == null) { // Verifica si no se encontró el vehículo en las coordenadas especificadas
            System.out.println("No se ha encontrado el dato"); // Imprime un mensaje indicando que no se encontró el dato
        } else {
            System.out.println("Se ha eliminado el vehiculo"); // Imprime un mensaje indicando que se ha eliminado el vehículo
            System.out.println(tempFila.getCarro()); // Imprime el vehículo contenido en el NodoX encontrado
        }
        filas.eliminarEnVertical(tempFila); // Elimina el NodoX correspondiente de la lista vertical de filas
        columnas.eliminarEnHorizontal(tempColumna); // Elimina el NodoY correspondiente de la lista horizontal de columnas
    }

    public void buscarEnMatriz(int x, int y) { // Método para buscar un vehículo en la matriz ortogonal por sus coordenadas
        NodoX carroEnX = filas.buscarEnFilas(y); // Busca el NodoX correspondiente a la coordenada y
        NodoY carroEnY = columnas.buscarEnColumnas(x); // Busca el NodoY correspondiente a la coordenada x

        if (carroEnX != null && carroEnY != null) { // Verifica si se encontró el vehículo en las coordenadas especificadas
            System.out.println("Se ha encontrado el vehiculo"); // Imprime un mensaje indicando que se ha encontrado el vehículo
            System.out.println(carroEnX.getCarro()); // Imprime el vehículo contenido en el NodoX encontrado
        } else {
            System.out.println("No se ha encontrado el vehiculo"); // Imprime un mensaje indicando que no se ha encontrado el vehículo
        }
    }

    public void buscarEnMatrizPorCarro(String placa, String color, String linea, String propietario, String modelo) { // Método para buscar un vehículo en la matriz ortogonal por sus propiedades
        NodoX carroEnX = filas.buscarEnFilasCarroPorPropiedad(placa, color, linea, propietario, modelo); // Busca el NodoX correspondiente al vehículo por sus propiedades
        NodoY carroEnY = columnas.buscarEnColumnasCarroPorPropiedad(placa, color, linea, propietario, modelo); // Busca el NodoY correspondiente al vehículo por sus propiedades
        if (carroEnX != null && carroEnY != null) { // Verifica si se encontró el vehículo en las coordenadas especificadas
            System.out.println("Se ha encontrado el vehiculo"); // Imprime un mensaje indicando que se ha encontrado el vehículo
            System.out.println(carroEnX.getCarro()); // Imprime el vehículo contenido en el NodoX encontrado
        } else {
            System.out.println("No se ha encontrado el vehiculo"); // Imprime un mensaje indicando que no se ha encontrado el vehículo
        }

    }

    public void mostrarMatriz() { // Método para mostrar la matriz ortogonal
        columnas.mostrarLista(); // Muestra la lista horizontal de columnas
        filas.mostrarLista(); // Muestra la lista vertical de filas
    }
    /*  public void probar(int x, int y) {
        int c = 0;
        for (int j = 0; j <= y; j++) {
            for (int i = 0; i <= x; i++) {
                insertarEnMatriz(j, i, new Vehiculo(String.valueOf(c), String.valueOf(c), String.valueOf(c), String.valueOf(c), String.valueOf(c)));
                c++;
            }
        }
    }
     */
}
