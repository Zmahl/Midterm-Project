package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	//no arg constructor for Enrollment
	
	private Enrollment(){
	}
	
	
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		super();
		this.EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	
	}
	
	
	public void setGrade(double grade){
		Grade = grade;
		
		}
}
