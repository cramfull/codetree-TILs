import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(str.nextToken());
        int x2 = Integer.parseInt(str.nextToken());
        int x3 = Integer.parseInt(str.nextToken());
        int x4 = Integer.parseInt(str.nextToken());

        boolean ff = false;

        if(x3<=x2){
            ff = true;
        }
        if(ff){
            System.out.println("intersecting");
        }else{
            System.out.println("nonintersecting");
        }


    }
}