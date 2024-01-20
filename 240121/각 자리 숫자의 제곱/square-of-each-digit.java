import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.print(f(n));

    }

    public static int f(int k){
        if(k<10){
            return (int)Math.pow(k,2);
        }
        return f(k/10)+ (int)Math.pow(k%10,2);
    }
}