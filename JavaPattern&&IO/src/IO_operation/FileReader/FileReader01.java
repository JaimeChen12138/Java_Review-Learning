package IO_operation.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class FileReader01 {

  public static void main(String[] args) {

    // read by char
    // create FileReader obj   single char read
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";

    FileReader fileReader = null;
    int data = 0;
    try {
      fileReader = new FileReader(path);
      while ((data = fileReader.read()) != -1){
        System.out.print((char)data);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  // read by char[]
  @Test
  public void readFile02() {
     // read by char
     // create FileReader obj   single char read
         String path = System.getProperty("user.home") + "/Desktop/news3.txt";

         FileReader fileReader = null;
         char[] data = new char[8];
         int curLen = 0;
         try {
           fileReader = new FileReader(path);
           // read(char[]) 返回的实际读取的 length
          while ( (curLen = fileReader.read(data)) != -1){
            // when read last things, may not fill the char[], 每次按照实际读取的output
            System.out.print(new String(data, 0, curLen));
          }

         } catch (IOException e) {
           throw new RuntimeException(e);
         } finally {
           try {
             fileReader.close();
           } catch (IOException e) {
             throw new RuntimeException(e);
           }
         }
  }
}
