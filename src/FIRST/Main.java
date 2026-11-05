package FIRST;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleAccount account1 = new SimpleAccount();
        SimpleAccount account2 = new SimpleAccount();
        long a = scanner.nextLong();
        account1.add(a);
        System.out.println(account2.balance);
        long b = scanner.nextLong();
        account1.transfer(account2, b);
        System.out.println(account2.balance);
        scanner.close();
    }
}
