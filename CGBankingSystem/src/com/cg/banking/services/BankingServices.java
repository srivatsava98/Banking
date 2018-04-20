package com.cg.banking.services;
import com.cg.banking.beans.Account;
import com.cg.banking.beans.Customer;
import com.cg.banking.beans.Transaction;
public interface BankingServices {
	
	int acceptCustomerDetails(String firstName,String lastName,String customerEmailId,String panCard,String localAddressCity,
			String localAddressState,int localAddressPinCode,String homeAddressCity,
			String homeAddressState,int homeAddressPinCode);
	
	long openAccount(int customerId,String accountType,float initBalance);
	
	float depositAmount(int customerId,long accountNo,float amount);
	
	float withdrawAmount(int customerId,long accountNo,float amount,int pinNumber);
	
	boolean fundTransfer(int customerIdTo,long accountNoTo,int customerIdFrom,long accountNoFrom,float transferAmount,int pinNumber);
	
	Customer getCustomerDetails(int customerId);
	
	Account getAccountDetails(int customerId,long accountNo);
	
	int generateNewPin(int customerId,long accountNo);
	
	boolean changeAccountPin(int customerId,long accountNo,int oldPinNumber,int newPinNumber);
	
	Customer []  getAllCustomerDetails();
	
	Account [] getcustomerAllAccountDetails(int customerId);
	
	Transaction[] getAccountAllTransaction(int customerId,long accountNo);
	
	String accountStatus(int customerId,long accountNo);
}