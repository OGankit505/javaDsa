package DynamicPrograming;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n)
    {
        if (n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
