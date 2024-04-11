/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jsalazar
 */
public class Matriz {
    
    public class MatrizOrtogonal {
    static class Node {
        int value;
        Node right;
        Node down;

        Node(int value) {
            this.value = value;
            this.right = null;
            this.down = null;
        }
    }

    public static void main(String[] args) {
        Node[][] orthogonalMatrix = new Node[10][10];

        // Crear nodos y conectar horizontalmente y verticalmente
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                orthogonalMatrix[i][j] = new Node(i * 10 + j);
                if (i > 0) {
                    orthogonalMatrix[i][j].down = orthogonalMatrix[i - 1][j];
                }
                if (j > 0) {
                    orthogonalMatrix[i][j].right = orthogonalMatrix[i][j - 1];
                }
            }
        }

        // Imprimir la matriz ortogonal
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(orthogonalMatrix[i][j].value + "\t");
            }
            System.out.println();
        }
    }
}


}
