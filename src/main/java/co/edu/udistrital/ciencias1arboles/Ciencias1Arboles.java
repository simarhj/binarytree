/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udistrital.ciencias1arboles;

/**
 *
 * @author estudiantes
 */
public class Ciencias1Arboles {

    public static void main(String[] args) {
        SortNode<Integer> arbolPrueba = new SortNode<>();
        arbolPrueba.addNode(new SortNode(100));
        arbolPrueba.addNode(new SortNode(120));
        arbolPrueba.addNode(new SortNode(150));
        arbolPrueba.addNode(new SortNode(10));
        arbolPrueba.addNode(new SortNode(70));
        arbolPrueba.addNode(new SortNode(150));
        arbolPrueba.addNode(new SortNode(3));
        arbolPrueba.addNode(new SortNode(101));
        SortNode del = (SortNode) arbolPrueba.search(150);
        arbolPrueba.deleteNode(del);
        SortNode del2 = (SortNode) arbolPrueba.search(100);
        arbolPrueba.deleteNode(del2);
        arbolPrueba.inorder();
    }
}
