
public class FullNumbersPyramid {
    static void DisplayRec(int size,int line,int count,int n){
        if(line>size){
            return;
        }
        if(count<size-line){
            System.out.print(" ");
            DisplayRec(size, line, count+1,n);
            return;
        }
        if(count==size-line){
            if(n==0){
                count+=1;
                n = 2*(line+1)-1;
                DisplayRec(size, line, count, n);
                return;
            }
            System.out.print(n);
            DisplayRec(size, line, count, n-1);
            return;
        }
        System.out.println();
        count=0;
        DisplayRec(size, line+1, count, n);
        return;
    }

    static void Display(int num){
        for(int i=1;i<=num;i++){
            for(int j=0;j<=num-i;j++){
                if(j<num-i){
                    System.out.print(" ");
                }
                else{
                    int n = 2*i-1;
                    while(n!=0){
                        System.out.print(n);
                        n--;
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DisplayRec(5, 1, 0, 1);
        Display(5);
    }
}
