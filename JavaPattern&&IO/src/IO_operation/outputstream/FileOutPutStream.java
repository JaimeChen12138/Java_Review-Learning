package IO_operation.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class FileOutPutStream {


  // use FileOutPutStream to write data into file
  // if the file not exists, create this file
  @Test
  public void writeFile(){
    String filePath = System.getProperty("user.home") + "/Desktop/news3.txt";
    FileOutputStream fileOutputStream = null;

    try {
      // fileOutputStream obj
      fileOutputStream = new FileOutputStream(filePath, true);
      // write in one byte
      //fileOutputStream.write('H');

      // *** new FileOutputStream(filePath, true) append to the original end

      // write in String
      String str = "hello world !";
      // turn String -> char array
//      fileOutputStream.write(str.getBytes());

      // write(byte[] b, int off, int len) len bytes from off start
      fileOutputStream.write(str.getBytes(), 0, str.length()-1);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally{

      try {
        fileOutputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }


  }

}
