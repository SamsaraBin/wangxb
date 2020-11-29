/*
编写一程序实现如下功能：输入1、2、3、4、5、6、7
（分别对应星期一至星期日）中的任何一个数。
 */
import java.util.Scanner;

public class text10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int d = sc.nextInt();
        switch (d){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
                case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }

    }
}
