package IO_operation.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    String filePath = System.getProperty("user.home") + "/Desktop/data.dat";
    ObjectInputStream oi = new ObjectInputStream(new FileInputStream(filePath));
    // 反序列化顺序 需要和 序列化顺序一致

    System.out.println(oi.readInt());
    System.out.println(oi.readUTF());
    System.out.println(oi.readObject());
    oi.close();
  }

}
