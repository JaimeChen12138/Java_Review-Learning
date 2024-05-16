package IO_operation.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;


public class FileInputStream01 {


  // read file one byte after one byte
  @Test
  public void ReadFile01() {
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";
    int readVal = 0;
    FileInputStream fileInputStream = null;
    try {
      // used this obj to read file
      fileInputStream = new FileInputStream(path);

      while ((readVal = fileInputStream.read()) != -1){
        System.out.print((char)readVal);
      }


    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        // close fileStream, release resource
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }


  }


  // read(byte[] b)
  @Test
  public void ReadFile02() {
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";
    byte[] readByte = new byte[8];
    FileInputStream fileInputStream = null;
    int curLength = 0;

    try {
      // used this obj to read file
      fileInputStream = new FileInputStream(path);

      // 返回实际读取的length: byte number
      // if return -1, reach end
      while ((curLength = fileInputStream.read(readByte)) != -1){
        System.out.print(new String(readByte, 0, curLength));
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        // close fileStream, release resource
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }


  }
}
