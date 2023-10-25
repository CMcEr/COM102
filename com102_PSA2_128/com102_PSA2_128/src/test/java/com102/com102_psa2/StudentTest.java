/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com102.com102_psa2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Calum
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String sName = "James Williamson";
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setName(sName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        String expResult = "James Gunn";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDOB method, of class Student.
     */
    
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        String sDOB = "05/02/2002";
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setDOB(sDOB);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class Student.
     */
    
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        String expResult = "05/02/2001";
        String result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Student.
     */
    
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String sGender = "Male";
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setGender(sGender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Student.
     */
    
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudy method, of class Student.
     */
    
    @Test
    public void testSetStudy() {
        System.out.println("setStudy");
        String sMode = "PT";
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setStudy(sMode);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudy method, of class Student.
     */
    
    @Test
    public void testGetStudy() {
        System.out.println("getStudy");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        String expResult = "FT";
        String result = instance.getStudy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Student.
     */
    
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int sYear = 3;
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setYear(sYear);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Student.
     */
    
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 2, 6, 5000);
        int expResult = 2;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class Student.
     */
    
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        int sModules = 5;
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setModules(sModules);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Student.
     */
    
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        int expResult = 6;
        int result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFees method, of class Student.
     */
    
    @Test
    public void testSetFees() {
        System.out.println("setFees");
        int sFees = 2500;
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        instance.setFees(sFees);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFees method, of class Student.
     */
    
    @Test
    public void testGetFees()
    {
        System.out.println("getFees");
        Student instance = new Student("James Gunn", "05/02/2001", "Male", "FT", 0, 6, 5000);
        int expResult = 5000;
        int result = instance.getFees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
