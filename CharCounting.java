import java.io.*;
import java.util.*;

public class CharCounting {
    public int CharCount(File f, char c) throws Exception{
        int counter=0;
        Scanner sc=new Scanner(f);
        while (sc.hasNext()){
            String s=sc.nextLine();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==c) counter++;
            }
        }
        return counter;
    }
    public static void main(String args[]) {

    }
}