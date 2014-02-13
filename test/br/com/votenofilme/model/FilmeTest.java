/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.model;

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
public class FilmeTest {
    
    public FilmeTest() {
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
     * Test of getIdFilme method, of class Filme.
     */
    @Test
    public void testGetIdFilme() {
        System.out.println("getIdFilme");
        Filme instance = new Filme();
        Long expResult = null;
        Long result = instance.getIdFilme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFilme method, of class Filme.
     */
    @Test
    public void testSetIdFilme() {
        System.out.println("setIdFilme");
        Long idFilme = null;
        Filme instance = new Filme();
        instance.setIdFilme(idFilme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Filme.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Filme.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Filme instance = new Filme();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSinopse method, of class Filme.
     */
    @Test
    public void testGetSinopse() {
        System.out.println("getSinopse");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getSinopse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSinopse method, of class Filme.
     */
    @Test
    public void testSetSinopse() {
        System.out.println("setSinopse");
        String sinopse = "";
        Filme instance = new Filme();
        instance.setSinopse(sinopse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagePath method, of class Filme.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getImagePath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagePath method, of class Filme.
     */
    @Test
    public void testSetImagePath() {
        System.out.println("setImagePath");
        String imagePath = "";
        Filme instance = new Filme();
        instance.setImagePath(imagePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Filme.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Filme instance = new Filme();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Filme.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Filme instance = new Filme();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Filme.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
