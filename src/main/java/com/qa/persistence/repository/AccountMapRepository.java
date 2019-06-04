package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository {

	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	JSONUtil jsonutil = new JSONUtil();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature
	// THINK - if the parameter is a String, or the return type is a String
	// How can I convert to a String from an Object?
	// What utility methods do I have available?

	// You must complete this section using TDD
	// You can use the suggested tests or build your own.

	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return accountMap.toString();
	}

	public String createAccount(String account) {
		// TODO Auto-generated method stub
		Account newAccount = jsonutil.getObjectForJSON(account, Account.class);
		accountMap.put(newAccount.getId(), newAccount);
		return null;
	}

	public String deleteAccount(int accountNumber) {
		// TODO Auto-generated method stu
		accountMap.remove(accountNumber);
		return null;
	}

	public String updateAccount(int accountNumber, String account) {
		// TODO Auto-generated method stub
		Account updateAccount = jsonutil.getObjectForJSON(account, Account.class);
		accountMap.put(accountNumber, updateAccount);
		return null;
	}

}
