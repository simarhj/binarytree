/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.ciencias1arboles.trees;

/**
 *
 * @author estudiantes
 * @param <T>
 */
public abstract class BinaryTree<T> {
    
    private BinaryNode root;
    
    public void addNode(BinaryNode Parent, BinaryNode newNode, boolean isLeft){
        newNode.setParent(Parent);
        if(isLeft){
            Parent.setLeft(newNode);
        }else{
            Parent.setRight(newNode);
        }
    }
    public abstract void addNode(BinaryNode newNode);
    
    public abstract BinaryNode<T> search(T data);
    
    public abstract void deleteNode(BinaryNode node);
    
    
    public void inorder(){
        if(getRoot()!=null){
            getRoot().inorder();
        }
    }

    /**
     * @return the root
     */
    public BinaryNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BinaryNode root) {
        this.root = root;
    }
    
}
