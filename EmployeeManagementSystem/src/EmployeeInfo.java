/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author snyou
 */
public class EmployeeInfo {
    public int empNum;
    public String firstName;
    public String lastName;
    public String gender;
    public String workLoc;
    public double deductRate;
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    
    public double calcNetAnnualIncome() {
        return (-1.0);
    }
}