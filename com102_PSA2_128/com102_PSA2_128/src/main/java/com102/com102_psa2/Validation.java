package com102.com102_psa2;

// import localdate and chronoUnit so age of students can be verified
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


import java.util.Scanner;

/**
 *
 * @author mayan
 */
public class Validation extends COM102_PSA2 {
    
    Scanner hold = new Scanner(System.in);
    
    public String verifyAge()
    {
        String dob = "";
        // Create year, month and day int variables to be returned and 
        // referenced throughout
        int dYear = 0;
        int dMonth = 0;
        int dDay = 0;
        
        // Find student's year of birth
        System.out.println("Enter the student's year of birth: ");
        dYear = hold.nextInt();
        
        // Find the student's month of birth for Day validation and info.
        // Create a flag loop to break once a valid option is input
        boolean Flag = true;
        while(Flag == true)
        {
            System.out.println("Enter the student's month of birth: ");
            dMonth = hold.nextInt();
            if((dMonth < 1) || (dMonth > 12))
                System.out.println("Enter a valid number(1-12)");
            else
                Flag = false;
        }
        
        // Find the student's day of birth
        // Create a flag loop to break once a valid day option is input for the correct month
        boolean Status = true;
        while(Status == true)
        {
            System.out.println("Enter the student's day of birth: ");
            dDay = hold.nextInt();
            if(dMonth == 2)
            {
                if((dDay < 1) || (dDay > 29))
                System.out.println("Enter a valid number(1-29)");
                else
                    Status = false;
            }
            else if((dMonth == 4) || (dMonth == 6) || (dMonth == 9) || (dMonth == 11))
            {
                if((dDay < 1) || (dDay > 30))
                System.out.println("Enter a valid number(1-30)");
                else
                    Status = false;
            }
            else
            {
                if((dDay < 1) || (dDay > 31))
                    System.out.println("Enter a valid number(1-31)");
                else
                    Status = false;
            }
        }
        
        //Create a local date variable using the info input by the user which
        //is then compared to another local date variable set to the current day
        LocalDate studentDOB = LocalDate.of(dYear, dMonth, dDay);
        LocalDate CurrentDate = LocalDate.now();
        
        // Create string versions of each input
        String sDay = String.valueOf(dDay);
        String sMonth = String.valueOf(dMonth);
        String sYear = String.valueOf(dYear);
        
        // Calculate the years between the two dates
        long years = ChronoUnit.YEARS.between(studentDOB, CurrentDate);
        
        // Format dDay and dMonth to be 0X if it is less than 10 where x is original value
        if(dDay < 10)
            sDay = 0 + sDay;
        if(dMonth < 10)
            sMonth = 0 + sMonth;
        
        // If the student is younger than 18, User is returned to menu, if not 
        // then an appened String is returned to the addStudent method.
        if(years < 18)
        {
            System.out.println("This student is too young.");
            System.out.println("");
            menu();
        }
        else
        {
            // Apend string version of dDay, dMonth and dYear to Date of Birth
            dob = sDay + "/" + sMonth + "/" + sYear;
        }
    return dob;
    
    }
    
    public String verifyGender() //Gender verification
    {
        String gender = null;
        boolean Flag = true;
        while(Flag == true)
        {
            System.out.println("Enter the student's gender(m/f): ");
            String data = hold.next();
            String input = data.toUpperCase();
        
            switch (input) 
            {
                case "M" -> 
                {
                    gender = "Male";
                    Flag = false;
                }
                case "F" -> 
                {
                    gender = "Female";
                    Flag = false;
                }
                default -> 
                {
                    for(int i = 0;i < 1; i++)
                        System.out.println("Enter a valid option.");
                }
            }
        }
    return gender;
    }
    
    public String verifyStudy()
    {
        String mode = null;
        
        boolean Status = true;
        while(Status == true)
        {
            System.out.println("Enter the student's mode of study(p/f): ");
            String data = hold.next();
            String input = data.toUpperCase();
        
            switch (input) 
            {
                case "P" -> 
                {
                    mode = "PT";
                    Status = false;
                }
                case "F" -> 
                {
                    mode = "FT";
                    Status = false;
                }
                default -> 
                {
                    for(int i = 0;i < 1; i++)
                        System.out.println("Enter a valid option.");
                }
            }
        }
        return mode;
    }
    
    public int verifyYear() //Course year value check
    {
        int year = 0;
        
        boolean Status = true;
        while(Status)
        {
            System.out.println("Enter the student's course year: ");
            year = hold.nextInt();
        
            if((year < 1) || (year > 4))
            {
                System.out.println("Enter a valid option (1-4)");
            }
            else
                Status = false;
        }
        
        return year;
        
    }
    
    public int verifyModules() //Module amount check
    {
        int modules = 0;
        
        boolean Status = true;
        
        while(Status)
        {
            System.out.println("Enter the student's number of modules: ");
            modules = hold.nextInt();
        
            if((modules < 1) || (modules > 6))
            {
                System.out.println("Enter a valid option (1-6)");
            }
            else
                Status = false;
        }
        
        return modules;
    
    }
}
