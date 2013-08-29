import java.util.*;
import java.io.*;

public class LongestLines
{
  public static void main(String args[]) throws FileNotFoundException
  {
    for(String s:args) 
    {
      File f = new File(s);
      if(!(f.exists()))die(f + " does not exist.");
      if(!(f.isFile()))die(f + " is not a (text) file.");
      if(!(f.canRead()))die(f + " cannot be read.");

      Scanner sc = new Scanner(f);
      String words;
      while(sc.hasNextLine())
      {
         words = sc.nextLine();
         char array[] = words.toCharArray();
         if (array.length > 66)
         {
            System.out.println(words);
         }         
      }
    }
  }
  public static void die(String msg)
  {
     System.err.println(msg);
     System.exit(1);
  }
}
