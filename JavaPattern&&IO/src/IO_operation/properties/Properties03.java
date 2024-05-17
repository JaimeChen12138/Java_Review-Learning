package IO_operation.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {

  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.setProperty("charset", "utf8");
    properties.setProperty("user", "Tom");
    properties.setProperty("pwd", "1234565");


    // store k-v into file
    properties.store(new FileOutputStream("JavaPattern&&IO/src/mysql2.properties"), null);
    System.out.println("save successfully");
  }

}
