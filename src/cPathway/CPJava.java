package cPathway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CPJava {
	String Name, Pathway, School;
	int Grade, OSIS, SSN;
	
	/*Personal Info*/
	String Gender, Pronoun, Nickname, Race, GradMonth, GradYear, ELL, IEP;
	String Allergies, AllergiesSpec, BiLing;
	
	/*Contact Info*/
	String EmailTemp, EmailPerm, Address, City, State;
	int PhoneHome, PhoneCell, Zip;

	public CPJava() {
		Name = "Logan Adams";
		Pathway = "Software Engineering";
		School = "Hillcrest High School";
		Grade = 12;
		OSIS = 224142273;
		
		
	}
	
	
	public static void main(String[] args) {
		CPJava PHold = new CPJava();
		System.out.println("OSIS: " + PHold.OSIS);
		System.out.println("Name: " + PHold.Name);
		System.out.println("Grade: " + PHold.Grade);
		System.out.println("School: " + PHold.School);
		System.out.println("Pathway: " + PHold.Pathway);
		System.out.println("SSN: " + PHold.SSN);
		
		System.out.println("  /|====================|  /");
		System.out.println(" / |Personal Information| /");
		System.out.println("/  |====================|/");
		System.out.println("Gender: " + PHold.Gender);
		System.out.println("Pronoun: " + PHold.Pronoun);
		System.out.println("Preferred Name: " + PHold.Nickname);
		System.out.println("Race: " + PHold.Race);
		System.out.println("Expected Graduation Month: " + PHold.GradMonth);
		System.out.println("Expected Graduation Year: " + PHold.GradYear);
		System.out.println("Are you an ELL: " + PHold.ELL);
		System.out.println("Are you an IEP: " + PHold.IEP);

	}

}
