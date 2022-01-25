class Multi extends Thread{  
    public void run(){  
    for(byte i=0;i<10;i++)
    System.out.println("thread1 :"+(i+1));  
    }  
    } 
    class Multi1  implements Runnable{  
    public void run(){  
    for(byte i=0;i<6;i++)
    System.out.println("thread2 : "+(i+1));  
    }  
    }  
    class threadmain{
    public static void main(String args[]){  
    Multi t1=new Multi();  
    t1.start();  
    Multi1 m1=new Multi1(); 
    Thread t2 =new Thread(m1);
    t2.start();
     }  
    }
