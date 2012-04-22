package com.statistics.account;

import com.statistics.account.UserAccount.InvalidUserAccountException;
import com.statistics.account.UserAccount.UserAccount;
import com.statistics.account.emailAddress.EmailAddress;
import com.statistics.account.emailAddress.InvalidEmailExceprion;


public class AccountFoo
{

	public static void main(String[] args) 
	{
		String firstName = "Andrii";
		String secondName = "Patsula";
		EmailAddress email = null;
		
		try
		{
			email = new EmailAddress("@ap@gmail.com");
		}
		catch (InvalidEmailExceprion ex)
		{
			System.out.println("This email address is not correct!");
		}
		
		try
		{
			UserAccount ua = null;
			
			try
			{
				ua = new UserAccount(firstName, secondName, email);
			}
			catch (InvalidUserAccountException ex)
			{
				System.out.println("Invalid UserName fields!");
			}
			
			System.out.println(ua.getEmailAddress());
			
			try 
			{
				ua.setEmailAddress(new EmailAddress("@asd.com"));
			}
			catch (InvalidEmailExceprion e)
			{
				System.out.println("This email address is not correct!");
			}
			
			System.out.println(ua.getEmailAddress());
		}
		catch (NullPointerException ex)
		{
			System.out.println("UserAccount is not created!");
		}
	}
}
