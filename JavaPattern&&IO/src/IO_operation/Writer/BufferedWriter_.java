package IO_operation.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {

  public static void main(String[] args) throws Exception{
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
    bufferedWriter.write("blue blood");
    bufferedWriter.newLine();
    bufferedWriter.write("hey ya");
    bufferedWriter.newLine();
    bufferedWriter.close();

  }

}
