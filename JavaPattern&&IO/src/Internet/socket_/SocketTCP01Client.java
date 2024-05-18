package Internet.socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {

  public static void main(String[] args) throws IOException {
    // 1. connect server (ip, port number)
    // 2. after connect, 生成 socket,
    // socket.getOutPutStream()，通过输出流 写入数据到数据通道

    // if connect successfully 返回 socket obj
    Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
    System.out.println("Client socket返回=" + socket.getClass());

    // 得到和 socket 关联到 输出流对象
    OutputStream op = socket.getOutputStream();
    op.write("hello, server".getBytes());

    // close stream object and socket
    op.close();
    socket.close();
    System.out.println("Client退出...");
  }

}
