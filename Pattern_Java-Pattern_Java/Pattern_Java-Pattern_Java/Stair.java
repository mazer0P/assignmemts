public class Stair {
    static int getstair(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return getstair(n-1)+getstair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(getstair(4));
    }
}