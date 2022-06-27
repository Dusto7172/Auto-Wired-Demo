package autowired;

public class Account {

	int accNo;
	String accType;

	public Account() {
		super();
	}

	public Account(int accNo, String accType) {
		super();
		this.accNo = accNo;
		this.accType = accType;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + "]";
	}

}
