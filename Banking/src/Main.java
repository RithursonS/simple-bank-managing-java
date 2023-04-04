import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name= scanner.nextLine();
        String customerId= scanner.nextLine();
        BankAccount obj1=new BankAccount(name,customerId);
        obj1.menu();
    }
}
