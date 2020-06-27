import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class server
{
  static int calc_fact(int v)
  {
    if(v<=1)
    return 1;
    return v*calc_fact(v-1);
  }
  public static void main(String[] args) {
    System.out.println("Waiting for server");
    try
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ServerSocket ss1=new ServerSocket(3030);
      Socket sc=ss1.accept();
      BufferedReader br1=new BufferedReader(new InputStreamReader(sc.getInputStream()));
      PrintWriter pr=new PrintWriter(sc.getOutputStream(),true);
      System.out.println("Connection Established");
      pr.println(calc_fact(Integer.parseInt(br1.readLine())));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
