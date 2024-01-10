import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=N;i>=1;i--){
            System.out.print(i+" ");
        }


    }
}