package com.lcq.network;  
  
  
/** 
 *  
 * 类名：SeverOutputThread 
 * 功能：建立主服务器的输出线程类， 向客户端传送信息 
 * 时间： 
 * 作者：lcq 
 * 版本： 
 *  
 */  
  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStream;  
import java.net.Socket;  
  
public class SeverOutputThread extends Thread{  
      
    Socket socket = new Socket();  
    public SeverOutputThread(Socket socket){  
        this.socket = socket;  
    }  
  
      
    @Override  
    public void run() {  
          
          
        while(true){  
              
            try {  
                //从socket中得到输出流对象  
                OutputStream os = socket.getOutputStream();  
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
                  
                String line ="服务输出："+ br.readLine();  
                os.write(line.getBytes());  
                  
                  
                  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
          
              
        }  
          
          
    }  
}  
