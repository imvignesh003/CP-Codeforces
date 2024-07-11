
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vignesh G
 */
public class A_Only_Pluses {

    public static int helper(int[] n,int add){
            Arrays.sort(n);
            while(n[0] <= n[1] && add<5){
                n[0]++;
                add++;
            }
            
            while(n[0] <= n[2] && add+2<5){
                n[0]++;
                n[1]++;
                add+=2;
            }
            return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] n = new int[3];
            n[0] = sc.nextInt();
            n[1] = sc.nextInt();
            n[2] = sc.nextInt();
            Arrays.sort(n);
            int add = 0;
            while(add<5){
                add = helper(n,add);
            }
            System.out.println(n[0]*n[1]*n[2]);
        }
        sc.close();
    }
}