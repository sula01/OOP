import java.math.BigDecimal;

interface Device{
    public void withdraw(Account account, BigDecimal amount);
    public void deposit(Account account, BigDecimal amount);
    public void getBalance(Account account);
    public void getStatement(Account account); 
}