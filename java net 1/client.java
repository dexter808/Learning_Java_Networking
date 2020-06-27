import java.net.Socket;
import java.io.*;
public class client
{
  public static void main(String[] args) {
    System.out.println("Start client");
    try
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Socket sc=new Socket("localhost",3030);
      BufferedReader br1=new BufferedReader(new InputStreamReader(sc.getInputStream()));
      PrintWriter pr=new PrintWriter(sc.getOutputStream(),true);
      System.out.println("Enter a number : ");
      pr.println(br.readLine());
      System.out.println("Factorial :: "+br1.readLine());
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
