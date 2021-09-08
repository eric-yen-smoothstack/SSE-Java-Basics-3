import java.io.*;
import java.util.*;

public class FileAppender {
    public void appendFile(String fName, String add) throws Exception{
        FileWriter fw = new FileWriter(fName, true);
        fw.write(add);
        fw.close();
    }
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}