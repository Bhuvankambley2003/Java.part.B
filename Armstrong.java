import java.util.Scanner;
class  Armstrong{

    public static  void main(String[] args) {
        int num, n, digit, digits, power, sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        num = sc.nextInt();

        String s = String.valueOf(num);
        digits = s.length();
        power = digits;

        n = num;

        while (n != 0)
        {
            digit = n % 10;
            sum = sum + (int)Math.pow(digit,power);
            n = n / 10;
        }

        if(num == sum)
            System.out.println(num+" is an Armstrong Number");
        else
            System.out.println(num+" is not an Armstrong Number");

    }

}