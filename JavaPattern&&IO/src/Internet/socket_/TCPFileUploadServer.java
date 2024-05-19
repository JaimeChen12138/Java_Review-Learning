package Internet.socket_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("Server start listening at port 8888");

    Socket socket = serverSocket.accept();

    // -------------------------------------------------------
    String dest = System.getProperty("user.home") + "/Desktop/javaLearning/Java_Review-Learning/JavaPattern&&IO/src/yujin&&wonyoung.png";
    InputStream inputStream = socket.getInputStream();
    BufferedInputStream bis = new BufferedInputStream(inputStream);

    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

    byte[] buf = new byte[1024];
    int len = 0;
    while ((len = bis.read(buf)) != -1){
      bos.write(buf, 0, len);
    }


    bos.flush();
    socket.shutdownOutput();
    bos.close();

    // close other resources
    bis.close();
    socket.close();
    serverSocket.close();

  }

}
