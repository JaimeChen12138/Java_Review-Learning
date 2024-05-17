package IO_operation.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
  // filewriter need to be closed / flush => inorder to write data into file

  public static void main(String[] args) {
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";
    FileWriter fileWriter = null;

    try {
      fileWriter = new FileWriter(path);
      char[] chars = {'a', 'b', 'c'};

      // write(int) 写入 single char
      fileWriter.write('c');
      // write(char[]) 写入指定 arr
      fileWriter.write(chars);
      // write(char[], off, len)
      fileWriter.write("lala".toCharArray(), 0, 3);

      // write(string)
      fileWriter.write("lala");

      // write(string, off, len)
      fileWriter.write("OTT", 0, 3);

      System.out.println("write successfully");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        fileWriter.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

  }

}
