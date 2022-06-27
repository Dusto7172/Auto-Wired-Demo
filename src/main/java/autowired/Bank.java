package autowired;

public class Bank {

	String bankName;
	String branch;
	int branchCode;

	public Bank() {
		super();
	}

	public Bank(String bankName, String branch, int branchCode) {
		super();
		this.bankName = bankName;
		this.branch = branch;
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branch=" + branch + ", branchCode=" + branchCode + "]";
	}

}
