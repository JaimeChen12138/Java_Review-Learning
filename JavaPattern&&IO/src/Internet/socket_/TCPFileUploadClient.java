package Internet.socket_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPFileUploadClient {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket(InetAddress.getLocalHost(),8888);

    String src = System.getProperty("user.home") + "/Desktop/宥真圆圆.PNG";
    // 通过 socket获取输出流
    OutputStream os1 = socket.getOutputStream();
    BufferedOutputStream os = new BufferedOutputStream(os1);

    // 读入磁盘文件 pic info to client, write it to socket关联的 outPutStream
    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
    byte[] buf = new byte[1024];
    int len = 0;
    while ((len = bufferedInputStream.read(buf)) != -1){
      os.write(buf, 0, len);
    }

    os.flush();
    socket.shutdownOutput();   // 如果需要边读边写读的话需要先  write后  flush 再 shutdownOutput 再 close others

    bufferedInputStream.close();// close 要由近及远
    os.close();
    socket.close();

    /*
    (1)确保数据完整传输：在使用缓冲流时，如果不调用 flush()，
    最后一些数据可能仍在缓冲区中，尚未写出。这在程序结束或流关闭前尤为重要，
    以确保所有数据都已被传输。
    (2)shutdownOutput() 是 Socket 类中的方法，
      用于显式地关闭套接字的输出流。这告诉对端此端已经完成数据发送。
      通知对端数据传输结束：在网络通信中，shutdownOutput() 用于告知对端不再有更多数据发送。
      对端可以据此判断所有数据已经接收完成，并可以进行处理或关闭连接。
    */

    // -------------------------------------



  }

}
