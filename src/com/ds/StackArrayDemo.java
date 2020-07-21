/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

import java.util.Stack;

/**
 *
 * @author Dream Tech
 */
public class StackArrayDemo {
    
    public static void main(String[] args) {
        StackArray<Integer> stackArray=new StackArray<>(5);
        stackArray.push(5);
        stackArray.push(10);
        stackArray.push(15);
        System.out.println("Top: "+stackArray.top);
        System.err.println("pop item: "+stackArray.pop());
         System.out.println("Top: "+stackArray.top);
         
         stackArray.push(5);
        stackArray.push(10);
        stackArray.push(15);
        stackArray.push(20);
         System.out.println("Top: "+stackArray.top);
         System.err.println("Dynamic Stack");
          StackDynamic<Integer> stackDynamic=new StackDynamic<>(3);
        stackDynamic.push(5);
        stackDynamic.push(10);
        stackDynamic.push(15);
      
         System.out.println("size1: "+stackDynamic.item.length);
        stackDynamic.push(15);
          
     
          System.out.println("size2: "+stackDynamic.item.length);
        System.out.println("Top1: "+stackDynamic.top);
        System.err.println("pop item: "+stackDynamic.pop());
         System.out.println("Top2: "+stackDynamic.top);
         stackDynamic.push(15);
           stackDynamic.push(15);
          System.out.println("size2: "+stackDynamic.item.length);
        System.out.println("Top1: "+stackDynamic.top);
         System.err.println("pop item: "+stackDynamic.pop());
         System.out.println("size//: "+stackDynamic.item.length);
         
         
         stackDynamic.push(5);
        
        System.out.println("size: "+stackDynamic.item.length);
         System.out.println("Top: "+stackDynamic.top);
         
         ///jsvs stack
         Stack<String> stackJava=new Stack<String>();
         
         stackJava.push("hitham");
          stackJava.push("hitham");
           stackJava.push("hitham");
           System.err.println("stackJava-size "+stackJava.size());
           stackJava.pop();
           System.err.println("stackJava-size "+stackJava.size());
           System.err.println("element "+stackJava.elementAt(0));
         
    }
    
}
