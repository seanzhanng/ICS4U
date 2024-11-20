/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author snyou
 */
public class FTE extends EmployeeInfo {
    public double yearlySalary;
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    public double calcNetAnnualIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
}