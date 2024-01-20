import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = n;
        f(i,n);

    }

    public static void f(int i, int n){
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        f(i-1,n);
        System.out.print(i+" ");
    }
}