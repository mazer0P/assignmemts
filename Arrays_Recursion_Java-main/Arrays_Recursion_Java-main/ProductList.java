
public class ProductList{
    // static array using head;
    static int product1(int[] arr,int len){
        if(len==0){
            return arr[0];
        }
        return arr[len]*product1(arr,len-1);
    }
    static void product2(int arr[],int len,int product){
        if(len==0){
            product*=arr[len];
            System.out.println(product);
            return;
        }
        product*=arr[len];
        product2(arr, len-1, product);
    }
    public static void main(String[] args) {
        int num[] = {2,3,4,5};
        System.out.println(product1(num, num.length-1));
        product2(num, num.length-1, 1);
    }
}