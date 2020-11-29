/*
打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class text14 {
    public static void main(String[] args) {
        int i=1;
        String ou=" ";
        while (i<100);{
            if (i%2==0){
                ou+=i + " ";
            }
            i++;
        }
        System.out.println("偶数为："+ou);
    }
}
