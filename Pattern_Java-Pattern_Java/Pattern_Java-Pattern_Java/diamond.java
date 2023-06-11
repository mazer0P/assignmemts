public class diamond {
    static void Display1(int size,int line,int count){
        if(line==size){
            return;
        }
        if(count==size+line){
            System.out.print("* ");
            Display1(size, line, count+1);
            return;
        }
        if(count==size-line){
            System.out.print("* ");
            Display1(size, line, count+1);
            return;
        }
        if(count<size+line){
            System.out.print("  ");
            Display1(size, line, count+1);
            return;
        }
        count=0;
        System.out.println();
        Display1(size, line+1, count);
    }
    static void Display2(int size,int line,int count){
        if(size<line){
            return;
        }
        if(count==line){
            System.out.print("* ");
            Display2(size, line, count+1);
            return;
        }
        if(count==size*2-line){
            System.out.print("* ");
            Display2(size, line, count+1);
            return;
        }
        if(count<size*2){
            System.out.print("  ");
            Display2(size, line, count+1);
            return;
        }
        count=0;
        System.out.println();
        Display2(size, line+1, count);

    }
    static void display(int size,int line,int count){
        Display1(size, line, count);
        Display2(size, line, count);
    }
    public static void main(String[] args) {
        display(6, 0, 0);
    }
}
