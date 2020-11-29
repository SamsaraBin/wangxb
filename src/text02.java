import java.util.Scanner;

/*
定义一个五位整数，求各个位上的数的和。
 */
public class text02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int i = sc.nextInt();
        System.out.println("合为："+(i/10000+i/1000%10+i/100%10+i/10%10+i%10));
    }
}
