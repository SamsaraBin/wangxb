import java.util.Scanner;

/*
通过键盘输入声明初始化一个圆柱体的高和底面半径,pai值是3.14,求圆柱体的体积,
并显示输出圆柱体的体积; π(r^2)h。
 */
public class text01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入半径");
        int r = sc.nextInt();
        System.out.println("请输入高");
        int h = sc.nextInt();
        System.out.println("圆柱体的体积为："+3.14*(r*r)*h);
    }
}
