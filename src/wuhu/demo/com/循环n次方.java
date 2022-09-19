package wuhu.demo.com;

import java.util.Scanner;

public class 循环n次方 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++)
                for (int k = 1; k <= j; k++) {
                    x = x + 1;
                    System.out.print(x + ",");
                }
           System.out.println("\n");
        }
        System.out.println("456");
    }
}
