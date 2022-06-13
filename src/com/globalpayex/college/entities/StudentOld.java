package com.globalpayex.college.entities;

public class StudentOld {


public String name;
public char gender;
public int Roll;
public float marks;
public static int count;
public StudentOld(){
	this("NA", 'm', 25, 0.0f);
}

public StudentOld(String Name, char gender, int roll, float marks){
	this.name=Name;
	this.gender=gender;
	this.Roll=roll;
	this.marks=marks;
	++StudentOld.count;
}
public String getDetails() {
	//implicit parameter called as this
	//return "Name: " +this.name+"\nGender:"+this.gender+"\nRoll:"+this.Roll+"\nMarks:"+this.marks;//
	return String.format("name:%s\ngender:%s\nroll:%s\nmarks:%s", this.name,this.gender,this.Roll,this.marks);
}
public 
public char getGrade() {
	char grade;
	
	if(marks<0||marks>100) {
		grade ='I';
		
	}
	else if (marks>=70) {
		grade='A';
	}
	else if(marks>=60){
		grade='B';
	}
	else if(marks>=50) {
		grade ='C';
	}
	else {
		grade ='F';
	}
	return grade;
}
public static StudentOld newInstance(String Name, char gender, int roll, float marks) {
	return new StudentOld(Name, gender,roll,marks);
	
}

}

