import java.util.*;
import java.io.*;

public class Main {

    static Point [] arr;
    static int maxV;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new Point[n];
        maxV = 0;
        for(int i=0;i<n;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int st = Integer.parseInt(str.nextToken());
            int ed = Integer.parseInt(str.nextToken());
            arr[i] = new Point(st,ed);
        }

        over(0);
        System.out.println(maxV);



    }

    static int over(int x){
        for(int i=0;i<arr.length;i++){
            int cnt = 0;
            Point now = arr[i];

            for (int j=0;j<arr.length;j++){
                Point tgt = arr[j];
                if(now.st==tgt.st && now.ed==tgt.ed){
                    cnt+=1;
                }
                if(tgt.ed<now.st || tgt.st>now.ed){
                    cnt++;
                }
            }

            if(cnt > maxV){
                maxV = cnt;
            }

        }
        return maxV;
    }


    static class Point{
        int st, ed;

        public Point(int st, int ed){
            this.st=st;
            this.ed=ed;
        }
    }


}