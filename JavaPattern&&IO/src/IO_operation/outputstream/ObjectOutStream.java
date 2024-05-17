package IO_operation.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream {
  // After serialize, the format is not txt

  public static void main(String[] args) throws IOException {
    String filePath = System.getProperty("user.home") + "/Desktop/data.dat";

    ObjectOutputStream oj = new ObjectOutputStream(new FileOutputStream(filePath));

    // serialize to /Desktop/data.dat"
    oj.writeInt(100);
    oj.writeUTF("lalala");
    oj.writeObject(new Dog("yujin", 10));
    oj.close();
    System.out.println("save successfully");
  }


}

// if need serialize, need implement
class Dog implements Serializable {
  private String name;
  private int age;
  public Dog(String name, int age){
    this.name = name;
    this.age = age;
  }

}