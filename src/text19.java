/*    A
 *   BBB
 *  CCCCC
 * DDDDDDD
 *EEEEEEEEE
 */
public class text19 {
    public static void main(String[] args) {
        char a ='A';
        for (int i =1;i <= 5;i++){
            for (int k = 4;k >= i;k --){
                System.out.print(" ");
            }
            for (int j =3;j <= 2 * i + 1;j++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }
}
