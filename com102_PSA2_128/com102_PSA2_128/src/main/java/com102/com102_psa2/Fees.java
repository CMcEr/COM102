/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com102.com102_psa2;

public class Fees extends Student {
      
    public Fees(String sName, String sDOB, String sGender,
            String sMode, int sYear, int sModules)
    {
        //Constructor from student class
        super(sName, sDOB, sGender, sMode, sYear, sModules, 0);
        
        // Updates fees to the calculated value based on input from modules and study mode
        this.setFees(this.calcFees(sMode, sYear, sModules));
    }
    
    public int calcFees(String sMode, int sYear, int sModules)
    {
        int calc = 0;
        
        if(("FT".equals(sMode)) && (sYear == 3))
        {
            calc = 2500;
        }
        else if("FT".equals(sMode))
        {
            calc = 5000;
        }
        else if ("PT".equals(sMode))
        {
            calc = 750 * sModules;
            System.out.println("Test" + sModules);
        }
        
        return calc;
    }
    
}
