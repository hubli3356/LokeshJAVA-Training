package com.ikea;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeRelated {
    public void isVaccinated(List<CGEmployee> cgEmployeeList) {

        int count1 = 0;
        int count2 = 0;

        for (CGEmployee e : cgEmployeeList) {
            if (e.isVaccinated()) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1 + " are vaccinated and  " + count2 + " are not vaccinated");
    }

    public int getUniqueHomeAddressCityCount(List<CGEmployee> cgEmployeeList) {
        Set<String> uniqueHomeAddress = new HashSet<>();
        for (CGEmployee e : cgEmployeeList) {
            System.out.println(e.getHomeAddress());
            uniqueHomeAddress.add(e.getHomeAddress());
        }

        return uniqueHomeAddress.size();
    }


    public Map<String, String> getSalaryDetail(List<CGEmployee> cgEmployeeList) {

        Map<String, String> salaryDetail = new HashMap<>();
        for (CGEmployee e : cgEmployeeList) {
            if (e.getSalary() >= 5000) {
                salaryDetail.put(e.getEmpno(), e.getFirstName()+" "+e.getLastName()+" has a salary "+ e.getSalary());
            }
        }
        return salaryDetail;
    }

    public Map<String, CGEmployee> getSalaryDetail2(List<CGEmployee> cgEmployeeList) {

        Map<String, CGEmployee> salaryDetail = new HashMap<>();
        for (CGEmployee e : cgEmployeeList) {
            if (e.getSalary() >= 5000) {
                salaryDetail.put(e.getEmpno(),e);
            }
        }
        try{

            int data=100/0;
        }catch(ArithmeticException e){e.printStackTrace();}

        return salaryDetail;
    }
}

