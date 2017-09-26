/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.*;

/**
 *
 * @author x15448892
 */
public class MyQueue implements QueueInterface  {
         private ArrayList<String> theQueue;
         /* Creates a new instance of MyQueue class */
         public MyQueue() {
         theQueue = new ArrayList<String>();
         }
         public boolean isEmpty() {
         //checks if the queue is empty and returns rue/false
         //write your code here
         return theQueue.isEmpty();
         }

         public int size(){
         //returns how many elements are in the queue
         // write your code here
         
         return theQueue.size();
         }
         public Object frontElement() {
         //returns the first elemennt (the front) from the queue
         //write your code here
         //you should check first if there is a front element to be removed//
           if(!theQueue.isEmpty()){
           return theQueue.get(0);
         }
           else{
               return null;
           }
               
         }

         public void enqueue(Object element){
         //adds element to the queue;
         //write your code here
        
         theQueue.add(size(),(String) element);
 
         }
         
         public Object dequeue() {
         //removes and returns the front element
         //write your code here
         
         if (!(theQueue.isEmpty())){
                return theQueue.remove(0);
        }
         else
             return null;
         }
}
