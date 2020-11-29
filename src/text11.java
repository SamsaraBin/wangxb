/*
输入一个月数，然后输出对应月份有多少天（不考虑闰年），将天数输出。
 */
import java.util.Scanner;

public class text11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份：");
        int m = sc.nextInt();
        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28天");
                break;
                default:
                    System.out.println("30天");
        }
    }
}
