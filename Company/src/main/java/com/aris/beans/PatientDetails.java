package com.aris.beans;

public class PatientDetails {
      private String DOC_ID;
      private int PAT_ID;
      private String DATE_OF_REQUEST;
      private String DATE_OF_APPOINTMENT;
      private int PATIENT_CONTACT;
	public String getDOC_ID() {
		return DOC_ID;
	}
	public void setDOC_ID(String dOC_ID) {
		DOC_ID = dOC_ID;
	}
	public int getPAT_ID() {
		return PAT_ID;
	}
	public void setPAT_ID(int pAT_ID) {
		PAT_ID = pAT_ID;
	}
	
	public String getDATE_OF_REQUEST() {
		return DATE_OF_REQUEST;
	}
	public void setDATE_OF_REQUEST(String dATE_OF_REQUEST) {
		DATE_OF_REQUEST = dATE_OF_REQUEST;
	}
	public String getDATE_OF_APPOINTMENT() {
		return DATE_OF_APPOINTMENT;
	}
	public void setDATE_OF_APPOINTMENT(String dATE_OF_APPOINTMENT) {
		DATE_OF_APPOINTMENT = dATE_OF_APPOINTMENT;
	}
	public int getPATIENT_CONTACT() {
		return PATIENT_CONTACT;
	}
	public void setPATIENT_CONTACT(int pATIENT_CONTACT) {
		PATIENT_CONTACT = pATIENT_CONTACT;
	}
}
