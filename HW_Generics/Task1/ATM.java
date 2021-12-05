import java.math.BigDecimal;

public class ATM<T extends Account> {
    public void withdraw(T account, BigDecimal amount) {
        account.debit(amount);
    }

    public void deposit(T account, BigDecimal amount) {
        account.credit(amount);
    }
}