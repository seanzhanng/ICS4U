/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ems;

/**
 *
 * @author snyou
 */
public class PTE extends EmployeeInfo {
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    public double getHourlyWage() {
        return hourlyWage;
    }
    
    public double getHoursPerWeek() {
        return hoursPerWeek;
    }
    
    public double getWeeksPerYear() {
        return weeksPerYear;
    }
    
    public double getYearlySalary() {
        return (hourlyWage * hoursPerWeek * weeksPerYear);
    }
    
    public double calcNetAnnualIncome() {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) *(1.0 - deductRate));
    }
}