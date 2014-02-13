/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.votenofilme.dao;

import br.com.votenofilme.dto.SequenciaFilmesParaVotacaoDTO;
import br.com.votenofilme.model.Usuario;
import br.com.votenofilme.model.Voto;
import java.util.List;
import java.util.Map;
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
public class VotoDaoTest {
    
    public VotoDaoTest() {
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
     * Test of getSession method, of class VotoDao.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        VotoDao instance = null;
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTudo method, of class VotoDao.
     */
    @Test
    public void testListaTudo() {
        System.out.println("listaTudo");
        VotoDao instance = null;
        List<Voto> expResult = null;
        List<Voto> result = instance.listaTudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salva method, of class VotoDao.
     */
    @Test
    public void testSalva() {
        System.out.println("salva");
        Voto voto = null;
        VotoDao instance = null;
        instance.salva(voto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carrega method, of class VotoDao.
     */
    @Test
    public void testCarrega() {
        System.out.println("carrega");
        Long id = null;
        VotoDao instance = null;
        Voto expResult = null;
        Voto result = instance.carrega(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualiza method, of class VotoDao.
     */
    @Test
    public void testAtualiza() {
        System.out.println("atualiza");
        Voto voto = null;
        VotoDao instance = null;
        instance.atualiza(voto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VotoDao.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Voto voto = null;
        VotoDao instance = null;
        instance.remove(voto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTodosVotos method, of class VotoDao.
     */
    @Test
    public void testListaTodosVotos() {
        System.out.println("listaTodosVotos");
        VotoDao instance = null;
        Map<String, Long> expResult = null;
        Map<String, Long> result = instance.listaTodosVotos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaVotosPorUsuario method, of class VotoDao.
     */
    @Test
    public void testListaVotosPorUsuario() {
        System.out.println("listaVotosPorUsuario");
        Usuario usuario = null;
        VotoDao instance = null;
        Map<String, Long> expResult = null;
        Map<String, Long> result = instance.listaVotosPorUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteracoes method, of class VotoDao.
     */
    @Test
    public void testGetIteracoes() {
        System.out.println("getIteracoes");
        VotoDao instance = null;
        int expResult = 0;
        int result = instance.getIteracoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIteracoes method, of class VotoDao.
     */
    @Test
    public void testSetIteracoes() {
        System.out.println("setIteracoes");
        int iteracoes = 0;
        VotoDao instance = null;
        instance.setIteracoes(iteracoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementaIteracoes method, of class VotoDao.
     */
    @Test
    public void testIncrementaIteracoes() {
        System.out.println("incrementaIteracoes");
        VotoDao instance = null;
        instance.incrementaIteracoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSequenciaiteracoes method, of class VotoDao.
     */
    @Test
    public void testGetSequenciaiteracoes() {
        System.out.println("getSequenciaiteracoes");
        VotoDao instance = null;
        List<SequenciaFilmesParaVotacaoDTO> expResult = null;
        List<SequenciaFilmesParaVotacaoDTO> result = instance.getSequenciaiteracoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaFilmes method, of class VotoDao.
     */
    @Test
    public void testBuscaFilmes() {
        System.out.println("buscaFilmes");
        int index = 0;
        VotoDao instance = null;
        SequenciaFilmesParaVotacaoDTO expResult = null;
        SequenciaFilmesParaVotacaoDTO result = instance.buscaFilmes(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaUltimoVoto method, of class VotoDao.
     */
    @Test
    public void testListaUltimoVoto() {
        System.out.println("listaUltimoVoto");
        VotoDao instance = null;
        Voto expResult = null;
        Voto result = instance.listaUltimoVoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cria method, of class VotoDao.
     */
    @Test
    public void testCria() {
        System.out.println("cria");
        Long idFilme1 = null;
        Long idFilme2 = null;
        Long ultimoUsuario = null;
        Long idFSelecionado = null;
        VotoDao instance = null;
        Voto expResult = null;
        Voto result = instance.cria(idFilme1, idFilme2, ultimoUsuario, idFSelecionado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRanking method, of class VotoDao.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        VotoDao instance = null;
        String expResult = "";
        String result = instance.getRanking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRanking method, of class VotoDao.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        String ranking = "";
        VotoDao instance = null;
        instance.setRanking(ranking);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
