public class leftPyramidPattern {
    static void displayleftPyramidRec(int line,int size,int count){
        if(line>size){
            return;
        }
        System.out.print('*');
        count+=1;
        if(line==count){
            count=0;
            System.out.println();
            displayleftPyramidRec(line+1, size, count);
            return;
        }
        displayleftPyramidRec(line, size, count);
        return;
    }

    static void displayleftPyramid(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // displayleftPyramid(5);
        // displayleftPyramid(4);
        displayleftPyramidRec(1, 5, 0);
    }
}
