package com.statistics.account.UserAccount;

import com.statistics.account.emailAddress.EmailAddress;
import com.statistics.account.emailAddress.InvalidEmailExceprion;




public class UserAccount
{
	private String mFirstName;
	private String mSecondName;
	private EmailAddress mEmailAddress;
	

	public UserAccount(String firstName, String secondName, EmailAddress email) throws InvalidUserAccountException
	{
		this.mFirstName = firstName;
		this.mSecondName = secondName;
	/*
	 * validation is in constructor of EmailAddress;
	 * if not -> null + InvalidEmailException;
	 */
		if (email != null)
			this.mEmailAddress = email;
		else
		/*
		 * if InvalidEmailException is caught and email = null
		 * -> InvalidUserAccountException to upper class; 
		 */
			throw new InvalidUserAccountException();
	}
	
	public String getFirstName()
	{
		return this.mFirstName;
	}
	
	public void setFirstName(final String newFirstName)
	{
		this.mFirstName = newFirstName;
	}
	
	public EmailAddress getEmailAddress()
	{
		return this.mEmailAddress;
	}
	
	public void setEmailAddress(final EmailAddress newEmailAddress) throws InvalidEmailExceprion
	{
		if (newEmailAddress != null)
			this.mEmailAddress = newEmailAddress;
		else
			throw new InvalidEmailExceprion();
	}

	public String getSecondName()
	{
		return mSecondName;
	}

	public void setSecondName(final String newSecondName)
	{
		this.mSecondName = newSecondName;
	}
}
