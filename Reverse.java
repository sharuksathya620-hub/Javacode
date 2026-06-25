import java.util.*;
class ExArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int nums=arr[i];
        for(int i=0;i<=n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
       
