package com.ford.bean;



import java.sql.Timestamp;

public class UserBean {

private int userId;
private String userRole;
private String admin1;
private String superUser1;
private String firstName;
private String lastName;
private boolean activate;
private String testTechnician1;
private boolean admin =false;
private boolean superUser=false;
private boolean testTechnician=false;
private boolean reader=false;
private boolean insReadTeam=false;
private String cdSid;
private Timestamp changeTime;
private String changedBy;



public boolean isActivate() {
	return activate;
}
public void setActivate(boolean activate) {
	this.activate = activate;
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
public String getAdmin1() {
	return admin1;
}
public void setAdmin1(String admin1) {
	this.admin1 = admin1;
}
public String getSuperUser1() {
	return superUser1;
}
public void setSuperUser1(String superUser1) {
	this.superUser1 = superUser1;
}
public String getTestTechnician1() {
	return testTechnician1;
}
public void setTestTechnician1(String testTechnician1) {
	this.testTechnician1 = testTechnician1;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserRole() {
	return userRole;
}
public void setUserRole(String userRole) {
	this.userRole = userRole;
}
public boolean isAdmin() {
	return admin;
}
public void setAdmin(boolean admin) {
	this.admin = admin;
}
public boolean isSuperUser() {
	return superUser;
}
public void setSuperUser(boolean superUser) {
	this.superUser = superUser;
}
public boolean isTestTechnician() {
	return testTechnician;
}
public void setTestTechnician(boolean testTechnician) {
	this.testTechnician = testTechnician;
}
public boolean isReader() {
	return reader;
}
public void setReader(boolean reader) {
	this.reader = reader;
}
public boolean isInsReadTeam() {
	return insReadTeam;
}
public void setInsReadTeam(boolean insReadTeam) {
	this.insReadTeam = insReadTeam;
}
public String getCdSid() {
	return cdSid;
}
public void setCdSid(String cdSid) {
	this.cdSid = cdSid;
}
public Timestamp getChangeTime() {
	return changeTime;
}
public void setChangeTime(Timestamp changeTime) {
	this.changeTime = changeTime;
}
public String getChangedBy() {
	return changedBy;
}
public void setChangedBy(String changedBy) {
	this.changedBy = changedBy;
}
@Override
public String toString() {
	return "UserBean [userId=" + userId + ", userRole=" + userRole + ", admin1=" + admin1 + ", superUser1=" + superUser1
			+ ", firstName=" + firstName + ", lastName=" + lastName + ", activate=" + activate + ", testTechnician1="
			+ testTechnician1 + ", admin=" + admin + ", superUser=" + superUser + ", testTechnician=" + testTechnician
			+ ", reader=" + reader + ", insReadTeam=" + insReadTeam + ", cdSid=" + cdSid + ", changeTime=" + changeTime
			+ ", changedBy=" + changedBy + "]";
}





}
