import java.util.Scanner;

public class BinarySearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();   
        }
        System.out.print("Entered array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the element to be searched: ");

        int target = sc.nextInt();
        int result = binarySearch(arr,target);

        if(result==-1){
            System.out.println("Element not found in the array.");
        }
        else{
            System.out.println("Element found at index: "+result);
        }

    }

    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

}