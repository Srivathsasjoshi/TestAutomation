package com.sgtesting.org.constructor;

class CentralBank
{
	String bankname;
	private int accountNo;
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
}

public class Encaps {

	public static void main(String[] args) {
		
		CentralBank bank=new CentralBank();
		bank.bankname="Canara Bank";
		System.out.println("Bank name is "+bank.bankname);
		
		bank.setAccountNo(1011201725);
		System.out.println(bank.getAccountNo());

	}

}
