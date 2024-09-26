package file_io;

import java.io.File;

public class FileDemo {
  public static void main(String[] args) {

    // checking if a file exists
    File fileExists = new File("C:\\Users\\admin\\package.json");
    boolean exists = fileExists.exists();
    System.out.println("fileExists = " + exists);


    // creating multiple directories if not exists
    File directoryExists = new File("C:\\dummy2\\dummy3\\");
    directoryExists.mkdirs();
    System.out.println("directoryExists = " + directoryExists.exists());

    // checking if a file exists
    long length = fileExists.length();
    System.out.println("length = " + length);

    // check if file or directory
    System.out.println("fileExists.isDirectory() = " + fileExists.isDirectory());
    System.out.println("directoryExists.isDirectory() = " + directoryExists.isDirectory());

  }
}
