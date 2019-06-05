package com.qa.MapTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;
import com.qa.util.JSONUtil;

public class AccountServiceTest {

	AccountMapRepository amr;
	JSONUtil jutil;
	Account acc1;
	Account acc2;
	Account acc3;

	@Before
	public void setup() {
		amr = new AccountMapRepository();
		jutil = new JSONUtil();
		acc1 = new Account(1, 1, "Lucy", "Shilling");
		acc2 = new Account(2, 2, "Tom", "Shilling");
		acc3 = new Account(3, 3, "Charlie", "Shilling");
	}

	@Test
	public void addAccountTest() {

		System.out.println(jutil.getJSONForObject(acc1));

		assertTrue(amr.getAllAccounts() != null);
	}

	@Test
	public void add2AccountsTest() {

		System.out.println(jutil.getJSONForObject(acc2));
		System.out.println(jutil.getJSONForObject(acc3));

		assertTrue(amr.getAllAccounts() != null);
	}

	@Test
	public void removeAccountTest() {

		String newAcc1 = jutil.getJSONForObject(acc1);
		amr.createAccount(newAcc1);

		assertEquals("Account deleted", amr.deleteAccount(1));

	}

	@Test
	public void remove2AccountsTest() {

		String newAcc2 = jutil.getJSONForObject(acc2);
		String newAcc3 = jutil.getJSONForObject(acc3);
		amr.createAccount(newAcc2);
		amr.createAccount(newAcc3);

		assertEquals("Account deleted", amr.deleteAccount(2), amr.deleteAccount(3));
	}

	@Test
	public void remove2AccountTestAnd1ThatDoesntExist() {
		fail("TODO");
	}

	@Test
	public void jsonStringToAccountConversionTest() {
		// testing JSONUtil
		fail("TODO");
	}

	@Test
	public void accountConversionToJSONTest() {
		// testing JSONUtil
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenOne() {
		// For a later piece of functionality
		fail("TODO");
	}

	@Test
	public void getCountForFirstNamesInAccountWhenTwo() {
		// For a later piece of functionality
		fail("TODO");
	}

}
