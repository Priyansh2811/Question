maximum subarray average 
import java.util.Scanner;
public class max_avg_subarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        double maxAvg=0;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            double avg=(double)sum/k;
            maxAvg=Math.max(maxAvg,avg);
        }
        System.out.println("The maximum sub array average is: "+maxAvg);
    }
}