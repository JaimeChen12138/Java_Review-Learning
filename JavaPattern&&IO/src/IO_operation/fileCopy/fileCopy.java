package IO_operation.fileCopy;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopy {

  public static void main(String[] args) {
    String path = System.getProperty("user.home") + "/Desktop/yujingWonyoung.jpeg";
    String outPutPath = System.getProperty("user.home") + "/Desktop/Copy2.jpeg";
    // create inputStream, read file into java program
    // create outputStream, output file to destination dir

    FileInputStream fileInputStream = null;
    FileOutputStream outputStream = null;

    int readVal = 0;
    int readLen = 0;
    try {
      fileInputStream = new FileInputStream(path);
      outputStream = new FileOutputStream(outPutPath);
      byte[] buf = new byte[1024];

      while ((readLen = fileInputStream.read(buf)) != -1){
        // write in the current read info, 边读边写, 按照当前 buf length write
          outputStream.write(buf, 0, readLen);
      }
      System.out.println("copy successfully");

    } catch (IOException e) {
      throw new RuntimeException(e);

    }finally {
      if (fileInputStream != null){
        try {
          fileInputStream.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      if (outputStream != null){
        try {
          outputStream.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }


  }

}
