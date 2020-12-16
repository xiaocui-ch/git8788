package com.bjpowernode.Net;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

public class TcpService {
    @Test
    public void Service(){

        ServerSocket  serverSocket=null;
        //获取通讯端点Socket对象
        Socket socket1=null;
        BufferedWriter bufferedWriter=null;
     //关闭的顺序是创建的反顺序
        try {//让TCP服务器绑定端口8888
            serverSocket=new ServerSocket(8888);

            System.out.println("服务器进入监听状态……");
            //服务器的启动和监听
            socket1  =serverSocket.accept();

            bufferedWriter= new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()))  ;
            bufferedWriter.write("你好，客户端！这里是服务器……现在的时间是："+ new Date());
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            if (socket1!=null) {
                try {
                    socket1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
    @Test
    public void Client(){
        Socket socket2=null;
        BufferedReader bufferedReader=null;
        try {
            socket2= new Socket("localhost",8888);
            bufferedReader=new BufferedReader(new InputStreamReader(socket2.getInputStream()));
           String readline= bufferedReader.readLine();
            System.out.println(readline);
        } catch (IOException e) {
e.printStackTrace();
        } finally {
            if (bufferedReader!=null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket2!=null) {
                try {
                    socket2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
