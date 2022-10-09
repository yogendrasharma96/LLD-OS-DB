package com.os.printoddeven;

import java.util.concurrent.Semaphore;

class Even implements Runnable {
    Semaphore odd;
    Semaphore even;
    Even(Semaphore even,Semaphore odd){
        this.even=even;
        this.odd=odd;
    }
    @Override
    public void run() {
        try {

            for(int i=0;i<10;i++){
                if(i%2==0){
                    even.acquire();
                    System.out.println(Thread.currentThread().getName()+" "+i);;
                    odd.release();
                }

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
 class Odd implements Runnable{
     Semaphore odd;
     Semaphore even;
     Odd(Semaphore even,Semaphore odd){
         this.even=even;
         this.odd=odd;
     }
     @Override
     public void run() {
         try {


             for(int i=0;i<10;i++){
                 if(i%2!=0){
                     odd.acquire();
                     System.out.println(Thread.currentThread().getName()+" "+i);
                     even.release();
                 }

             }
             even.release();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }
 }

public class OddEven {
    public static void main(String[] args) {
      Semaphore even=new Semaphore(1);
        Semaphore odd=new Semaphore(0);
        Thread t=new Thread(new Even(even,odd));
        Thread t2=new Thread(new Odd(even,odd));
        t.start();
        t2.start();
    }
}
