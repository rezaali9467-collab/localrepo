import java.util.Scanner;

class Addition
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b, sum;

        System.out.println("enter first number:");
        a=sc.nextInt();

        System.out.println("enter second number:");

        b=sc.nextInt();

        sum=a+b;

        System.out.println("Addition=" + sum);
    }
}