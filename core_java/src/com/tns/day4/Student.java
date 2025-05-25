package com.tns.day4;

public class Student extends Citizen {

    private int rollNo;
    private String collegeName;

    // Default constructor (implicitly present if no other constructors are defined)
    public Student() {
        super(); // Calls the default constructor of the Citizen class
    }

    // Parameterized constructor
    public Student(String address, String name, String aadharNo, int phNo, int rollNo, String collegeName) {
        super(address, name, aadharNo, phNo); // Calls the parameterized constructor of the Citizen class
        this.collegeName = collegeName;
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", " + super.toString() + "]";
    }
}
