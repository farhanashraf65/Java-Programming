import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Year- ");
        int a = sc.nextInt();
        if(a%4==0) System.out.println("its leap year");
        else System.out.println("not leap year");

    }
}