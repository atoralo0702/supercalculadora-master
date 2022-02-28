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

    

    //Santi empieza a codificar el 21/02/2022

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 1 grado, suma")
    public void testCasoMenuEcuaciones1GradoSuma() {
       
        provideInput("3\n1\n5\n2\n8\nsi\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("1.2") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 1 grado, resta")
    public void testCasoMenuEcuaciones1GradoResta() {
       
        provideInput("3\n1\n5\n2\n8\nno\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("2.0") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, no solucion")
    public void testCasoMenuEcuaciones2GradoNoSolucion() {
       
        provideInput("3\n2\n5\n2\n8\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("No tiene solucion") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, dos soluciones")
    public void testCasoMenuEcuaciones2Grado2Soluciones() {
       
        provideInput("3\n2\n1\n-5\n6\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("3.0") );
        assertThat(getOutput(), containsString("2.0") );
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Ecuaciones, 2 grado, una soluciones")
    public void testCasoMenuEcuaciones2Grado1Soluciones() {
       
        provideInput("3\n2\n1\n-2\n1\n0\n0");
        
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

    /*Prueba unitaria del funcionamiento correcto de la supercalculadora:
    
    MENÚ SUPERCALCULADORA(Elige opción 1)
    1.Polígonos Regulares y Teorema de Pitágoras

        1.Área de Polígono regular(Elige subopción 1)
            Introduzca el número de lados: 5
            Introduzca la longitud: 6
            Introduzca la apotema: 4

            Resultado: 60 m2
    */
    @Test
    @DisplayName("Test entrada a Menú de Polígonos regulares y Teorema de Pitágoras, opción 1")
    public void testCasoMenuPoligonosRegularesYTeoremaDePitagoras1() {
       
        provideInput("1\n1\n5\n6\n4\n0\n0\n");
              
        App.main(new String[0]);
        assertThat(getOutput(), containsString("60 m2") );
        
    }

    /*Prueba unitaria del funcionamiento correcto de la supercalculadora:
    
    MENÚ SUPERCALCULADORA(Elige opción 1)
    1.Polígonos Regulares y Teorema de Pitágoras
    
        2.Teorema de Pitágoras(Elige subopción 2)
            Introduzca Cateto A: 4
            Introduzca Cateto B: 6

            Resultado: 24
    */

    @Test
    @DisplayName("Test entrada a Menú de Polígonos regulares y Teorema de Pitágoras, opción 2")
    public void testCasoMenuPoligonosRegularesYTeoremaDePitagoras2() {
       
        provideInput("1\n2\n4\n6\n0\n0\n");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("24") );
        
    }

    @Test
    @DisplayName("Test salida a Menú principal desde opción 1")
    public void testCasoSalidaMenuPoligonosRegularesYTeoremaDePitagorasaMenuPrincipal1() {
       
        provideInput("1\n0\n0\n");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("MENÚ SUPERCALCULADORA") );
        assertThat(getOutput(), containsString("0. Salir.") );
        assertThat(getOutput(), containsString("1. Polígonos Regulares y Teorema de Pitágoras") );
        assertThat(getOutput(), containsString("2. Aritmética básica") );
        assertThat(getOutput(), containsString("3. Ecuaciones 1er y 2do grado") );
        assertThat(getOutput(), containsString("Introduzca una opción:") );
    }

    @Test
    @DisplayName("Test salida a Menú principal desde opción 1")
    public void testCasoSalidaMenuPoligonosRegularesYTeoremaDePitagorasaMenuPrincipalPrueba() {
       
        provideInput("1\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("[1] Polígonos Regulares y Teorema de Pitágoras") );
        assertThat(getOutput(), containsString("0. Volver al menú principal") );
        assertThat(getOutput(), containsString("1. Área polígono regular") );
        assertThat(getOutput(), containsString("2. Teorema de pitágoras") );
        assertThat(getOutput(), containsString("Introduzca una opción: ") );
       
    }

    //Alejandro Torres Alonso --fin --21/02/2022




/* Alejandro Pino - 25/02/2022 */

    /* TEST SUMA RESULTADO */
    @Test
    @DisplayName("Test Caso Suma")
    public void testCasoSuma() {
    
        provideInput("2\n1\n5\n2\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 7") );
        
    }

/* TEST RESTA RESULTADO */
    @Test
    @DisplayName("Test Caso Resta")
    public void testCasoResta() {
    
        provideInput("2\n2\n5\n2\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 3") );
        
    }

/* TEST MULTIPLICACIÓN */
    @Test
    @DisplayName("Test Caso Multiplicación")
    public void testCasoMultiplicar() {
    
        provideInput("2\n3\n5\n2\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 10") );
        
    }

/* TEST DIVISIÓN RESULTADO */
    @Test
    @DisplayName("Test Caso División")
    public void testCasoDividir() {
    
        provideInput("2\n4\n10\n2\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 5") );
        
    }

/* CASO VOLVER MENÚ */
    @Test
    @DisplayName("Test Caso Volver")
    public void testCasoVolver() {
    
        provideInput("2\n0\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("MENÚ SUPERCALCULADORA"));
        assertThat(getOutput(), containsString("0. Salir."));
        assertThat(getOutput(), containsString("1. Polígonos Regulares y Teorema de Pitágoras"));
        assertThat(getOutput(), containsString("2. Aritmética básica"));
        assertThat(getOutput(), containsString("3. Ecuaciones 1er y 2do grado")); 
        
    }

    
/* CARÁCTER NO NUMÉRICO INPUT MENÚ ARITMÉTICA */
    @Test
    @DisplayName("Test Caso Introducir carácter no numérico en el Menú aritmética")
    public void testCasoIntroducirLetraMenuAritmetica() {
    
        provideInput("2\nH\n0\n0\n0\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("") 
        );
        
    }


/* CARÁCTER NO NUMÉRICO INPUTS SUMAR */

    /* INPUT 1 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num1 operación Suma")
        public void testCasoIntroducirLetraNum1Suma() {
        
            provideInput("2\n1\nH\n10\n5\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 15"));
            
        }

    /* INPUT 2 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num2 operación Suma")
        public void testCasoIntroducirLetraNum2Suma() {
        
            provideInput("2\n1\n100\nH\n10\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 110"));
            
        }


/* CARÁCTER NO NUMÉRICO INPUTS RESTAR */

    /* INPUT 1 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num1 operación Resta")
        public void testCasoIntroducirLetraNum1Resta() {
        
            provideInput("2\n2\nH\n20\n10\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 10"));
            
        }

    /* INPUT 2 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num2 operación Resta")
        public void testCasoIntroducirLetraNum2Resta() {
        
            provideInput("2\n2\n10\nH\n5\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 5"));
            
        }


/* CARÁCTER NO NUMÉRICO INPUTS MULTIPLICAR */

    /* INPUT 1 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num1 operación Multiplicar")
        public void testCasoIntroducirLetraNum1Multiplicar() {
        
            provideInput("2\n3\nH\n3\n5\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 15") 
            );
            
        }

    /* INPUT 2 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num2 operación Multiplicar")
        public void testCasoIntroducirLetraNum2Multiplicar() {
        
            provideInput("2\n3\n4\nH\n5\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 20") 
            );
            
        }


/* CARÁCTER NO NUMÉRICO INPUTS DIVIDIR */

    /* INPUT 1 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num1 operación Dividir")
        public void testCasoIntroducirLetraNum1Dividir() {
        
            provideInput("2\n4\nH\n10\n2\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 5") 
            );
            
        }

    /* INPUT 2 */
        @Test
        @DisplayName("Test Caso Introducir carácter no numérico num2 operación Dividir")
        public void testCasoIntroducirLetraNum2Dividir() {
        
            provideInput("2\n4\n100\nH\n2\n0\n0");
            
            App.main(new String[0]);
            assertThat(getOutput(), containsString("Resultado: 50") 
            );
            
        }
}

