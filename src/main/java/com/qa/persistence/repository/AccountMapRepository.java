package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository {

	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	JSONUtil json = new JSONUtil();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature
	// THINK - if the parameter is a String, or the return type is a String
	// How can I convert to a String from an Object?
	// What utility methods do I have available?

	// You must complete this section using TDD
	// You can use the suggested tests or build your own.

	public String getAllAccounts() {
		return json.getJSONForObject(accountMap);
	}

	public String createAccount(String account) {
		Account newAccount = json.getObjectForJSON(account, Account.class);
		accountMap.put(newAccount.getId(), newAccount);
		return "Account created";
	}

	public String deleteAccount(int accountNumber) {
		accountMap.remove(accountNumber);
		return "Account deleted";
	}

	public String updateAccount(int accountNumber, String account) {
		Account updateAccount = json.getObjectForJSON(account, Account.class);
		accountMap.replace(accountNumber, updateAccount);
		return "Account updated";
	}

}
