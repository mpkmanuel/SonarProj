package com.ford.bean;

public class UserCdSid {
private String cdSid;
private String firstName;
private String lastName;
public String getCdSid() {
	return cdSid;
}
public void setCdSid(String cdSid) {
	this.cdSid = cdSid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "UserCdSid [cdSid=" + cdSid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}

}
