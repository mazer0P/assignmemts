public class CrossDiagonal {
    static void DisplayRec(int size,int line,int dummyline ,int count){
        if(size==line){
            return;
        }
        if(count==size){
            System.out.println();
            count=0;
            DisplayRec(size, line+1, dummyline-1, count);
            return;
        }
        if(count==line){
            System.out.print("\\");
            DisplayRec(size, line,dummyline, count+1);
            return;
        }else if(count==dummyline-1){
            System.out.print("/");
            DisplayRec(size, line, dummyline, count+1);
            return;
        }else{
            System.out.print(" ");
            DisplayRec(size, line, dummyline, count+1);
            return;
        }
    }
    static void Display(int num){
        int m = num;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==i){
                    System.out.print("\\");
                }
                else if(j==m){
                    System.out.print("/");
                }
                else{
                    System.out.print(' ');
                }
            }
            m=m-1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Display(6);
        DisplayRec(6, 0, 6, 0);
    }
}
