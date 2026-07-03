public class MiniMax {
    public static void main(String[]args){
        int minSum=0,maxSum=0;
        Collection.sort(arr);
        for(int i=1;i<arr.size();i++){
            minSum+=arr.get(i);
        }
        for(int i=0;i<arr.size()-1;i++){
            maxSum+=arr.get(i);
        }
        System.out.println(maxSum+" "+minsum);

    }
    
}
