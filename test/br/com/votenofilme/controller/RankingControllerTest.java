/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.controller;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author avmartins
 */
public class RankingControllerTest {
    
	RankingController instance = null;
	
    public RankingControllerTest() {
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
     * Test of ranking method, of class RankingController.
     */
    @Test
    public void testRanking() {
        System.out.println("ranking");
        //RankingController instance = null;
        instance.ranking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of index method, of class RankingController.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        String voto = "1";
        String idFilme1 = "1";
        String idFilme2 = "2";
        String nome = "Anderson";
        String email = "email@email.com";
        instance.index(voto, idFilme1, idFilme2, nome, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
