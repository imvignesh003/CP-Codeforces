
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vignesh G
 */
public class B_Angry_Monk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[k];
            int res = 0;
            int down = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<k;i++){
                a[i] = sc.nextInt();
                res+=a[i];
                if(a[i] >= 1){
                    down+=a[i]-1;
                }
                max = Math.max(max,a[i]);
            }
            res-=max;
            res += down - max -1;
            System.out.println(res+2);
        }

        sc.close();
    }
    
}