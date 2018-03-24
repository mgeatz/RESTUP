package api.restup.general.service;

public class CustomerIP {

	private String customerIp;

	public CustomerIP(String clientIp){
		customerIp = clientIp;
	}

	public String getCustomerIp() {
		return customerIp;
	}

}
