public class InvertedPyramid {
    static void DisplayRec(int size,int line,int count,int n){
        if(line>size){
            return;
        }
        if(count<=line){
            System.out.print(' ');
            DisplayRec(size, line, count+1, n);
            return;
        }
        if(n<=size-line){
            System.out.print("* ");
            DisplayRec(size, line, count, n+1);
            return;
        }
        count=0;
        n=0;
        System.out.println();
        DisplayRec(size, line+1, count, n);
    }
    static void Display(int num){
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Display(5);
        Display(6);
        DisplayRec(5, 1, 0, 0);
    }
}
