public class MirrorInvertedHalf {
    //Using Recursion
    static void displaylMirrorInverted(int size,int line,int count){
        if(line>size){
            return;
        }
        if(count>size-line){
            System.out.print(" ");
        }
        if(count<=size-line){
            System.out.print("*");
        }
        if(count==0){
            count=size;
            System.out.println();
            displaylMirrorInverted(size, line+1, count);
            return;
        }
        count-=1;
        displaylMirrorInverted(size, line, count);
        return;
    }
    public static void main(String[] args) {
        displaylMirrorInverted(5,1,5);
    }
}
