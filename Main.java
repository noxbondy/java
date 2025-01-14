import org.example.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder="Noxbondy";
        account1.balance =100.00;
        BankAccount account2 = new BankAccount();
        account2.accountHoler ="NOur";
        account2.balance =100.00;
        BankAccount.interesRate =6.8;
        account1.displayAccountinfo();
        account2.displayAccountinfo();
        account1.deposit(100.00);
        account1.withdraw(200);
        account1.dispalyAccountinfo();
        System.out.println("Total Loan Repayment Amount: " + BankAccount.calculateLoanPayment(10000, 2));






    }
}