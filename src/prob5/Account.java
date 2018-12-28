package prob5;

public class Account {

	private String accountNo;
	private int balance;

	public Account() {
		this(null, 0);
	}
	
	public Account(String accountNo) {
		this(accountNo, 0);
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int money) {
		if (money < 0) {
			money = 0;
		}
		balance += money;
		System.out.println(accountNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다. 다시 시도해주세요.");
			return;
		}
		balance -= money;
		System.out.println(accountNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}

}