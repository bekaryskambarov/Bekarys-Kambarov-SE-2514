import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //task1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scan.nextInt();
        f1(number);

        //task2
        System.out.print("How many numbers are you gonna work with? ");
        int num = scan.nextInt();
        int[] numbers = new int[num];
        fillArray(numbers, 0, scan);

        double total = f2(num, numbers);
        System.out.println(total/num);

        //task3
        System.out.print("Enter your number: ");
        int num3 = scan.nextInt();
        System.out.println(f3(num3, 2));

        //task4
        System.out.print("Enter your number: ");
        int num4 = scan.nextInt();
        double result = f4(num4);
        System.out.println(result);

        //task5
        System.out.print("Enter n for Fibonacci: ");
        int num5 = scan.nextInt();
        System.out.println(f5(num5));

        //task6
        System.out.print("Enter base and power: ");
        int a = scan.nextInt();
        int n6 = scan.nextInt();
        System.out.println(f6(a, n6));

        //task9
        System.out.print("Enter string to count: ");
        String s9 = scan.next();
        System.out.println(f9(s9));

        //task10
        System.out.print("Enter two numbers for GCD: ");
        int a10 = scan.nextInt();
        int b10 = scan.nextInt();
        System.out.println(f10(a10, b10));

    }

    public static void f1(int i){
        if (i == 0)
            return;
        System.out.println(i%10);
        f1(i /= 10);
    }

    // i have to fill my array so i use recursive function
    public static void fillArray(int[] arr, int i, Scanner scan) {
        if (i == arr.length) return;
        arr[i] = scan.nextInt();
        fillArray(arr, i + 1, scan);
    }
    public static double f2(int num, int[] numbers){
        if (num <= 0)
            return 0;
        return numbers[num-1]+f2(num-1, numbers);
    }

    public static String f3(int n, int i){
        if (i >= n)
            return "prime";
        if (n % i == 0)
            return "composite";
        return f3(n, i+1);
    }

    public static double f4(int i){
        if (i <= 1)
            return 1;
        return f4(i-1)*i;
    }

    public static int f5(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return f5(n - 1) + f5(n - 2);

    }

    public static int f6(int a, int n) {
        if (n == 0)
            return 1;
        return a * f6(a, n - 1);
    }

    public static int f9(String s) {
        if (s.equals(""))
            return 0;
        return 1 + f9(s.substring(1));
    }

    public static int f10(int a, int b) {
        if (b == 0)
            return a;
        return f10(b, a % b);
    }
}