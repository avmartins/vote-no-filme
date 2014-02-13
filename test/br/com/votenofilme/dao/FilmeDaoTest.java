/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.dao;

import br.com.votenofilme.model.Filme;
import java.util.List;
import org.hibernate.Session;
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
public class FilmeDaoTest {
    
    public FilmeDaoTest() {
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
     * Test of getSession method, of class FilmeDao.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        FilmeDao instance = null;
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTudo method, of class FilmeDao.
     */
    @Test
    public void testListaTudo() {
        System.out.println("listaTudo");
        FilmeDao instance = null;
        List<Filme> expResult = null;
        List<Filme> result = instance.listaTudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salva method, of class FilmeDao.
     */
    @Test
    public void testSalva() {
        System.out.println("salva");
        Filme filme = null;
        FilmeDao instance = null;
        Filme expResult = null;
        Filme result = instance.salva(filme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carrega method, of class FilmeDao.
     */
    @Test
    public void testCarrega() {
        System.out.println("carrega");
        Long id = null;
        FilmeDao instance = null;
        Filme expResult = null;
        Filme result = instance.carrega(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualiza method, of class FilmeDao.
     */
    @Test
    public void testAtualiza() {
        System.out.println("atualiza");
        Filme filme = null;
        FilmeDao instance = null;
        instance.atualiza(filme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class FilmeDao.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Filme filme = null;
        FilmeDao instance = null;
        instance.remove(filme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaUltimoFime method, of class FilmeDao.
     */
    @Test
    public void testListaUltimoFime() {
        System.out.println("listaUltimoFime");
        FilmeDao instance = null;
        Filme expResult = null;
        Filme result = instance.listaUltimoFime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmes method, of class FilmeDao.
     */
    @Test
    public void testGetFilmes() {
        System.out.println("getFilmes");
        FilmeDao instance = null;
        List<Filme> expResult = null;
        List<Filme> result = instance.getFilmes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cria method, of class FilmeDao.
     */
    @Test
    public void testCria() {
        System.out.println("cria");
        Filme filme = null;
        FilmeDao instance = null;
        Filme expResult = null;
        Filme result = instance.cria(filme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
