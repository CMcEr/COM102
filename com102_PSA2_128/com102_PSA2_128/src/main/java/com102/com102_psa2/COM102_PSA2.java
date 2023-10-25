
package com102.com102_psa2;

import java.util.*;

// import file to be able to read text files
import java.io.File;
import java.io.FileNotFoundException;

// import java.text for decimal formatting for displayBody
import java.text.*;

// import io modules to export course and student details
import java.io.IOException;
import java.io.FileWriter;


public class COM102_PSA2 {

    // use a global scanner allow user input
    Scanner hold = new Scanner(System.in);
    
    // Create a global counter
    private int Counter = 0;
    
    // Create array list to hold student details
    public List<Student> courseStudents = new ArrayList<>();

    public static void main(String[] args) 
    {
        // Print a hello message to use an initialise the main class to
        // avoid use of static
        System.out.println("Welcome User!");
        COM102_PSA2 main = new COM102_PSA2();
        main.programStart();
    }
    
    public void programStart()
    {
        // Populate the array list before bringing up the menu
        findCounter();
        addStudentsToArray();
        menu();
    }
    
    private void findCounter()
    {
        try
        {
            // Import a file called file using the student details
            // text file and see how many lines are in the file
            // to limit the actual data import to avoid looping
            File file = new File("studentDetails.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNextLine())
            {
                input.nextLine();
                this.Counter++;
            }
        }
        // If the text file can't be found the user is told
        catch(FileNotFoundException error)
        {
            System.out.println("This file couldn't be found.");
        }
    }
    
    private void addStudentsToArray()
    {
        try
        {
            // Create variables which will be used to read specific data positions
            // from the student details 
            String name = null;
            String dob = null;
            String gender = null;
            String mode = null;
            int year = 0;
            int modules = 0;
            int fees = 0;
            
            // Create a file called file which represents the studentDetails
            // text file to be read from
            File file = new File("studentDetails.txt");
            Scanner input = new Scanner(file);
            
            // Counter from previous method is used to limit number of students
            // added to the number of students currently in the file
            for (int x = 0; x < Counter; x++)
            {
                // Read the file line by line and then append them to a temp array list
                String data = input.nextLine();
                // Use a temp array list to get specific elements of the data
                // and split the list elements based on commas
                List<String> tempList = Arrays.asList(data.split(","));
                for (int i = 0; i < 7; i++)
                {
                    name = tempList.get(0);
                    dob = tempList.get(1);
                    gender = tempList.get(2);
                    mode = tempList.get(3);
                    try
                    {
                        year = Integer.parseInt(tempList.get(4));
                    }
                    // If it isn't read properly, user will get an error
                    catch (NumberFormatException error)
                    {
                        System.out.println("There was an error gettin the student's course year.");
                    }
                    
                    try
                    {
                        modules = Integer.parseInt(tempList.get(5));
                    }
                    catch (NumberFormatException error)
                    {
                        System.out.println("There was an error gettin the student's number of modules.");
                    }
                    
                    try
                    {
                        fees = Integer.parseInt(tempList.get(6));
                    }
                    catch (NumberFormatException error)
                    {
                        System.out.println("There was an error gettin the student's course fees");
                    }  
                }
                // Create a new student using the variables and then add that student
                // to the array list
                Student student = new Student(name, dob, gender, mode,
                year, modules, fees);
                courseStudents.add(student);                           
            }
        }
        // If the file can't be found the user is given an error
        catch(FileNotFoundException error)
        {
            System.out.println("This file couldn't be found.");
        }
    }
        
    public void menu()
    {
        // Prompt the user on what their options are
         
        System.out.println("""
                           
                           What would you like to do?
                            1 - View the current student body in the course
                            2 - Add a new student to the course
                            3 - Delete a current student from the course
                            4 - Search for a specific student
                            5 - Quit the program""");
        System.out.println();
        System.out.println("Enter an option from 1-5:");

        Scanner userChoice = new Scanner(System.in);
        
        // Take the user's input and run methods based on inputs
        int userSelection = userChoice.nextInt();
        
        while (userSelection != 5)
        {
            switch (userSelection)
            {
                case 1 -> 
                {
                    // If User Choice equals 1, student body is printed.
                    displayBody();
                }
                case 2 -> 
                {
                    // If User Choice equals 2, allow user to add a new student
                    // First check there is room in the course, if so. Allow a new student.
                    addStudent();
                }
                case 3 -> 
                {
                    // If User Choice equals 3, allow user to delete a current student
                    deleteStudent();
                }
                case 4 -> 
                {
                    // If User choice equals 4, allow user to search for a specific student
                    findStudent();
                }
                default -> 
                {
                    // Tells the user to input a valid option
                    System.out.println("Enter a valid option");
                    menu();
                }
                    
            }
        }
        // If the user choice equals 5 then:
        // The student details and course details text files are updated
        // The students are displayed
        // The program quits and the user is told the program is quiting
        updateCourseDetails();
        updateStudentDetails();
        displayStudents();
        System.out.println("""  
                               Thank you for using the system.
                               Terminating program.
                               Goodbye user""");
        System.exit(0);
    }
    
    private void displayStudents()
    {
        // This will output the information of each student 
        for(Student student: courseStudents)
        {
            System.out.println(student.getName() + " " + student.getDOB()
                    + " " + student.getGender() + " " + student.getStudy()
                    + " " + student.getYear() + " " + student.getModules()
                    + " " + student.getFees());
        }
    }
    
    private void findStudent()
    {     
        // Prompt the user to enter the student's name,
        // name is upper cased to avoid case sensitivity
        System.out.println("Enter student's first name: ");
        String tempFirst = hold.next();
        String fName = tempFirst.toUpperCase();
        
        System.out.println("Enter the student's last name: ");
        String tempLast = hold.next();
        String sName = tempLast.toUpperCase();
        
        String data = fName + " " + sName;
        
        // The user inputted name is compared with upper cased version of every student's name
        // If the student's name and the inputted name are the same then the 
        // student's name is outputted to the user
        for(Student student: courseStudents)
        {
            String tempStudent = student.getName();
            String datComp = tempStudent.toUpperCase();
            if(data == null ? datComp == null : data.equals(datComp))
            {
                System.out.println("Information for: " + student.getName()
                        + "\nStudent's Date of Birth: " + student.getDOB()
                        + "\nStudent's Gender: " + student.getGender()
                        + "\nStudent's Mode of Study: " + student.getStudy()
                        + "\nStudent's Course Year: " + student.getYear()
                        + "\nStudent's Number of Modules: " + student.getModules()
                        + "\nStudent's Fees: £" + student.getFees()
                );  
                // Force the method to quit by calling the menu
                menu();
            }
        }
        // Return to the menu if the input student name can't be found
        System.out.println("That student couldn't be found.");
        
        menu();
    }
    
    private void displayBody()
    {
        // Create variables which are updated after running through the array list
        int stuPT =0;
        int stuFT =0;
        int currStudents = 0;
        double stuFemale =0;
        double stuMale = 0;
        String courseName = "Computer Science";
        
        
        for(Student student: courseStudents)
        {
            // Increment the current student counter
            currStudents++;
            // Increment Part time or full time variables based on a student's study mode
            if(student.getStudy().equals("PT"))
                stuPT++;
            else if(student.getStudy().equals("FT"))
                stuFT++;
        }
        
        // Increment the male and female student counters
        for(Student student: courseStudents)
        {
            if(student.getGender().equals("Male"))
                stuMale++;
            else if(student.getGender().equals("Female"))
                stuFemale++;
        }
        
        // Create a decimal format so the student percentages can be represented
        // by 2 decimal points if necessary
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Calculate the percentage of male and female students
        double calcMale = (stuMale / currStudents) * 100;
        double calcFemale = (stuFemale / currStudents) * 100;
        
        // Create string versions of male and female percentages which are formatted to 2 dp
        String percMale = df.format(calcMale) + "%";
        String percFemale = df.format(calcFemale) + "%";
        
        // Print the course name, number of PT and FT students and percentage of male and female students
        System.out.println("Course: " + courseName
                + "\nNumber of fulltime students: " + stuFT
                + "\nNumber of parttime students: " + stuPT
                + "\nPercentage of male students: " + percMale
                + "\nPercentage of female students: " + percFemale);  
        
        menu();
           
    }
    
    private void addStudent()
    {
        // Before the actual method is ran another method is ran to ensure
        // that the array doesn't already have 20 or more students in the array
        checkArray();
        
        Validation validate = new Validation(); //Call the validation class
        
        // Prompt user to enter student's name
        System.out.println("Enter the student's first name: ");
        String fName = hold.next();
        
        System.out.println("Enter the student's last name: ");
        String sName = hold.next();
        
        //Call public verifiers for each field      
        String verifiedDob = validate.verifyAge();
        
        String verifiedGender = validate.verifyGender();
        
        String verifiedStudy = validate.verifyStudy();
        
        int verifiedYear = validate.verifyYear();
        
        int verifiedModules = validate.verifyModules();
        
        String fullName = fName + " " + sName;

        Fees student = new Fees(fullName, verifiedDob, verifiedGender,
                verifiedStudy, verifiedYear, verifiedModules);
        
        courseStudents.add(student);
        
        menu();
    }
    
    private void deleteStudent()
    {
        // Prompt user to enter student's name,
        // input name is upper cased to avoid case senstivity
        System.out.println("Enter student's first name: ");
        String tempFirst = hold.next();
        String fName = tempFirst.toUpperCase();
        
        System.out.println("Enter the student's last name: ");
        String tempLast = hold.next();
        String sName = tempLast.toUpperCase();
        
        String data = fName + " " + sName;
        
        // Tell user that the student has been successfully removed if 
        // the student is found, force method to end by calling menu
        for(Student student: courseStudents)
        {
            String tempStudent = student.getName();
            String datComp = tempStudent.toUpperCase();
            if(data == null ? datComp == null : data.equals(datComp))
            {
                courseStudents.remove(student);
                System.out.println("This student has successfully been removed");
                menu();
            }
        }
        // Tell user that the student couldn't be found, force method end by calling menu
        System.out.println("That student couldn't be found.");
        
        menu();
    }   
    
    private void checkArray()
    {
        // Check that the course doesn't have more than 20 students in it
        int Length = courseStudents.size();
        if(Length >= 20)
        {
            System.out.println("Sorry, the course is at max capacity.");
            System.out.println("Remove a student to add another one.");   
            menu();
        }
    }
    
    private void updateCourseDetails()
    {
        // Calculate the course details and overrite the details to the file
        int stuPT =0;
        int stuFT =0;
        int currStudents = 0;
        double stuFemale =0;
        double stuMale = 0;
        String courseName = "Computer Science";
        
        for(Student student: courseStudents)
        {
            currStudents++;
            if(student.getStudy().equals("PT"))
                stuPT++;
            else if(student.getStudy().equals("FT"))
                stuFT++;
        }
        
        for(Student student: courseStudents)
        {
            if(student.getGender().equals("Male"))
                stuMale++;
            else if(student.getGender().equals("Female"))
                stuFemale++;
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        double calcMale = (stuMale / currStudents) * 100;
        double calcFemale = (stuFemale / currStudents) * 100;
        
        String percMale = df.format(calcMale) + "%";
        String percFemale = df.format(calcFemale) + "%";
        
        String stringbuilder = courseName + "," + stuFT + "," + stuPT + "," + percMale
                + "," + percFemale;
        
        try
        {
            FileWriter updateDetails = new FileWriter("courseDetails.txt");
            updateDetails.write(stringbuilder);
            updateDetails.close();
            System.out.println("Course details have successfully wrote to the file.");
        }
        catch(IOException error)
        {
            System.out.println("Course details couldn't successfully update.");
        }
    }
    
    private void updateStudentDetails()
    {  
        // Read the array line by line and update the variables for each line
        // Each line is then appended as a single string and written to the
        // Student course details
        
        String Stringbuilder;
        String name;
        String dob;
        String gender;
        String study;
        String year;
        String modules;
        String fees;
        
        try
        {
            FileWriter updateDetails = new FileWriter("studentDetails.txt");  
            for (Student stu: courseStudents)
            {
                name = stu.getName();
                dob = stu.getDOB();
                gender = stu.getGender();
                study = stu.getStudy();
                int iYear = stu.getYear();
                year = Integer.toString(iYear);
                int iModules = stu.getModules();
                modules = Integer.toString(iModules);
                int iFees = stu.getFees();
                fees = Integer.toString(iFees);
                
                Stringbuilder = name + "," + dob + "," + gender + "," + study
                        + "," + year + "," + modules + "," + fees;
                
                updateDetails.write(Stringbuilder + "\r");
            
            
            }
            updateDetails.close();
            System.out.println("Student Details has successfully wrote to the file.");
        }
        catch (IOException error)
        {
            System.out.println("Student details couldn't successfully be written to.");
        }
    }
}