/*1x1=1
 *1x2=2 2x2=4
 * .. ..
 */
public class text20 {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i ++){
            for (int j =1;j <=i;j ++){
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
