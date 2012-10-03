package br.com.util.annotation.validate.impl;

import br.com.util.annotation.enums.ContactType;
import br.com.util.annotation.validate.Contact;

public class BeanTeste{
	private String name;

	@Contact(type=ContactType.PHONE)
	private String phone;

	@Contact(type=ContactType.MOBILE)
	private String mobilePhone;

	@Contact(type=ContactType.WEBSITE)
	private String website;

	@Contact(type=ContactType.EMAIL)
	private String email;

	private String address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}