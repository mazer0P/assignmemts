import java.util.Arrays;

public class Salary {
    static int arr[];
    static int [] incrementSalary(int [] sal,int len){
        if(len==sal.length-1){
            arr = new int[len+1];
        }
        if(len==0){
            arr[len] = (int) (sal[len]+(int)(sal[len]*0.10));
            return arr;
        }
        arr[len] = (int) (sal[len]+(int)(sal[len]*0.10));
        return incrementSalary(sal, len-1);
    }
    public static void main(String[] args) {
        int []wage = {100,200,300,400,500};
        int [] NewWage = incrementSalary(wage, wage.length-1);
        System.out.println(Arrays.toString(NewWage));
    }
}
