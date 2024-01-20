import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.print(sum(n));

    }

    public static int sum(int k){
        if(k==1){
            return 1;
        }
        return sum(k-1)+k;
    }
}