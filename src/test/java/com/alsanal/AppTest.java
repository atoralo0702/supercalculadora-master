package com.alsanal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class AppTest {
    
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    @DisplayName("Test entrada a Menú de Aritmética, opción A")
    public void testCasoMenuAritmetica() {
       
        provideInput("2\n1\n5\n10");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 15") );
        
    }

    //Santi empieza a codificar el 21/02/2022

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 1 grado, suma")
    public void testCasoMenuEcuaciones1GradoSuma() {
       
        provideInput("3\n1\n5\n2\n8\nsi");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("1.2") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 1 grado, resta")
    public void testCasoMenuEcuaciones1GradoResta() {
       
        provideInput("3\n1\n5\n2\n8\nno");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("2.0") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, no solucion")
    public void testCasoMenuEcuaciones2GradoNoSolucion() {
       
        provideInput("3\n1\n5\n2\n8");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("No tiene solucion") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, dos soluciones")
    public void testCasoMenuEcuaciones2Grado2Soluciones() {
       
        provideInput("3\n2\n1\n-5\n6");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("3.0") );
        assertThat(getOutput(), containsString("2.0") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, una soluciones")
    public void testCasoMenuEcuaciones2Grado1Soluciones() {
       
        provideInput("3\n2\n1\n-2\n1");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("-1.0") );
        
        
    }

    //termino de modificar el 21/02/22

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    //Alejandro Torres Alonso --inicio --21/02/2022--

    @Test
    @DisplayName("Test entrada a Menú de Polígonos regulares y Teorema de Pitágoras, opción 1")
    public void testCasoMenuPoligonosRegularesYTeoremaDePitagoras1() {
       
        provideInput("1\n1\n5\n6\n4");
              
        App.main(new String[0]);
        assertThat(getOutput(), containsString("60 m2") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos regulares y Teorema de Pitágoras, opción 2")
    public void testCasoMenuPoligonosRegularesYTeoremaDePitagoras2() {
       
        provideInput("1\n2\n4\n6");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("24") );
        
    }

    @Test
    @DisplayName("Test salida a Menú principal desde opción 1")
    public void testCasoSalidaMenuPoligonosRegularesYTeoremaDePitagorasaMenuPrincipal() {
       
        provideInput("1\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("MENÚ SUPERCALCULADORA") );
        assertThat(getOutput(), containsString("0. Salir.") );
        assertThat(getOutput(), containsString("1. Polígonos Regulares y Teorema de Pitágoras") );
        assertThat(getOutput(), containsString("2. Aritmética básica") );
        assertThat(getOutput(), containsString("3. Ecuaciones 1er y 2do grado") );
        assertThat(getOutput(), containsString("Introduzca una opción:") );
    }


    //Alejandro Torres Alonso --fin --21/02/2022

}