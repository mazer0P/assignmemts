

public class LeftPascalTriangle {
    static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    static void DisplayRec(int size,int line,int count){
        if(size==line){
            return;
        }
        if(count<=line){
            System.out.print(fact(line)/(fact(line-count)*fact(count))+" ");
            DisplayRec(size, line, count+1);
            return;
        }
        count=0;
        System.out.println();
        DisplayRec(size, line+1, count);
        return;
    }
    static void Display(int num){
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Display(7);
        DisplayRec(5, 0, 0);
    }
}
