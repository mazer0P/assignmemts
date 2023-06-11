

public class MirrorleftPyramid {

    static void displayMirrorleft(int size,int line,int count){
        if(line==size){
            return;
        }
        if(count<size-line){
            System.out.print(" ");
        }
        count+=1;
        if(count==size){
            count=0;
            System.out.println("");
            displayMirrorleft(size, line+1, count);
            return;
        }
        if(count>=size-line){
            System.out.print("*");
        }
        displayMirrorleft(size, line, count);
        return;
    }
    static void displayMirror(int num){
        for(int i=num;i>0;i--){
            for(int j=1;j<=num;j++){
                if(j<i){
                    System.out.print(" ");
                }
                if(j>=i){
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        displayMirrorleft(5, 1, 0);
        displayMirror(5);
    }
}
