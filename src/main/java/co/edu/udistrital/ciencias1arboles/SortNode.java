/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.ciencias1arboles;

import co.edu.udistrital.ciencias1arboles.trees.BinaryNode;

/**
 *
 * @author estudiantes
 */
public class SortNode<T extends Comparable> extends BinaryNode<T> {

    @Override
    public void addNode(BinaryNode newNode) {
        if(this.getData().compareTo(newNode.getData())>0){
            if(getLeft()!=null){
                this.getLeft().addNode(newNode);
            }else{
                newNode.setParent(this);
                setLeft(newNode);
            }
        }else{
            if(getRight()!=null){
                this.getRight().addNode(newNode);
            }else{
                newNode.setParent(this);
                setRight(newNode);
            }
        }
    }

    @Override
    public void deleteNode(BinaryNode node) {
        
        SortNode suc;
        if(node.getRight()!=null){
            suc = successor((SortNode) node.getRight());
        }else{
            if(node.getParent().getLeft().equals(node)){
                node.getParent().setLeft(node.getLeft());
            }else if(node.getParent().getRight().equals(node)){
                node.getParent().setRight(node.getLeft());
            }
            return;
        }
        suc.getParent().setLeft(suc.getRight());
        node.setData(suc.getData());
    }
    
    public SortNode<T> successor(SortNode<T> node){
        if(node.getLeft()!=null){
            return ((SortNode) node.getLeft()).successor(node);
        }
        return this;
    }
    
    @Override
    public BinaryNode<T> search(Object data){
        BinaryNode<T> node;
        if(this.getData().equals(data)){
            return this;
        }
        node = getLeft().search(data);
        if(node==null){
            node = getRight().search(data);
        }
        return node;
    }
    
}
