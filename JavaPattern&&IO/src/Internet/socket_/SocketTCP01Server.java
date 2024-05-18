package Internet.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Server {
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
    // IO 读取
    byte[] buf = new byte[1024];
    int len = 0;

    while ((len = inputStream.read(buf)) != -1){
      System.out.println(new String(buf, 0, len));
    }
    // need close stream and socket
    inputStream.close();
    socket.close();
    serverSocket.close();
  }

}
