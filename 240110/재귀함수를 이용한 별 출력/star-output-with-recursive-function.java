import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scn = new Scanner(System.in);

        N = scn.nextInt();

        printStar(1);





    }

    static void printStar(int depth){
        // 기저 조건
        if(depth>N){
           return;
        }
        
        // 반복 조건
        for(int i=0; i<depth; i++){
            System.out.print("*");
        }
        System.out.println();

        printStar(depth+1);
    }
}