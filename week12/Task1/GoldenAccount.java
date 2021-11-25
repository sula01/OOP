import java.math.BigDecimal;

public class GoldenAccount extends Account {
	public GoldenAccount(String number, String status, Client owner, BigDecimal balance) {
		super(number, status, owner, balance);
	}

	@Override
	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		newBalance = newBalance.add(new BigDecimal("100.00"));

		balance = newBalance;

		operations[opIndex] = "Debit " + amount.toString();
		opIndex++;
	}


	@Override
	public void paymentForService() {
		balance = balance.subtract(new BigDecimal("3000.00"));
	}

	@Override
	protected String balanceBuilder() {
		return "**** Your golden account balance is " + balance.toString() + "****";
	}
}