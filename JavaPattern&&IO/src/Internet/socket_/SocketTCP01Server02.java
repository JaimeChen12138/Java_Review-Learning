package Internet.socket_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server02 {
  //server side
  public static void main(String[] args) throws IOException {
    // 在本机 9999 port listen监听等待 connect
    ServerSocket serverSocket = new ServerSocket(9999);
    // ServerSocket 可以通过 accept() 返回多个 Socket
    System.out.println("Server side start listening at port 9999, wait for connecting");
    //没有 client连接时， 程序会被阻塞
    // if 有 client connect, will return Socket object

    Socket socket = serverSocket.accept();
    System.out.println("Server side(服务器端) Socket = " + socket.getClass());

    // 通过 socket.getInputStream() read 客户端写入
    // 数据通道的数据 并显示
    InputStream inputStream = socket.getInputStream();
    // IO 读取 => 用转换流： 字节流转成 字符流
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//    String line = "";
//    while ((line = br.readLine())!= null){
//      System.out.println(line);
//    }

    System.out.println(br.readLine());



    // -------------- send back info to Client------------------
    OutputStream os = socket.getOutputStream();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
    bw.write("send back info: hello Client !");
    bw.newLine();   // 表示写入结束
    bw.flush(); // 需要手动刷新
    //socket.shutdownOutput();




    // need close stream and socket, close 外层流，内层流也会被 close
    bw.close();
    br.close();
    socket.close();
    serverSocket.close();
  }

}
