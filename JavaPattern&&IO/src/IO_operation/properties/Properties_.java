package IO_operation.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {

  public static void main(String[] args) throws IOException {
    // use Properties class to read mysql.properties file
    // 1) create Properties obj
    Properties properties = new Properties();
    // 2) load the config file
    properties.load(new FileReader("JavaPattern&&IO/src/mysql.properties"));
    // 3) show the key and value
    properties.list(System.out);
    // 4) get the value based on key
    System.out.println(properties.getProperty("user"));
    System.out.println(properties.getProperty("IP"));


  }

}
