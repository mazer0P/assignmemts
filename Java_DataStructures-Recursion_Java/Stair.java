
public class Stair {
    static int getstair(int num){
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return getstair(num-1)+getstair(num-2);
    }
    public static void main(String[] args) {
        System.out.println(getstair(6));
    }
}
