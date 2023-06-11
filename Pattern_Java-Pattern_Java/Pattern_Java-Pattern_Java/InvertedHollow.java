public class InvertedHollow {
    static void Display(int num){
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=num-i;j++){
                if(i==0){
                    System.out.print("* ");
                }
                else if(j==0||j==num-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Display(5);
    }
}
