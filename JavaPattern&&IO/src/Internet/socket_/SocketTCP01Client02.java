package Internet.socket_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client02 {

  //  by char 字符流
  public static void main(String[] args) throws IOException {
    // 1. connect server (ip, port number)
    // 2. after connect, 生成 socket,
    // socket.getOutPutStream()，通过输出流 写入数据到数据通道

    // if connect successfully 返回 socket obj
    Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
    System.out.println("Client socket返回=" + socket.getClass());

    // 得到和 socket 关联到 输出流对象
    OutputStream op = socket.getOutputStream();
    // 转换流
    BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(op));
    bf.write("hello, server 字符流");
    bf.newLine();// 换行符 表示写入内容结束, (end 标记) 但对方要readLine()来读
    bf.flush();// must have this
    //socket.shutdownOutput();

    // -------------receive back info from server
    InputStream inputStream = socket.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    System.out.println(br.readLine());




    // close stream object and socket
    br.close();
    bf.close();
    socket.close();
    System.out.println("Client退出...");
  }

}
