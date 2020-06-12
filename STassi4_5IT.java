/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stassi4_5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sunduss KD
 */
public class STassi4_5IT {
    
    private STassi4_5 quadrilaterial;
    private int height;
    private int width;
    private double angle1;
    private double angle2;
    
   
    
    public STassi4_5IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        height = 0;
        width = 0;
        angle1=0;
        angle2=0;
        quadrilaterial = new STassi4_5();
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void first() throws Exception {

         assertFalse(quadrilaterial.checkingtype(0,0,0,0));

    }
    
    @Test
    public void secondTest() throws Exception {

        height=0;
        width=0;
        angle1=10;
        angle2=0;
       assertFalse( quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
     @Test
    public void thirdTest() throws Exception {

        height=0;
        width=0;
        angle1=0;
        angle2=10;
       assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void forthTest() throws Exception {

        height=20;
        width= 0;
        angle1=0;
        angle2=0;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void fifthTest() throws Exception {

        height=0;
        width= 15;
        angle1=0;
        angle2=0;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void sixthTest() throws Exception {

        height=0;
        width= 0;
        angle1=180;
        angle2=180;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
        
   @Test
    public void seventhTest() throws Exception {

        height=10;
        width= 0;
        angle1=180;
        angle2=180;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
       @Test
    public void eighthTest() throws Exception {

        height=0;
        width= 20;
        angle1=180;
        angle2=180;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
   
    @Test
    public void ninthTest() throws Exception {

        height=0;
        width= 0;
        angle1=180;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void tenthTest() throws Exception {

        height=0;
        width= 0;
        angle1=90;
        angle2=180;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void eleventhTest() throws Exception {

        height=10;
        width= 10;
        angle1=90;
        angle2=80;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
        @Test
    public void twelvthTest() throws Exception {

        height=10;
        width= 10;
        angle1=90;
        angle2=90;
        assertTrue(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void thirteenthTest() throws Exception {

        height=20;
        width= 20;
        angle1=80;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void forteenthTest() throws Exception {

        height=20;
        width= 20;
        angle1=90;
        angle2=80;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void fifteenthTest() throws Exception {

        height=20;
        width= 20;
        angle1=60;
        angle2=120;
        assertTrue(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void sixteenthTest() throws Exception {

        height=20;
        width=20;
        angle1=120;
        angle2=60;
        assertTrue(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void seventeenthTest() throws Exception {

        height=0;
        width=0;
        angle1=90;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void eighteenthTest() throws Exception {

        height=10;
        width= 10;
        angle1=80;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void nineteenthTest() throws Exception {

        height=0;
        width= 0;
        angle1=90;
        angle2=80;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void twentythTest() throws Exception {

        height=0;
        width=0;
        angle1=60;
        angle2=120;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
            @Test
    public void twentyonethTest() throws Exception {

        height=0;
        width=0;
        angle1=120;
        angle2=60;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    
}
