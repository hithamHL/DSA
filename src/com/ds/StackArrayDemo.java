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
    }
    
}
