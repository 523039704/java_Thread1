package util;

 

import java.io.*;
import java.lang.Thread;


class MyThread extends Thread{
  public int x = 0;

  public void run(){
    System.out.println(++x);
  }
}

class R implements Runnable{
  private int x = 0;
  public void run(){
    System.out.println(++x);
  }
}

public class Testdemo {
  public static void main(String[] args) throws Exception{
    
    for(int i=0;i<10;i++){
      Thread t = new MyThread();
      t.start();
    }
    Thread.sleep(10);//让上面的线程运行完成
    R r = new R();
    for(int i=0;i<10;i++){
      Thread t = new Thread(r);
      t.start();
    }
  }
}