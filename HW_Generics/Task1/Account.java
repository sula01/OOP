import java.math.BigDecimal;

public abstract class Account {
    protected String accountNumber;
    protected Client ownerName;
    protected BigDecimal balance;

    public Account(String accountNumber, Client ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public abstract void credit(BigDecimal balance);

    public abstract void debit(BigDecimal balance);
}