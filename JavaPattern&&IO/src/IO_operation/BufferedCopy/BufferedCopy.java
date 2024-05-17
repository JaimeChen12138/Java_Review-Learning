package IO_operation.BufferedCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedCopy {

  public static void main(String[] args) throws IOException {
    String srcPath = System.getProperty("user.home") + "/Desktop/yujingWonyoung.jpeg";
    String destPath = System.getProperty("user.home") + "/Desktop/BufferedCopy.jpeg";
    // read/write image needs by byte instead by char
    // read and write binary file using this

    BufferedInputStream bi = new BufferedInputStream(new FileInputStream(srcPath));
    BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(destPath));
    byte[] data = new byte[1024];
    int curLen = 0;
    while ((curLen = bi.read(data)) != -1){
      bo.write(data, 0, curLen);
    }
    bi.close();
    bo.close();
  }

}
