package api.restup.general.service;

import api.restup.general.dao.EmailSignUpDao;

public class EmailSignUp {

	private String          emailAddress;
	private String          clientIP;

	public EmailSignUp(String emailAddress, String clientIP) {
		this.emailAddress = emailAddress;
		this.clientIP = clientIP;

		EmailSignUpDao emailSignUpDao = new EmailSignUpDao();
		emailSignUpDao.addEmail(emailAddress, clientIP);
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

}
