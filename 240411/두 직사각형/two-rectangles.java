import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());
    int x1 = Integer.parseInt(str.nextToken());
    int y1 = Integer.parseInt(str.nextToken());
    int x2 = Integer.parseInt(str.nextToken());
    int y2 = Integer.parseInt(str.nextToken());

    str = new StringTokenizer(br.readLine()); 
    int a1 = Integer.parseInt(str.nextToken());
    int b1 = Integer.parseInt(str.nextToken());
    int a2 = Integer.parseInt(str.nextToken());
    int b2 = Integer.parseInt(str.nextToken());
        

    if(a2<x1 || x2<a1 || b2<y1 || y2<b1){
      System.out.println("nonoverlapping");
    }else{
      System.out.println("overlapping");
    }







    }
}