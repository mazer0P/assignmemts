

public class PyramidPattern {
    //Using Recursion
    static void DisplayRec(int size,int line ,int count){
        if(line>size){
            return;
        }
        System.out.print(" ");
        if(count>=size-line){
            System.out.print("*");
        }
        if(count==size){
            count=0;
            System.out.println();
            DisplayRec(size, line+1, count);
            return;
        }
        DisplayRec(size, line, count+1);
        return;
    }
    // USING LOOP
    static void Display(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(" ");
                if(j>num-i){
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DisplayRec(4, 0, 0);
        Display(5);
    }
}