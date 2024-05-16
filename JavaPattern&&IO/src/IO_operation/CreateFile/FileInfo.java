package IO_operation.CreateFile;

import java.io.File;
import org.junit.jupiter.api.Test;

public class FileInfo {

  public static void main(String[] args) {

  }

  //get file info
  @Test
  public void info(){
    String desktopPath = System.getProperty("user.home") + "/Desktop";
    String fileName = "example.txt";
    String filePath = desktopPath + "/" + fileName;
    File file = new File(filePath);

    System.out.println("file name: " + file.getName());

    System.out.println("file abs path= " + file.getAbsolutePath());
    System.out.println("file parent dic = " + file.getParentFile());
    System.out.println("file size = " + file.length());
    System.out.println("file whether exists = " + file.exists());
  }

}
