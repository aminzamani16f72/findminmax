import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter two integer");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int min=num1>num2?num2:num1;
        int max=num1>num2?num1:num2;
        System.out.println("min="+" "+min+"max="+" "+max);

    }
}