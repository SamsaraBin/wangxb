import java.util.Scanner;

/*
给出一个百分制成绩，要求输出成绩等级‘A’、‘B’、‘C’、‘D’、‘E’。
90分以上输出’A’，80～89分输出’B’，
70～79分输出’C’，60～69分输出’D’，60分以下输出‘E’。
 */
public class text06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();
        if (score>=90){
            System.out.println("A");
        }else if (score>=80&&score<90){
            System.out.println("B");
        }else if (score>=70&&score<80){
            System.out.println("C");
        }else if (score>=60&&score<70){
            System.out.println("D");
        }else{
            System.out.println("E");
        }

    }
}
