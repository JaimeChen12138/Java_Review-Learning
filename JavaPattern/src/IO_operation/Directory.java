package IO_operation;

import java.io.File;
import org.junit.jupiter.api.Test;

public class Directory {

  @Test
  public void m1(){
    String desktopPath = System.getProperty("user.home") + "/Desktop";
    String fileName = "example.txt";
    String filePath = desktopPath + "/" + fileName;
    File file = new File(filePath);
    if (file.exists()){
      file.delete();
      System.out.println(filePath + "delete successfully");
    }else{
      System.out.println("file not exists");
    }
  }

}
