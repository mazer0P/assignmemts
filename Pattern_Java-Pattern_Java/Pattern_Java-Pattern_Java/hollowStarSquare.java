


public class hollowStarSquare{

    static void getSquareRec(int size,int line,int count){
        if(line>size){
            return;
        }
        if(line==1||line==size){
            System.out.print("* ");
            count++;
            if(count==size){
                count=0;
                System.out.println();
                getSquareRec(size, line+1, count);
                return;
            }
            getSquareRec(size, line,count);
            return;
        }else{
            if(count==0||count==size-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            count++;
            if(count==size){
                count=0;
                System.out.println();
                getSquareRec(size, line+1,count);
                return;
            }
            getSquareRec(size, line,count);
            return;
        }
    }
    static void getSquare(int size){
        for(int i =1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1||j==1||i==size||j==size){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // getSquare(4);
        getSquareRec(4, 1,0);
        getSquareRec(5, 1, 0);
        getSquareRec(6, 1, 0);
    }
}