package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	int id;
	String name;
	
	@Autowired	
	@Qualifier("account")
	Account account;
	Bank bank;
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Bank getBank() {
		return bank;
	}
	@Autowired
	@Qualifier("bank")
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer() {
		super();
	}
	
	@Autowired
	public Customer(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + ", bank=" + bank + ", address="
				+ address + "]";
	}

}
