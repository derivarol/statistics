package com.statistics.user.emailAddress;

import javax.mail.internet.InternetAddress;


public class EmailAddress
{
	private String mEmailAddress;
	
	
	public EmailAddress(String emailAddress) throws InvalidEmailExceprion
	{
		if (isValidEmailAddress(emailAddress))
			this.mEmailAddress = emailAddress;
		else
		{
		/*
		 * or exception InvaidEmailExceprion || InternetAddressException
		 */
			this.mEmailAddress = null;
			throw new InvalidEmailExceprion();
		}
	}
	
	public boolean isValidEmailAddress()
	{
	/*
	 * Question:
	 * is it correct to call static method inside class?
	 * or it better to duplicate implementation of validating email?
	 */
		return isValidEmailAddress(this.mEmailAddress);
	}
	
	static public boolean isValidEmailAddress(final String emailAddress)
	{
		if (emailAddress == null) return false;
		
		try
		{
		/*
		 *  to validate that this address conforms to the syntax rules of RFC 822;
		 *  if not -> InternetAddressException;
		 *  idea: http://www.javapractices.com/
		 */
			new InternetAddress(emailAddress);
		}
		catch (Exception ex)
		{
			return false;
		}
		
		if (!hasNameAndDomain(emailAddress)) return false;
		
		return true;
	}
	
	private static boolean hasNameAndDomain(String emailAddress)
	{
		String[] tokens = emailAddress.split("@");
		return 
			tokens.length == 2 &&
			tokens[0].trim().length()>0 && 
			tokens[1].trim().length()>0;
	}
	
	@Override
	public String toString()
	{
		return this.mEmailAddress;
	}
}

