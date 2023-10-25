
package com102.com102_psa2;

public class Student extends COM102_PSA2 {
    
     // Constructor variables

    private String sName;
    private String sDOB;
    private String sGender;
    private String sMode;
    private int sYear;
    private int sModules;
    private int sFees;
    
    public Student(String Name, String DOB, String Gender, String Mode,
            int Year, int Modules, int Fees)
    {
    
        this.sName = Name;
        this.sDOB = DOB;
        this.sGender = Gender;
        this.sMode = Mode;
        this.sYear = Year;
        this.sModules = Modules;
        this.sFees = Fees;
        
    }

    
    // Get and set Student's name
    public void setName(String sName)
    {
        this.sName = sName;
    }
    public String getName()
    {
        return sName;
    }
    
    // Get and set Student's Date of Birth
    public void setDOB(String sDOB)
    {
        this.sDOB = sDOB;
    }
    public String getDOB()
    {
        return sDOB;
    }
    
    // Get and set Student's gender
    public void setGender(String sGender)
    {
        this.sGender = sGender;
    }
    public String getGender()
    {
        return sGender;
    }
    
    // Get and set Student's Study
    public void setStudy(String sMode)
    {
        this.sMode = sMode;
    }
    public String getStudy()
    {
        return sMode;
    }
    
    // Get and set Student's year of study
    public void setYear(int sYear)
    {
        this.sYear = sYear;
    }
    public int getYear()
    {
        return sYear;
    }
    
    // Get and set Student's number of modules
    public void setModules(int sModules)
    {
        this.sModules = sModules;
    }
    public int getModules()
    {
        return sModules;
    }
    
    // Get and set Student's fees
    public void setFees(int sFees)
    {
        this.sFees = sFees;
    }
    public int getFees()
    {
        return sFees;
    }
}
