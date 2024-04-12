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

    public SortNode(T data) {
        this.setData(data);
        this.setRoot(this);
    }

    public SortNode() {
        this.setRoot(null);
    }

    @Override
    public void addNode(BinaryNode newNode) {
        if(this.getData()==null){
            this.setData((T)newNode.getData());
            this.setRoot(newNode);
            return;
        }
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
            suc = ((SortNode)node.getRight()).successor();
            if(!suc.getParent().equals(node)){
                suc.getParent().setLeft(suc.getRight());
            }else{
                node.setRight(suc.getRight());
            }
            node.setData(suc.getData());
        }else{
            if(node.getParent().getLeft().equals(node)){
                node.getParent().setLeft(node.getLeft());
            }else if(node.getParent().getRight().equals(node)){
                node.getParent().setRight(node.getLeft());
            }
            return;
        }
    }
    
    public SortNode<T> successor(){
        if(this.getLeft()!=null){
            return ((SortNode) this.getLeft()).successor();
        }
        return this;
    }
    
    @Override
    public BinaryNode<T> search(Object data){
        if(this.getData().equals(data)){
            return this;
        }
        if(this.getData().compareTo(data)>0){
            return this.getLeft().search(data);
        }else{
            return this.getRight().search(data);
        }
    }
    
}
