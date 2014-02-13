/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avmartins
 */
public class IndexControllerTest {
    
    public IndexControllerTest() {
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
     * Test of index method, of class IndexController.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        IndexController instance = null;
        instance.index();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of index method, of class IndexController.
     */
    @Test
    public void testIndex_3args() {
        System.out.println("index");
        String voto = "";
        String idFilme1 = "";
        String idFilme2 = "";
        IndexController instance = null;
        instance.index(voto, idFilme1, idFilme2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
