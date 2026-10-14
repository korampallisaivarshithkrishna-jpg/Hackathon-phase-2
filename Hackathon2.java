import java.util.Scanner;
public class Hackathon2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter composition of water in liters");
        double composition = sc.nextDouble();
        if (composition <= 500.00){
            System.out.println("bill is Rs. 100");
        }
        else  if (composition > 500.00){
            System.out.println("bill is Rs. 200");
        }
        sc.close();
    }
}