import java.util.Scanner;
class eleven
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number -");
        int a = input.nextInt();
        if(a%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is Odd");
    }
}
