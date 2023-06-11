public class StarSquare {
    static void DisplaySquareRec(int size,int line,int count){
        if(size==line){
            System.out.println();
            return;
        }
        System.out.print("* ");
        count+=1;
        if(count==size){
            count=0;
            System.out.println();
            DisplaySquareRec(size, line+1, count);
            return;
        }
        DisplaySquareRec(size, line, count);
    }
    static void DisplaySquare(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // DisplaySquare(4);
        // DisplaySquare(5);
        DisplaySquareRec(5, 0, 0);
        DisplaySquareRec(4, 0, 0);
    }
}
