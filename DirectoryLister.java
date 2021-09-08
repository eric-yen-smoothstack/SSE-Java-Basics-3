import java.io.*;
import java.util.*;

public class DirectoryLister {
    public ArrayList<File> listFiles(String dName){
        File directory = new File(dName);
       ArrayList<File> listOfFiles= new ArrayList<File>();
       
       File[] fList = directory.listFiles();
    if(fList != null){
         for (File file : fList) {
             if(file.isFile()) listOfFiles.add(file);
             else if (file.isDirectory()){
                 listOfFiles.addAll(listFiles(file.getAbsolutePath()));
             }
             
         }
    }
       
       return listOfFiles;
    }
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}