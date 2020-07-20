/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author Dream Tech
 */
public class StackArray<T> {
    
    int size;
    int top;
    Object[] item;

    public StackArray(int size) {
        this.size = size;
        item=new Object[this.size];
        top=-1;
             
    }
    
    //stack operation : push ,pop,isEmpty, isFull
    public void push(Object newItem){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        top=top+1;
        item[top]=newItem;
    }
    
     //stack operation : push ,pop,isEmpty, isFull
    public T pop(){
     
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        T t=(T)item[top];
        top=top-1;
      return t;
    }
    
    
    
    //check is stack is full
    public Boolean isFull(){
        return (top==size-1);
    }
    
     //check is stack is full
    public Boolean isEmpty(){
        return (top==-1);
    }
    
    
    
    
}
