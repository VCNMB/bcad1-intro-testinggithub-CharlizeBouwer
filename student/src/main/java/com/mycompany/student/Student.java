/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author lab_services_student
 */
public class Student {

   
        
         private String strStudentName, strStudentCourse;
    
    private double dblStudentAverage;
    
    public void setName(String strName) {
        
        
        strStudentName = strName;
        
        
    }
    
    public String getName()
    {
        return strStudentName;
    }
    
    
    public void setcourse(String strCourse)
    {
         strStudentCourse= strCourse;
    }
    
    public String getCourse ()
    {
        return strStudentCourse;
    }
    
    public void setAverage(double dblAverage)
    {
      dblStudentAverage  = dblAverage;
    }
    
    public double getAverage()
    {
        return (dblStudentAverage +(dblStudentAverage * 0.10));
    }
    
    }
}
