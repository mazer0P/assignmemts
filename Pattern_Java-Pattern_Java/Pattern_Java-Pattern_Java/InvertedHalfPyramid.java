public class InvertedHalfPyramid {
    static void DisplayRec(int size,int count){
        if(size==0){
            return;
        }
        System.out.print("*");
        count+=1;
        if(count==size){
            count=0;
            System.out.println();
            DisplayRec(size-1, count);
            return;
        }
        DisplayRec(size, count);
        return;
    }
    static void Display(int num){
        for(int i=num;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DisplayRec(7, 0);
        DisplayRec(6, 0);
        Display(5);

    }
}
