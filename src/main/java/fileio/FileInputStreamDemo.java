package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
  public static void main(String[] args) throws IOException {

    try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\input.txt");
         FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\output.txt")){
      int read;
      // reading from input file byte wise and writing into output file
      while((read = fis.read()) != -1) {
        fos.write(read);
      }
    }

    try(FileInputStream fis1 = new FileInputStream("C:\\Users\\admin\\output.txt");){
      int read1;
      //printing out put file content
      while ((read1 = fis1.read())!=-1) {
        System.out.print((char) read1);
      }
    }
  }
}
