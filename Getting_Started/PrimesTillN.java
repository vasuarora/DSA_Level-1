import java.util.*;
public class PrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int i=low;i<=high;i++){
            int count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
