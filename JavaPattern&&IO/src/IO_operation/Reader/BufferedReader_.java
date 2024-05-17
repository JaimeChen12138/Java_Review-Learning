package IO_operation.Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader_ {

  public static void main(String[] args) throws Exception {
    String path = System.getProperty("user.home") + "/Desktop/news3.txt";
    // 处理流 （包装）
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    //read
    String line; // 按行读取
    // when returns null => finsh reading
    while ((line = bufferedReader.readLine()) != null){
      System.out.println(line);
    }
    // close bufferedReader is enough => auto close 节点流
    bufferedReader.close();
  }

}
