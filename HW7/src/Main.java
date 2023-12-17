import Bank.BankAccount;
import Bank.Currency;
import User.DefaultUser;
import User.PremiumUser;
import User.User;

public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.85);


        DefaultUser regularUser = new DefaultUser(3);
        PremiumUser premiumUser = new PremiumUser(5);

        User user1 = new User(premiumUser, "Denis", "Spirin", "spirind@email.com");
        User user2 = new User(regularUser, "John", "Doe", "john.doe@email.com");

        BankAccount account1 = new BankAccount(user1, usd, 1000.0, 0.02, -500.0);
        BankAccount account2 = new BankAccount(user2, eur, 500.0, 0.01, -200.0);

        System.out.println("Начальная информация:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.performTransaction(500.0);
        account1.performTransaction(1000);
        account2.performTransaction(100.0);

        System.out.println("Обновлённая информация:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.convertBalance(eur, 200);
        account2.convertBalance(usd, 200);

        System.out.println("Итоговая информация::");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}