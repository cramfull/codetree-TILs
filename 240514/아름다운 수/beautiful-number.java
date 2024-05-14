import java.util.*;
import java.io.*;

public class Main {
    static int [] arr;
    static int n;
    static int ans = 0;
    public static void main(String[] args) throws IOException{
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        
        backTracking(1);
        System.out.println(ans);

    }
 // 검사 메서드
    static boolean isFind(){
        for(int i=1;i<arr.length; i+=arr[i]){
            if(i+arr[i]>arr.length){    			// 범위 내인지 
                return false;
            }
            for(int j=i;j<i+arr[i];j++){			// 범위까지의 값이 같은지
                if(arr[i]!=arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    // 백 메서드
    static void backTracking(int x){
        // 기저
        if(x==n+1){
            if(isFind()){
                ans++;
            }
            return;
        }else{
        	//반복 
            for(int i=1;i<=4;i++){
                arr[x]=i;
                backTracking(x+1);
            }
        }

    }




}