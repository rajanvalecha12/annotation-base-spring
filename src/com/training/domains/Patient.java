package com.training.domains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("outPat")
public class Patient {
	@Value("P103")
	private String patientId;
	
	@Value("ABC")
	private String patientName;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientId, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + "]";
	}
	
	
}
