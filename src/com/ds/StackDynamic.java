/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

import java.util.Arrays;

/**
 *
 * @author Dream Tech
 */
public class StackDynamic<T> {
    
    int size;
    int top;
    Object[] item;

    public StackDynamic(int size) {
        this.size=size;
        top=-1;
        item=new Object[this.size];
        
             
    }
    
    //stack operation : push ,pop,isEmpty, isFull
    public void push(Object newItem){
        ensureCapicity(top+2);
        top=top+1;
        item[top]=newItem;
    }
    
     //stack operation : push ,pop,isEmpty, isFull
    public T pop(){
     
        ensureCapicityPop(top);
        System.err.println("top stackD"+ top);
        T t=(T)item[top-1];
        top=top-1;
      return t;
      
         
      
      //some modifie here
      
    }
    
    public void ensureCapicity(int minCapicity){
        int oldCapicity=item.length;
        if(minCapicity>oldCapicity){
            int newCapicity=oldCapicity*2;
            if(newCapicity<minCapicity)
                newCapicity=minCapicity;
  
               item=Arrays.copyOf(item, newCapicity);
                  
        }
             
    }
   // size=3
      public void ensureCapicityPop(int minCapicity){//top 3 
        int oldCapicity=item.length;//6
        if(minCapicity<oldCapicity){//3>6
            int newCapicity=oldCapicity/2;
            if(newCapicity<minCapicity)
                newCapicity=minCapicity;
  
               item=Arrays.copyOf(item, newCapicity);
                  
        }
             
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
