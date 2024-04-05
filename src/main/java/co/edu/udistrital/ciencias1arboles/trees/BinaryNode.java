/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.ciencias1arboles.trees;

/**
 *
 * @author estudiantes
 */
public abstract class BinaryNode<T> extends BinaryTree {
    private T data;
    private BinaryNode left;
    private BinaryNode right;
    private BinaryNode parent;

    @Override
    public BinaryNode<T> search(Object data){
        BinaryNode<T> node;
        if(this.data.equals(data)){
            return this;
        }
        node = left.search(data);
        if(node==null){
            node = right.search(data);
        }
        return node;
    }
    
    @Override
    public void inorder(){
        if(getLeft()!=null){
            getLeft().inorder();
        }
        System.out.println(getData());
        if(getRight()!=null){
            getRight().inorder();
        }
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the left
     */
    public BinaryNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryNode right) {
        this.right = right;
    }

    /**
     * @return the parent
     */
    public BinaryNode getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    
}
