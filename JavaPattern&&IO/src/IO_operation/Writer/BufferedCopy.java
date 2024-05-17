package IO_operation.Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopy {

  // use bufferedReader and Writer to do the copy text
  // by char =>   do not use BufferedReader to operate binary file (media, video, pdf, doc)
  public static void main(String[] args) throws IOException {
    String srcPath = System.getProperty("user.home") + "/Desktop/news3.txt";
    String destPath = System.getProperty("user.home") + "/Desktop/news55.txt";

    BufferedReader bufferedReader = new BufferedReader(new FileReader(srcPath));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destPath));
    String line;

    //readline => without /n
    while ((line = bufferedReader.readLine()) != null){
      bufferedWriter.write(line);
      bufferedWriter.newLine();
    }
    bufferedReader.close();
    bufferedWriter.close();
  }


}
