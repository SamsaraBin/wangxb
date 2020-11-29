/*
输入一个字符，判断是大写字母还是小写字母，输出提示信息。
 */
public class text04 {
    public static void main(String[] args) {
          char c='a';
          if (c>='a'&&c<='z'){
              System.out.println("小写字母");
          }else if (c>='A'&&c<='Z'){
              System.out.println("大写字母");
          }
          else{
              System.out.println("其他字符");
          }
    }
}
