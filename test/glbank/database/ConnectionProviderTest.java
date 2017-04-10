/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glbank.database;

import glbank.Client;
import glbank.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián Matta
 */
public class ConnectionProviderTest {
    
    // konstruktor
    public ConnectionProviderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmployeePasswordValid method, of class ConnectionProvider.
     */
    @Test
    public void testIsEmployeePasswordValid1() {
        System.out.println("isEmployeePasswordValid");
        String username = "Adrian";
        String password = "Matta";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
      
        
    }

    public void testIsEmployeePasswordValid2() {
        System.out.println("isEmployeePasswordValid");
        String username = "Adrian";
        String password = "Matta";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
       
        
    }
    
    @Test
    public void testIsEmployeePasswordValid3() {
        System.out.println("isEmployeePasswordValid");
        int idemp = 2;
        String password = "Matta";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(idemp, password);
        assertEquals(expResult, result);
      
        
    }
    
        @Test
        public void testIsEmployeePasswordValid4() {
        System.out.println("isEmployeePasswordValid");
        int idemp = 2;
        String password = "Matta";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.isEmployeePasswordValid(idemp, password);
        assertEquals(expResult, result);
       
        
    }
    
  
    @Test
    public void testGetEmployeeId1() {
        System.out.println("getEmployeeId");
        String username = "Matta";
        ConnectionProvider instance = new ConnectionProvider();
        int expResult = 2;
        int result = instance.getEmployeeId(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

  
    @Test
    public void testGetEmployeeId2() {
        System.out.println("getEmployeeId");
        String username = "Adrian";
        ConnectionProvider instance = new ConnectionProvider();
        int expResult = -1;
        int result = instance.getEmployeeId(username);
        assertEquals(expResult, result);
    }
    
  
    @Test
    public void testGetEmployeeId3() {
        System.out.println("getEmployeeId");
        String username = "Adrian";
        ConnectionProvider instance = new ConnectionProvider();
        int expResult = -1;
        int result = instance.getEmployeeId(username);
        assertEquals(expResult, result);
    }
    
    

    
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        int id = 2;
        ConnectionProvider instance = new ConnectionProvider();
        
        Employee result = instance.getEmployee(id);
        assertEquals("Adrian", result.getFirstname());
        assertEquals("Matta", result.getLastname());
        assertEquals(2, result.getIdemp());
        assertEquals("adrianmatta67@gmail.com/**/", result.getEmail());
        assertEquals('C', result.getPosition());
        
        
    }
    
   
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        int id = 1;
        ConnectionProvider instance = new ConnectionProvider();
        
        Client result = instance.getClient(id);
        assertEquals("Adrian", result.getFirstname());
        assertEquals("Matta", result.getLastname());
        assertEquals("adrianmatta67@gmail.com", result.getEmail());    
  