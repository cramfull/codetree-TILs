import java.util.*;
import java.io.*;

public class Main {
    
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());

        int [] arr = new int[n+1];

        backtracking(k,n,1,arr);

    }

    static void backtracking(int k, int n, int x, int [] arr){
        if(x==n+1){
            for(int i=1;i<arr.length;i++){
                sb.append(arr[i]);
                if(i<arr.length-1){
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
            sb = new StringBuilder();
        }else{

            for(int i=1;i<=k;i++){
                arr[x]=i;
                backtracking(k,n,x+1, arr);
            }
        }
    }
}