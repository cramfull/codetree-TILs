import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        // 입력받아서
        StringTokenizer str = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(str.nextToken());
        int x2 = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(str.nextToken());
        int x4 = Integer.parseInt(str.nextToken());
        // 구역 총 구하기
        result += x2-x1;
        result += x4-x3;

        // 겹치는 구역 구하기
        int over = 0;
        if(x4<x1 || x2<x3){
            System.out.println(result);
        }else{
            if(x1<=x4 && x4<=x2 && x3<x1){
                over = x4-x1;
            }else if(x1<=x3&& x3<=x2 && x2<x4){
                over = x2-x3;
            }else if(x1<=x3 && x4<=x2){
                over = x4-x3;
            }else{
                over = x2-x1;
            }
            System.out.println(result-over);
        }

    }
}