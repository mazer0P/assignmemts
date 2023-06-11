public class DiagonalLine {
    static void DisplayRec(int size,int line,int count){
        if(line==size){
            return;
        }
        if(count<line){
            System.out.print(" ");
            DisplayRec(size, line, count+1);
            return;
        }else{
            System.out.println("\\");
            count=0;
            DisplayRec(size, line+1, count);
            return;
        }
    }
    static void Display(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Display(7);
        DisplayRec(6, 0, 0);
    }
}
