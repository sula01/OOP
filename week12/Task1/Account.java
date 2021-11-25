import java.math.BigDecimal;

public class Account {
	protected String number;
	protected String status;
	protected Client owner;
	protected BigDecimal balance;
	protected String[] operations;
	protected int opIndex;

	public Account(String number, String status, Client owner, BigDecimal balance) {
		this.number = number;
		if (status == null || !"1".equals(status) && !"2".equals(status)) {
			throw new IllegalArgumentException("Invalid status!");
		}
		this.status = status;
		this.owner = new Client(owner.getName(), owner.getPhone(), owner.getId());
		this.balance = balance;
		this.operations = new String[100];
	}

	public Client getOwner() {
		System.out.println("Inside bankaccount " + owner.getName());
		return new Client(owner.getName(), owner.getPhone(), owner.getId());
	}

	public String getNumber() {
		return number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == null || !"1".equals(status) && !"2".equals(status)) {
			throw new IllegalArgumentException("Invalid status!");
		}
		this.status = status;
	}

	protected String balanceBuilder() {
		return "Your regular account balance is " + balance.toString();
	}

	public String getBalance() {
		return balanceBuilder();
	}

	public void credit(BigDecimal amount) {
		balance = balance.add(amount);
		operations[opIndex] = "Credit " + amount.toString();
		opIndex++;
	}

	public void debit(BigDecimal amount) {
		BigDecimal newBalance = balance.subtract(amount);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("balance can not be negative");
		}

		balance = newBalance;

		operations[opIndex] = "Debit " + amount.toString();
		opIndex++;
	}

	public void paymentForService() {
		balance = balance.subtract(new BigDecimal("2000.00"));
	}

	public void getStatement() {
		StringBuilder s = new StringBuilder();
		for (String operation : operations) {
			if (operation == null) {
				break;
			}
			s.append(operation).append("\n");
		}
		System.out.println(s);
	}
	
}