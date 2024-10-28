import static java.util.Collections.swap;

public class Recurtion {

    public static void fun(int i,int n){
        if(i>n) {
            System.out.println();
            return;
        }
        System.out.print(i+" ");
        fun(i+1,n);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int i=1,n=3;
        fun(i,n);
//        System.out.println(sumof(n));
//
//        long sumOfAllNumbers = sumOfAllNumbers(9);
//        System.out.println(sumOfAllNumbers);
    }

    public static int sumof(int n) {
        if(n==0) {
            return n + sumof(n - 1);
        }
        return 1;
    }

    public static long sumOfAllNumbers(long number) {
        if (number != 0) {
            return number + sumOfAllNumbers(number - 1);
        } else {
            return number;
        }
    }

}
