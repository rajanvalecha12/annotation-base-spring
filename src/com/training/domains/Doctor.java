
package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {
	
	@Value("Rajesh Khanna")
	private String docName;
	
	@Value("9988424767")
	private long phoneNumber;

	@Autowired
	@Qualifier("inPat")
	private Patient patient;
	
	
	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + ", patient=" + patient + "]";
	}

	public Patient getPatient() {
		System.out.println("getter called");
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor(String docName, long phoneNumber) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init called==============");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy called==============");
	}
	
}
