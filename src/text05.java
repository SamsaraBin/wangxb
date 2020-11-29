import java.util.Scanner;

/*
写一个程序，判断某一年是否为闰年
（被4整除但不能被100整除或者能被400整除)是闰年否则是平年
 */
public class text05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int y = sc.nextInt();
        if (y %4==0&&y%100!=0||y/400==0){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }
    }
}
