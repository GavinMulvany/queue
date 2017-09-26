/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author x15448892
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueInterface qi = new MyQueue();
        //TO DO TASKS
     /* Add at least 3 strings to the queue*/
     qi.enqueue("hello");
     qi.enqueue("hi");
     qi.enqueue("hey");
     
     

//     Check the size of the queue,
        System.out.println("the size is " + qi.size());

//     Add another 7 strings to the queue
        qi.enqueue("hello");
        qi.enqueue("hi");
        qi.enqueue("hey");
        qi.enqueue("goodbye");
        qi.enqueue("bye");
        qi.enqueue("later");
        qi.enqueue("cya");


//     Dequeue some strings and print them.
       String out;
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       qi.dequeue();
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       
      
//     Check again the size of the queue
       System.out.println("the size is " + qi.size());


//     Print the element at the front of the queue
       System.out.println("the front is: " + qi.frontElement());

//     Test dequeueing from an empty queue.
       
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       qi.dequeue();
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       qi.dequeue();
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       out = (String)qi.dequeue();
       System.out.println("dequeue: " + out );
       qi.dequeue();
       
       
       System.out.println("the size is " + qi.size());
      
       
    
    }
    
}
