package com.ford.bean;

import java.util.Date;

import javax.persistence.Column;

import java.sql.Timestamp;
public class Elms {

	private String trNo;
	private String testCell;
	private String testTitle;
	private Date testRequestDate;
	private String requesterCdsid;
	private String model;
	private String engineSerialNo;
	private String engineFuelingMethod;
	private String noEngineCylinder;
	private String testCategory;
	private String programDesc;
	private String comment;
	private String testRequestStatus;
	private String testRequestState;
	private Timestamp lastModifiedDate;
	private String testEngineerCdsId;
	private String prgModelYear;
	public Date getTestRequestDate() {
		return testRequestDate;
	}
	public void setTestRequestDate(Date testRequestDate) {
		this.testRequestDate = testRequestDate;
	}
	public String getEngineFuelingMethod() {
		return engineFuelingMethod;
	}
	public void setEngineFuelingMethod(String engineFuelingMethod) {
		this.engineFuelingMethod = engineFuelingMethod;
	}
	public String getNoEngineCylinder() {
		return noEngineCylinder;
	}
	public void setNoEngineCylinder(String noEngineCylinder) {
		this.noEngineCylinder = noEngineCylinder;
	}
	public String getTestCategory() {
		return testCategory;
	}
	public void setTestCategory(String testCategory) {
		this.testCategory = testCategory;
	}
	public String getProgramDesc() {
		return programDesc;
	}
	public void setProgramDesc(String programDesc) {
		this.programDesc = programDesc;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getTestEngineerCdsId() {
		return testEngineerCdsId;
	}
	public void setTestEngineerCdsId(String testEngineerCdsId) {
		this.testEngineerCdsId = testEngineerCdsId;
	}
	public String getPrgModelYear() {
		return prgModelYear;
	}
	public void setPrgModelYear(String prgModelYear) {
		this.prgModelYear = prgModelYear;
	}
	public String getPrgProgramDesc() {
		return prgProgramDesc;
	}
	public void setPrgProgramDesc(String prgProgramDesc) {
		this.prgProgramDesc = prgProgramDesc;
	}
	private String prgProgramDesc;

	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	public String getTestCell() {
		return testCell;
	}
	public void setTestCell(String testCell) {
		this.testCell = testCell;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getRequesterCdsid() {
		return requesterCdsid;
	}
	public void setRequesterCdsid(String requesterCdsid) {
		this.requesterCdsid = requesterCdsid;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

	public String getEngineSerialNo() {
		return engineSerialNo;
	}
	public void setEngineSerialNo(String engineSerialNo) {
		this.engineSerialNo = engineSerialNo;
	}
	public String getTestRequestStatus() {
		return testRequestStatus;
	}
	public void setTestRequestStatus(String testRequestStatus) {
		this.testRequestStatus = testRequestStatus;
	}
	public String getTestRequestState() {
		return testRequestState;
	}
	public void setTestRequestState(String testRequestState) {
		this.testRequestState = testRequestState;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	
	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
}
