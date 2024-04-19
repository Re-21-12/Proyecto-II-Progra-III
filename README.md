# Proyecto 1, Programacion 3
**Integrantes:**

Victor Alfredo Macario Enriquez

Jose Leonel Salazar Tejeda

Marvin Geobany Reyna Ortega


## Descripcion de Proyecto

Consiste en crear una matriz ortogonal o lista ortogonal es decir utilizar listas enlazadas para ir creando una matriz dinámica. Por lo que cada nodo debe contener datos de vehículos las cuales son: placa, color, linea, modelo, propietario y los opciones que debe contener son: insertar, buscar y eliminar. La búsqueda no debe limitarse por una solo propiedad.

### Clases del Proyecto en Java

* MatrizOrtogonal.java

* NodoListaHorizontal.java

* NodoListaVertical.java

* NodoOrtogonal.java

* NodoX.java

* NodoY.java

* NodosColumnaIndice.java

* NodosFilasIndice.java

* ProyectoII.java

* Vehiculo.java

### MatrizOrtogonal.java

La clase MatrizOrtogonal es la implementación de una estructura de datos que representa una matriz ortogonal.

```java
/**
 * La clase MatrizOrtogonal representa una matriz ortogonal que contiene vehículos en posiciones específicas.
 * Permite insertar, eliminar y buscar vehículos por coordenadas o por propiedades.
 */
public class MatrizOrtogonal {

    private NodosFilasIndice filas; // Lista de nodos que representan las filas de la matriz
    private NodosColumnaIndice columnas; // Lista de nodos que representan las columnas de la matriz

    /**
     * Constructor de la clase MatrizOrtogonal.
     * Inicializa las listas de filas y columnas.
     */
    public MatrizOrtogonal() {
        filas = new NodosFilasIndice(); // Inicializa la lista de filas
        columnas = new NodosColumnaIndice(); // Inicializa la lista de columnas
    }

    /**
     * Inserta un vehículo en la matriz ortogonal en la posición especificada.
     *    x La coordenada x del vehículo.
     *    y La coordenada y del vehículo.
     *    carro El vehículo a insertar.
     */
    public void insertarEnMatriz(int x, int y, Vehiculo carro) {
        // Lógica para insertar un vehículo en la matriz ortogonal
    }

    /**
     * Elimina un vehículo de la matriz ortogonal en la posición especificada.
     *    x La coordenada x del vehículo a eliminar.
     *    y La coordenada y del vehículo a eliminar.
     */
    public void eliminarEnMatriz(int x, int y) {
        // Lógica para eliminar un vehículo de la matriz ortogonal
    }

    /**
     * Elimina un vehículo de la matriz ortogonal por sus propiedades.
     *    placa La placa del vehículo a eliminar.
     *    color El color del vehículo a eliminar.
     *    linea La línea del vehículo a eliminar.
     *    propietario El propietario del vehículo a eliminar.
     *    modelo El modelo del vehículo a eliminar.
     */
    public void eliminarEnMatrizPorPropiedad(String placa, String color, String linea, String propietario, String modelo) {
        // Lógica para eliminar un vehículo de la matriz ortogonal por sus propiedades
    }

    /**
     * Busca un vehículo en la matriz ortogonal por sus coordenadas.
     * La coordenada x del vehículo a buscar.
     * La coordenada y del vehículo a buscar.
     */
    public void buscarEnMatriz(int x, int y) {
        // Lógica para buscar un vehículo en la matriz ortogonal por coordenadas
    }

    /**
     * Busca un vehículo en la matriz ortogonal por sus propiedades.
     *    placa La placa del vehículo a buscar.
     *    color El color del vehículo a buscar.
     *    linea La línea del vehículo a buscar.
     *    propietario El propietario del vehículo a buscar.
     *    modelo El modelo del vehículo a buscar.
     */
    public void buscarEnMatrizPorCarro(String placa, String color, String linea, String propietario, String modelo) {
        // Lógica para buscar un vehículo en la matriz ortogonal por sus propiedades
    }

    /**
     * Muestra la matriz ortogonal.
     */
    public void mostrarMatriz() {
        // Lógica para mostrar la matriz ortogonal
    }
}

```

### NodoListaHorizontal.java

Proporciona una implementación de una lista enlazada horizontal que se utiliza para mantener el orden de las filas en una matriz ortogonal. Permite la inserción de nuevos nodos en la lista de manera ordenada y facilita la visualización de los valores de la lista en orden.

```java
/**
 * La clase NodoListaHorizontal representa un nodo de una lista enlazada horizontal.
 * Cada nodo contiene un valor y enlaces a los nodos izquierdo y derecho.
 */
public class NodoListaHorizontal {

    private NodoOrtogonal cabeza; // Nodo que representa la cabeza de la lista horizontal
    private NodoOrtogonal cola; // Nodo que representa la cola de la lista horizontal

    /**
     * Constructor de la clase NodoListaHorizontal.
     * Inicializa la cabeza y la cola como nulos.
     */
    public NodoListaHorizontal() {
        this.cabeza = this.cola = null; // Inicializa la cabeza y la cola como nulos
    }

    /**
     * Inserta un nodo en la lista horizontal.
     *   nodoHorizontal El nodo a insertar.
     * La inserción puede ocurrir al inicio, final o en medio de la lista,
     * dependiendo del valor del nodo a insertar.
     * Si la cabeza está vacía, el nuevo nodo se convierte en la cabeza y la cola.
     * Si el valor del nuevo nodo es menor que el de la cabeza, se inserta al inicio.
     * Si el valor del nuevo nodo es mayor que el de la cola, se inserta al final.
     * Si el valor del nuevo nodo está entre el de la cabeza y la cola, se inserta en medio.
     */
    public void insertarEnHorizontal(NodoOrtogonal nodoHorizontal) {
        // La inserción depende del valor del nodo a insertar
        // Si la cabeza está vacía, el nuevo nodo se convierte en la cabeza y la cola
        // Si el valor del nuevo nodo es menor que el de la cabeza, se inserta al inicio
        // Si el valor del nuevo nodo es mayor que el de la cola, se inserta al final
        // Si el valor del nuevo nodo está entre el de la cabeza y la cola, se inserta en medio
    }

    /**
     * Muestra los valores de la lista horizontal.
     * La lista se muestra desde la cabeza hasta la cola.
     */
    public void mostrarLista() {
        // Muestra los valores de la lista horizontal desde la cabeza hasta la cola
    }

    // Métodos privados de inserción en el inicio, final y medio de la lista
}

```

### NodoListaVertical.java

Proporciona una implementación de una lista enlazada vertical que se utiliza para mantener el orden de las columnas en una matriz ortogonal. Permite la inserción de nuevos nodos en la lista de manera ordenada y facilita la visualización de los valores de la lista en orden.

```java
/**
 * Clase NodoListaVertical: Representa un nodo de una lista enlazada vertical.
 * Cada nodo contiene un valor y enlaces al nodo superior e inferior.
 */
public class NodoListaVertical {

    private NodoOrtogonal cabeza; // Nodo que representa el primer elemento de la lista vertical
    private NodoOrtogonal cola; // Nodo que representa el último elemento de la lista vertical

    /**
     * Constructor de la clase NodoListaVertical.
     * Inicializa la cabeza y la cola como nulos.
     */
    public NodoListaVertical() {
        this.cabeza = this.cola = null; // Inicializa la cabeza y la cola como nulos
    }

    /**
     * Inserta un nodo en la lista vertical.
     *   nodoVertical El nodo a insertar.
     * La inserción puede ocurrir al inicio, final o en medio de la lista,
     * dependiendo del valor del nodo a insertar.
     * Si la cabeza está vacía, el nuevo nodo se convierte en la cabeza y la cola.
     * Si el valor del nuevo nodo es menor que el de la cabeza, se inserta al inicio.
     * Si el valor del nuevo nodo es mayor que el de la cola, se inserta al final.
     * Si el valor del nuevo nodo está entre el de la cabeza y la cola, se inserta en algún lugar intermedio.
     */
    public void insertarEnVertical(NodoOrtogonal nodoVertical) {
        // Método para insertar un nodo en la lista vertical
    }

    /**
     * Muestra los valores de la lista vertical.
     * La lista se muestra desde la cabeza hasta la cola.
     */
    public void mostrarLista() {
        // Método para mostrar los valores de la lista vertical
    }

    // Métodos privados de inserción en el inicio, final y medio de la lista
}

```

### NodoOrtogonal.java

Encapsula la información de un nodo en una matriz ortogonal y proporciona métodos para acceder y modificar esta información, así como para manejar las referencias a otros nodos en la matriz.

```java
/**
 * Clase NodoOrtogonal: Representa un nodo en una matriz ortogonal.
 * Cada nodo contiene un valor (coordinadas x e y) y puede contener un objeto Vehículo.
 * Además, cada nodo tiene referencias a otros nodos ubicados arriba, abajo, izquierda y derecha en la matriz.
 */
public class NodoOrtogonal {

    private int x; // Coordenada x del nodo en la matriz
    private int y; // Coordenada y del nodo en la matriz
    private Vehiculo vehiculo; // Vehículo asociado al nodo (puede ser null si no hay vehículo)
    private NodoOrtogonal arriba; // Nodo ubicado arriba en la matriz
    private NodoOrtogonal abajo; // Nodo ubicado abajo en la matriz
    private NodoOrtogonal izquierda; // Nodo ubicado a la izquierda en la matriz
    private NodoOrtogonal derecha; // Nodo ubicado a la derecha en la matriz

    /**
     * Constructor vacío de la clase NodoOrtogonal.
     */
    public NodoOrtogonal() {
        // Constructor vacío
    }

    /**
     * Constructor de la clase NodoOrtogonal con parámetros.
     * Inicializa las coordenadas x e y del nodo, así como el vehículo asociado (si lo hay).
     * También inicializa las referencias a los nodos ubicados arriba, abajo, izquierda y derecha como nulas.
     * El vehículo asociado al nodo (puede ser null).
     * La coordenada x del nodo en la matriz.
     * La coordenada y del nodo en la matriz.
     */
    public NodoOrtogonal(Vehiculo vehiculo, int x , int y) {
        this.vehiculo = vehiculo; // Inicializa el vehículo asociado al nodo
        this.x = x; // Inicializa la coordenada x del nodo
        this.y = y; // Inicializa la coordenada y del nodo
        this.arriba = null; // Inicializa la referencia al nodo ubicado arriba como nula
        this.abajo = null; // Inicializa la referencia al nodo ubicado abajo como nula
        this.izquierda = null; // Inicializa la referencia al nodo ubicado a la izquierda como nula
        this.derecha = null; // Inicializa la referencia al nodo ubicado a la derecha como nula
    }

    // Métodos getter y setter para acceder y modificar las propiedades del nodo
}

```

### NodoX.java

Encapsula la información de un nodo en el eje Y de una matriz ortogonal y proporciona métodos para acceder y modificar esta información, así como para manejar las referencias a otros nodos en la matriz.

```java
/**
 * Clase NodoX: Representa un nodo en la estructura de una matriz ortogonal en el eje Y.
 * Cada nodo contiene un valor (coordenada en Y) y puede contener un objeto Vehículo.
 * Además, cada nodo tiene referencias a otros nodos ubicados arriba y abajo en la matriz,
 * así como una lista horizontal asociada que contiene los nodos en el mismo nivel en el eje X.
 */
public class NodoX {

    private Vehiculo carro; // Vehículo asociado al nodo (puede ser null si no hay vehículo)
    private int y; // Coordenada en el eje Y del nodo en la matriz
    private NodoX arriba; // Nodo ubicado arriba en la matriz
    private NodoX abajo; // Nodo ubicado abajo en la matriz
    private NodoListaHorizontal filas; // Lista horizontal asociada al nodo

    /**
     * Constructor de la clase NodoX con parámetros.
     * Inicializa la coordenada en Y del nodo y el vehículo asociado (si lo hay).
     * También inicializa la lista horizontal asociada como una nueva instancia de NodoListaHorizontal.
     * @param y La coordenada en Y del nodo en la matriz.
     * @param carro El vehículo asociado al nodo (puede ser null).
     */
    public NodoX(int y, Vehiculo carro) {
        this.y = y; // Inicializa la coordenada en Y del nodo
        this.carro = carro; // Inicializa el vehículo asociado al nodo
        this.filas = new NodoListaHorizontal(); // Inicializa la lista horizontal asociada como una nueva instancia de NodoListaHorizontal
        this.arriba = this.abajo = null; // Inicializa las referencias a nodos arriba y abajo como nulas
    }

    // Métodos getter y setter para acceder y modificar las propiedades del nodo
}

```

### NodoY.java

Encapsula la información de un nodo en el eje X de una matriz ortogonal y proporciona métodos para acceder y modificar esta información, así como para manejar las referencias a otros nodos en la matriz.

```java
/**
 * Clase NodoY: Representa un nodo en la estructura de una matriz ortogonal en el eje X.
 * Cada nodo contiene un valor (coordenada en X) y puede contener un objeto Vehículo.
 * Además, cada nodo tiene referencias a otros nodos ubicados a la izquierda y a la derecha en la matriz,
 * así como una lista vertical asociada que contiene los nodos en el mismo nivel en el eje Y.
 */
public class NodoY {

    private int x; // Coordenada en el eje X del nodo en la matriz
    private Vehiculo carro; // Vehículo asociado al nodo (puede ser null si no hay vehículo)
    private NodoY izquierda; // Nodo ubicado a la izquierda en la matriz
    private NodoY derecha; // Nodo ubicado a la derecha en la matriz
    private NodoListaVertical columnas; // Lista vertical asociada al nodo

    /**
     * Constructor de la clase NodoY con parámetros.
     * Inicializa la coordenada en X del nodo y el vehículo asociado (si lo hay).
     * También inicializa la lista vertical asociada como una nueva instancia de NodoListaVertical.
     * @param x La coordenada en X del nodo en la matriz.
     * @param carro El vehículo asociado al nodo (puede ser null).
     */
    public NodoY(int x, Vehiculo carro) {
        this.x = x; // Inicializa la coordenada en X del nodo
        this.carro = carro; // Inicializa el vehículo asociado al nodo
        this.columnas = new NodoListaVertical(); // Inicializa la lista vertical asociada como una nueva instancia de NodoListaVertical
        this.izquierda = this.derecha = null; // Inicializa las referencias a nodos izquierda y derecha como nulas
    }

    // Métodos getter y setter para acceder y modificar las propiedades del nodo
}
```

### NodosColumnaIndice.java

Representa una lista de nodos en el eje Y de una matriz ortogonal. Cada nodo en la lista contiene un valor (coordenada en Y) y una lista vertical asociada que contiene los nodos en el mismo nivel en el eje X de la matriz. La lista está organizada de manera que los nodos se insertan en orden ascendente según sus valores. La clase proporciona métodos para insertar, eliminar y buscar nodos en el eje Y de la matriz, así como otras operaciones útiles para manipular la lista.

```java
/**
 * Clase NodosColumnaIndice: Representa una lista de nodos en el eje Y de una matriz ortogonal.
 * Cada nodo en la lista contiene un valor (coordenada en Y) y una lista vertical asociada que contiene
 * los nodos en el mismo nivel en el eje X de la matriz.
 * La lista está organizada de manera que los nodos se insertan en orden ascendente según sus valores.
 * Además, la lista proporciona métodos para insertar, eliminar y buscar nodos en el eje Y de la matriz.
 */
public class NodosColumnaIndice {

    private NodoY cabeza; // Nodo que representa el inicio de la lista
    private NodoY cola; // Nodo que representa el final de la lista

    /**
     * Constructor de la clase NodosColumnaIndice.
     * Inicializa la cabeza y la cola de la lista como nulas.
     */
    public NodosColumnaIndice() {
        cabeza = cola = null;
    }

    /**
     * Método para insertar un nodo en la lista en orden ascendente según el valor de la coordenada en Y.
     * Si la lista está vacía, el nodo se coloca como cabeza y cola.
     * Si el valor del nuevo nodo es menor que el de la cabeza, se inserta al inicio.
     * Si el valor del nuevo nodo es mayor que el de la cola, se inserta al final.
     * Si no, se inserta en medio de la lista.
     * @param nodoHorizontal El nodo que se desea insertar en la lista.
     */
    public void insertarEnHorizontal(NodoY nodoHorizontal) {
        // Implementación del método insertarEnHorizontal
    }

    /**
     * Método para eliminar un nodo de la lista en el eje Y.
     * Si la lista está vacía, no se realiza ninguna operación.
     * Si el nodo a eliminar es el primero de la lista, se elimina y se actualiza la cabeza.
     * Si el nodo a eliminar es el último de la lista, se elimina y se actualiza la cola.
     * Si no, se elimina el nodo en medio de la lista.
     * @param nodoHorizontal El nodo que se desea eliminar de la lista.
     */
    public void eliminarEnHorizontal(NodoY nodoHorizontal) {
        // Implementación del método eliminarEnHorizontal
    }

    // Otros métodos para insertar, eliminar y buscar nodos en la lista horizontal...

    /**
     * Método para buscar un nodo en la lista en el eje Y según su valor de coordenada en X.
     * @param x El valor de coordenada en X del nodo que se desea buscar.
     * @return El nodo encontrado, o null si no se encuentra.
     */
    public NodoY buscarEnColumnas(int x) {
        // Implementación del método buscarEnColumnas
    }

    /**
     * Método para verificar si existe un nodo con la coordenada en X especificada en la lista.
     * @param x El valor de coordenada en X que se desea verificar.
     * @return true si existe un nodo con la coordenada en X especificada, false de lo contrario.
     */
    public boolean estaDisponibleEnX(int x) {
        // Implementación del método estaDisponibleEnX
    }

    // Otros métodos para buscar nodos en la lista, mostrar la lista, etc.
}

```

### NodosFilasIndice.java

Representa una lista de nodos en el eje X de una matriz ortogonal. Cada nodo en la lista contiene un valor (coordenada en X) y una lista horizontal asociada que contiene los nodos en el mismo nivel en el eje Y de la matriz. La lista está organizada de manera que los nodos se insertan en orden ascendente según sus valores. La clase proporciona métodos para insertar, eliminar y buscar nodos en el eje X de la matriz, así como otras operaciones útiles para manipular la lista.

```java
/**
 * Clase NodosFilasIndice: Representa una lista de nodos en el eje X de una matriz ortogonal.
 * Cada nodo en la lista contiene un valor (coordenada en X) y una lista horizontal asociada que contiene
 * los nodos en el mismo nivel en el eje Y de la matriz.
 * La lista está organizada de manera que los nodos se insertan en orden ascendente según sus valores.
 * Además, la lista proporciona métodos para insertar, eliminar y buscar nodos en el eje X de la matriz.
 */
public class NodosFilasIndice {

    private NodoX cabeza; // Nodo que representa el inicio de la lista
    private NodoX cola; // Nodo que representa el final de la lista

    /**
     * Constructor de la clase NodosFilasIndice.
     * Inicializa la cabeza y la cola de la lista como nulas.
     */
    public NodosFilasIndice() {
        cabeza = cola = null;
    }

    /**
     * Método para insertar un nodo en la lista en orden ascendente según el valor de la coordenada en X.
     * Si la lista está vacía, el nodo se coloca como cabeza y cola.
     * Si el valor del nuevo nodo es menor que el de la cabeza, se inserta al inicio.
     * Si el valor del nuevo nodo es mayor que el de la cola, se inserta al final.
     * Si no, se inserta en medio de la lista.
     * @param nodoVertical El nodo que se desea insertar en la lista.
     */
    public void insertarEnVertical(NodoX nodoVertical) {
        // Implementación del método insertarEnVertical
    }

    /**
     * Método para eliminar un nodo de la lista en el eje X.
     * Si la lista está vacía, no se realiza ninguna operación.
     * Si el nodo a eliminar es el primero de la lista, se elimina y se actualiza la cabeza.
     * Si el nodo a eliminar es el último de la lista, se elimina y se actualiza la cola.
     * Si no, se elimina el nodo en medio de la lista.
     * @param nodoVertical El nodo que se desea eliminar de la lista.
     */
    public void eliminarEnVertical(NodoX nodoVertical) {
        // Implementación del método eliminarEnVertical
    }

    // Otros métodos para insertar, eliminar y buscar nodos en la lista vertical...

    /**
     * Método para buscar un nodo en la lista en el eje X según su valor de coordenada en Y.
     * @param y El valor de coordenada en Y del nodo que se desea buscar.
     * @return El nodo encontrado, o null si no se encuentra.
     */
    public NodoX buscarEnFilas(int y) {
        // Implementación del método buscarEnFilas
    }

    /**
     * Método para buscar un nodo en la lista en el eje X según propiedades de un vehículo.
     * @param placa La placa del vehículo que se desea buscar.
     * @param color El color del vehículo que se desea buscar.
     * @param linea La línea del vehículo que se desea buscar.
     * @param propietario El propietario del vehículo que se desea buscar.
     * @param modelo El modelo del vehículo que se desea buscar.
     * @return El nodo encontrado, o null si no se encuentra.
     */
    public NodoX buscarEnFilasCarroPorPropiedad(String placa, String color, String linea, String propietario, String modelo) {
        // Implementación del método buscarEnFilasCarroPorPropiedad
    }

    /**
     * Método para verificar si existe un nodo con la coordenada en Y especificada en la lista.
     * @param y El valor de coordenada en Y que se desea verificar.
     * @return true si existe un nodo con la coordenada en Y especificada, false de lo contrario.
     */
    public boolean estaDisponibleEnX(int y) {
        // Implementación del método estaDisponibleEnX
    }

    // Método para mostrar la lista
    public void mostrarLista() {
        // Implementación del método mostrarLista
    }
}

```

### ProyectoII.java

La clase ProyectoII es la clase principal que proporciona una interfaz de usuario para interactuar con una matriz ortogonal que contiene vehículos representados por la clase Vehiculo.

Atributos:
matrizDinamica: Una instancia de la clase MatrizOrtogonal que representa la matriz ortogonal que contiene los vehículos.
random: Un objeto de la clase Random utilizado para generar números aleatorios.
entrada: Un objeto de la clase Scanner utilizado para leer la entrada del usuario desde la consola.
opcion: Un entero que almacena la opción seleccionada por el usuario en el menú.
x, y: Enteros que almacenan las coordenadas del vehículo ingresado por el usuario.
aleatorio: Una cadena que indica si el usuario desea ingresar las coordenadas de manera aleatoria.
continuar: Una cadena que indica si el usuario desea continuar realizando operaciones después de cada acción.
porCoordenada: Una cadena que indica si el usuario desea buscar o eliminar vehículos por coordenadas.


Métodos:
main(String[] args): El método principal que ejecuta la lógica principal del programa. Muestra un menú de opciones y permite al usuario realizar acciones como ingresar un nuevo vehículo, buscar un vehículo o eliminar un vehículo.
ingresarDatosCarro(): Un método estático que solicita al usuario ingresar los datos de un nuevo vehículo y devuelve un objeto Vehiculo con esos datos.
buscarDatosCarro(MatrizOrtogonal matrizDinamica): Un método estático que permite al usuario buscar un vehículo en la matriz ortogonal utilizando diferentes criterios como placa, color, línea, modelo o nombre del propietario.
eliminarDatosCarroEnMatriz(MatrizOrtogonal matrizDinamica): Un método estático que permite al usuario eliminar un vehículo de la matriz ortogonal utilizando diferentes criterios como placa, color, línea, modelo o nombre del propietario.


Funcionamiento:
La clase ProyectoII proporciona una interfaz de usuario interactiva para administrar vehículos en una matriz ortogonal.
El usuario puede realizar acciones como ingresar nuevos vehículos, buscar vehículos existentes y eliminar vehículos de la matriz ortogonal.
Para cada acción, se muestran mensajes informativos y se solicita la entrada del usuario según sea necesario.
Se utilizan métodos auxiliares para manejar la entrada de datos y realizar operaciones de búsqueda y eliminación en la matriz ortogonal.


### Vehiculo.java

La clase Vehiculo proporciona una estructura para representar vehículos con sus atributos básicos.
Se pueden acceder y modificar los atributos del vehículo utilizando los métodos getters y setters proporcionados.
El método toString() permite obtener una representación legible del objeto Vehiculo en forma de cadena.

La clase Vehiculo representa un vehículo con sus atributos básicos como placa, color, línea, modelo y propietario.

Atributos:
placa: Una cadena que representa la placa del vehículo.
color: Una cadena que representa el color del vehículo.
linea: Una cadena que representa la línea del vehículo.
modelo: Una cadena que representa el modelo del vehículo.
propietario: Una cadena que representa el nombre del propietario del vehículo.
Constructor:
Vehiculo(String placa, String color, String linea, String modelo, String propietario): Un constructor que inicializa un objeto Vehiculo con los valores proporcionados para placa, color, línea, modelo y propietario.
Métodos de acceso (Getters y Setters):
getPlaca(): Devuelve la placa del vehículo.
setPlaca(String placa): Establece la placa del vehículo.
getColor(): Devuelve el color del vehículo.
setColor(String color): Establece el color del vehículo.
getLinea(): Devuelve la línea del vehículo.
setLinea(String linea): Establece la línea del vehículo.
getModelo(): Devuelve el modelo del vehículo.
setModelo(String modelo): Establece el modelo del vehículo.
getPropietario(): Devuelve el nombre del propietario del vehículo.
setPropietario(String propietario): Establece el nombre del propietario del vehículo.
Otros métodos:
toString(): Devuelve una representación de cadena del objeto Vehiculo, mostrando sus atributos.
