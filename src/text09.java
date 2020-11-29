/*
1、表达式的返回值必须是下述几种类型之一：int, byte, char, short,确定的结果，jdk1.7后支持String；
2、case子句中的取值必须是常量，且所有case子句中的取值应是不同的；
3、default子句是可选的；
4、break语句用来在执行完一个case分支后使程序跳出switch语句块；如果case后面没有写break则直接往下面执行！
5、case后面的执行体可写{ }也可以不写{ }

 */
public class text09 {
    public static void main(String[] args) {
        final int a=9;
        switch (a){
            case 1:
                System.out.println(111111);
                break;
            case 2:
                System.out.println(222222);
                break;
            case 3:
                System.out.println(333333);
                break;
                default:
                    System.out.println(4444444);
                    break;
        }
    }
}
