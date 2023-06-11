public class HighestNumber {
    // Using head rec
    static int getMax(int arr[],int len,int max){
        if(len==0){
            if(arr[len]>max){
                max=arr[len];
            }
            return max;
        }
        max = getMax(arr, len-1, max);
        if(arr[len]>max){
            max = arr[len];
        }
        return max;
    }
    // Using Tail
    static void getMax2(int []arr,int len,int max){
        if(len==0){
            if(arr[len]>max){
                max = arr[len];
            }
            System.out.println(max);
            return;
        }
        if(arr[len]>max){
            max = arr[len];
        }
        getMax2(arr, len-1, max);
    }
    public static void main(String[] args) {
        int [] arr= {8,3,5,7,9,4,1};
        // System.out.println(getMax(arr, arr.length-1, 0));
        getMax2(arr, arr.length-1, 0);
    }
}
