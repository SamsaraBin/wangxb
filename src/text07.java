import java.util.Scanner;

/*
输入两个整数，打印出它们的大小关系，是小于、大于还是等于。
 */
public class text07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int a = sc.nextInt();
        System.out.println("请输入：");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a>b");
        }else if (a<b) {
            System.out.println("a<b");
        }
        else{
            System.out.println("a=b");
        }
    }
}
