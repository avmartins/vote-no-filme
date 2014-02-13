/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.dto;

import br.com.votenofilme.model.Filme;
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
public class SequenciaFilmesParaVotacaoDTOTest {
    
	SequenciaFilmesParaVotacaoDTO instance = null;
	
    public SequenciaFilmesParaVotacaoDTOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    	Filme filme1 = new Filme("Batman", "Batman", "img/batman.jpg");
		Filme filme2 = new Filme("Avatar", "Avatar", "img/avatar.jpg");
    	instance = new SequenciaFilmesParaVotacaoDTO(filme1,filme2,"1"); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFilmeOpcao1 method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testGetFilmeOpcao1() {
        System.out.println("getFilmeOpcao1");
        Filme expResult = null;
        Filme result = instance.getFilmeOpcao1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmeOpcao1 method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testSetFilmeOpcao1() {
        System.out.println("setFilmeOpcao1");
        Filme filmeOpcao1 = null;
        //SequenciaFilmesParaVotacaoDTO instance = null;
        instance.setFilmeOpcao1(filmeOpcao1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmeOpcao2 method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testGetFilmeOpcao2() {
        System.out.println("getFilmeOpcao2");
        //SequenciaFilmesParaVotacaoDTO instance = null;
        Filme expResult = null;
        Filme result = instance.getFilmeOpcao2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmeOpcao2 method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testSetFilmeOpcao2() {
        System.out.println("setFilmeOpcao2");
        Filme filmeOpcao2 = null;
        //SequenciaFilmesParaVotacaoDTO instance = null;
        instance.setFilmeOpcao2(filmeOpcao2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRanking method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        //SequenciaFilmesParaVotacaoDTO instance = null;
        String expResult = "";
        String result = instance.getRanking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRanking method, of class SequenciaFilmesParaVotacaoDTO.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        String ranking = "";
        //SequenciaFilmesParaVotacaoDTO instance = null;
        instance.setRanking(ranking);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
