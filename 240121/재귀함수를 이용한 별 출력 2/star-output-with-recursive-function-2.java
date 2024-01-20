import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int i=n;

        star(i);

    }

    public static void star(int i){
        if(i==0){
            return;
        }
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
        star(i-1);
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}