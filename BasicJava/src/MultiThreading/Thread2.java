/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Keerthana
 */
class ImplementsRunnable implements Runnable{
    
   private int counter = 0;
    public void run() {
        counter ++;
        System.out.println("ImplementsRunnable : Counter :" +counter);
    }  
}

class ExtendsThread extends Thread{
    private int counter = 0;
    public void run() {
        counter ++;
        System.out.println("ExtendsThread : Counter :" +counter);
    }  
}
public class Thread2 {
    public static void main(String[] args) throws Exception {
        ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000);
        
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000);
        
        Thread t3 = new Thread(rc);
        t3.start();
        Thread.sleep(1000);
        
        ExtendsThread et1 = new ExtendsThread();
        et1.start();
        Thread.sleep(1000);
        
        ExtendsThread et2 = new ExtendsThread();
        et2.start();
        Thread.sleep(1000);
        
        ExtendsThread et3 = new  ExtendsThread();
        et3.start();
        Thread.sleep(1000);
        
    }
}
