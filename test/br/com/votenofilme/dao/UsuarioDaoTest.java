/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.dao;

import br.com.votenofilme.model.Usuario;
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
public class UsuarioDaoTest {
    
    public UsuarioDaoTest() {
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
     * Test of getSession method, of class UsuarioDao.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        UsuarioDao instance = null;
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTudo method, of class UsuarioDao.
     */
    @Test
    public void testListaTudo() {
        System.out.println("listaTudo");
        UsuarioDao instance = null;
        List<Usuario> expResult = null;
        List<Usuario> result = instance.listaTudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaUltimoUsuario method, of class UsuarioDao.
     */
    @Test
    public void testListaUltimoUsuario() {
        System.out.println("listaUltimoUsuario");
        UsuarioDao instance = null;
        Usuario expResult = null;
        Usuario result = instance.listaUltimoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salva method, of class UsuarioDao.
     */
    @Test
    public void testSalva() {
        System.out.println("salva");
        Usuario usuario = null;
        UsuarioDao instance = null;
        instance.salva(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carrega method, of class UsuarioDao.
     */
    @Test
    public void testCarrega() {
        System.out.println("carrega");
        Long id = null;
        UsuarioDao instance = null;
        Usuario expResult = null;
        Usuario result = instance.carrega(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualiza method, of class UsuarioDao.
     */
    @Test
    public void testAtualiza() {
        System.out.println("atualiza");
        Usuario usuario = null;
        UsuarioDao instance = null;
        instance.atualiza(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UsuarioDao.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Usuario usuario = null;
        UsuarioDao instance = null;
        instance.remove(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
