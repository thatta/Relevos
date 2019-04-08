/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.relevos.Atleta;
import com.mycompany.relevos.Equipo;
import com.mycompany.relevos.Utilitaria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tegui
 */
public class PruebaRelevos {
    
    public PruebaRelevos() {
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
    @Test
    public void avanzar() {
        Equipo equipo2 = new Equipo("Colombia", 0, 100);
        Atleta atleta = new Atleta(equipo2, 33, 66);

        int resultadoAvanzar = atleta.avanzar(1);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, resultadoAvanzar);
    }
    @Test
    public void testRandom() {
        System.out.println("Test Random");
        
        int result = Utilitaria.random();
        switch (result) {
            case 1:
                System.out.println("Numero generado "+result);
                assertEquals(1, result);
                break;
            case 2:
                System.out.println("Numero generado "+result);
                assertEquals(2, result);
                break;
            case 3:
                System.out.println("Numero generado "+result);
                assertEquals(3, result);
                break;
            default:
                System.out.println("Numero generado "+result);
                fail("numero fuera del rango 1-3");
                break;
        }
    }


}
