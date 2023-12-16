public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.85);

        User user1 = new User("Denis", "Spirin", "spirind@email.com");
        User user2 = new User("John", "Doe", "john.doe@email.com");

        DefaultUser regularUser = new DefaultUser(false);
        PremiumUser premiumUser = new PremiumUser(true);

        BankAccount account1 = new BankAccount(user1, usd, 1000.0, 0.02, -500.0);
        BankAccount account2 = new BankAccount(user2, eur, 500.0, 0.01, -200.0);

        System.out.println("Начальная информация:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.deposit(500.0);
        account1.withdraw(200.0);
        account2.withdraw(100.0);

        System.out.println("Обновлённая информация:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.convertBalance(eur);
        account2.convertBalance(usd);

        System.out.println("Итоговая информация::");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}