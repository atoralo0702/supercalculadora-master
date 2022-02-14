package com.alsanal;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
        
        int opcion;
        int subopcion1;
        
    
        do {

            System.out.println("\nMENÚ SUPERCALCULADORA");
            System.out.println("\n \t0. Salir.");
            System.out.println("\t1. Polígonos Regulares y Teorema de Pitágoras");
            System.out.println("\t2. Aritmética básica");
            System.out.println("\t3. Ecuaciones 1er y 2do grado");

            System.out.printf("\nIntroduzca una opción: ");
            opcion = sc.nextInt();

            System.out.println("");

            switch(opcion){
        

                case 1:
                
                    menuPoligonos();

                    break;

                case 2:

                    menuAritmeticaBasica();
                    
                    break;


                    /* Ecuaciones 1º y 2º */

                    case 3: 

                        /* Código Santiago Sánchez Fernandez */

                    break;

            }
        
        }while( opcion != 0);
    }





/* Código - Alejandro Torres */

      /* Funciones Área Polígonos Regulares / Teorema de Pitágoras */

        public static void menuPoligonos(){

            Scanner sc = new Scanner(System.in);
            int num1, num2, num3, subopcion1;

            do {

                System.out.println("\n[1] Polígonos Regulares y Teorema de Pitágoras\n");
                System.out.println("\t0. Volver al menú principal");
                System.out.println("\t1. Área polígono regular");
                System.out.println("\t2. Teorema de pitágoras");
                System.out.printf("\n\nIntroduzca una opción: ");

                subopcion1 = sc.nextInt();

                 switch(subopcion1) {

                    case 1:
                        System.out.printf("\nIntroduzca el número de lados: ");
                        num1 = sc.nextInt();

                        System.out.printf("\nIntroduzca la longitud: ");
                        num2 = sc.nextInt();

                        System.out.printf("\nIntroduzca la apotema: ");
                        num3 = sc.nextInt();

                        System.out.println("\n\t-- Resultado: " + areaPoligonosRegulares(num1, num2, num3) + " m2\n");

                        break;
                    
                    case 2:
                        System.out.printf("\n\u001B[34mCateto \u001B[31mA\u001B[37m: ");
                        num1 = sc.nextInt();

                        System.out.printf("\n\u001B[34mCateto \u001B[31mB\u001B[37m: ");
                        num2 = sc.nextInt();

                        System.out.println("\n\tResultado: \u001B[32m" + teoremadePitagoras(num1,num2) + "\n");

                        break;

                    default:
                        System.out.println("\nPor favor, introduzca una opción válida (0-2)");
                    
                }

            }while(subopcion1 != 0);
        }


        public static int areaPoligonosRegulares(int numlados, int longitud, int apotema){

            int area = (numlados*longitud*apotema)/2;

            return area;
        }
        public static int teoremadePitagoras(int cateto_a, int cateto_b){

            int hipotenusa = cateto_a * cateto_b;

            return hipotenusa;
        }


/* Código - Alejandro Pino - 14/02/2022 */
    
    /* Funciones Aritmética Básica */
        public static void menuAritmeticaBasica(){

            Scanner sc = new Scanner(System.in);
            int num1, num2, subopcion2;

            do {
                
                System.out.println("\t\n[2] Aritmética básica\n");
                System.out.println("\t0. Volver al menú principal");
                System.out.println("\t1. Sumar");
                System.out.println("\t2. Restar");
                System.out.println("\t3. Multiplicar");
                System.out.println("\t4. Dividir\n");
                System.out.printf("Introduzca una opción: ");
                
                subopcion2 = sc.nextInt();
            
                /* Aritmética Básica (1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir) */

                    switch(subopcion2) {


                        case 1:
                            System.out.printf("\nIntroduzca el primer número: ");
                            num1 = sc.nextInt();

                            System.out.printf("\nIntroduzca el segundo número: ");
                            num2 = sc.nextInt();

                            System.out.println("\n\tResultado: " + sumar(num1,num2));

                            break;
                        
                        case 2:
                            System.out.printf("\nIntroduzca el primer número: ");
                            num1 = sc.nextInt();

                            System.out.printf("\nIntroduzca el segundo número: ");
                            num2 = sc.nextInt();

                            System.out.println("\n\tResultado: " + restar(num1,num2));

                            break;

                        case 3:
                            System.out.printf("\nIntroduzca el primer número: ");
                            num1 = sc.nextInt();

                            System.out.printf("\nIntroduzca el segundo número: ");
                            num2 = sc.nextInt();

                            System.out.println("\n\tResultado: " + multiplicar(num1,num2));

                            break;
                        
                        case 4:
                            System.out.printf("\nIntroduzca el primer número: ");
                            num1 = sc.nextInt();

                            System.out.printf("\nIntroduzca el segundo número: ");
                            num2 = sc.nextInt();

                            System.out.println("\n\tResultado: " + dividir(num1,num2));

                            break;

                        default:
                            System.out.println("\nPor favor, introduzca una opción válida (1-4)");
                        
                    }

                } while(subopcion2 != 0);
        }
        public static int sumar(int a, int b){
            return a+b;
        }
        public static int restar(int a, int b){
            return a-b;
        }
        public static int multiplicar(int a, int b){
            return a*b;
        }
        public static int dividir(int a, int b){
            return a/b;
        }

        
}
