package com.ikea;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeMain{

  public static void main(String[] args) {
    List<CGEmployee> cgEmployeeList = new ArrayList<>();
    //Set
    //Map
    CGEmployee emp3 = new CGEmployee("tom", "b", "1234567", 2000, "pune", "cg","ODI",true);
    CGEmployee emp4 = new CGEmployee("jack", "b", "1234555", 6000, "bangalore", "cg","ODI",false);
    CGEmployee emp5 = new CGEmployee("perugu", "b", "46045355", 4000, "bangalore", "cg","ODI", true);
    CGEmployee emp6 = new CGEmployee("ravi", "b", "46045321", 5000, "hyderabad", "cg", "ODI",true);
    cgEmployeeList.add(emp3);
    cgEmployeeList.add(emp4);
    cgEmployeeList.add(emp5);
    cgEmployeeList.add(emp6);
    EmployeeRelated employeeRelated = new EmployeeRelated();
    employeeRelated.isVaccinated(cgEmployeeList);
    int uniqueHomeAddressCount=employeeRelated.getUniqueHomeAddressCityCount(cgEmployeeList);
    System.out.println("the unique home address count is: "+uniqueHomeAddressCount );
    Map<String, String> salaryDetail=employeeRelated.getSalaryDetail(cgEmployeeList);
    System.out.println(salaryDetail);
    Map<String, CGEmployee> employeeSalaryDetail=employeeRelated.getSalaryDetail2(cgEmployeeList);
    System.out.println(employeeSalaryDetail);
  }
}
