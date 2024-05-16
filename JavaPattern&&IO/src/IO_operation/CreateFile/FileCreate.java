package IO_operation.CreateFile;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class FileCreate {

  public static void main(String[] args) {

  }

  // method1
  @Test
  public void create01() {
    String desktopPath = System.getProperty("user.home") + "/Desktop";
    String fileName = "example.txt";
    String filePath = desktopPath + "/" + fileName;
    File file = new File(filePath);

    try {
      file.createNewFile();
      System.out.println("file create successfully");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  // method2
  // new File(File parent, String child)
  @Test
  public void create02() {
    File parentFile = new File(System.getProperty("user.home") + "/Desktop");
    String fileName = "examp2.txt";
    File file = new File(parentFile, fileName);

    try {
      file.createNewFile();
      System.out.println("create successfully");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
  // method3
  // new File(String parent, String child)
  @Test
  public void create03(){
    String parentPath = System.getProperty("user.home") + "/Desktop";
    String fileName = "news3.txt";
    File file = new File(parentPath, fileName);

    try {
      file.createNewFile();
      System.out.println("file3 created successfully");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}