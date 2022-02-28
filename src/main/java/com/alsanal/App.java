package com.alsanal;
import java.util.Scanner;


public class App{

    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
        
        int opcion;

        do {

            System.out.println("\nMENÚ SUPERCALCULADORA");
            System.out.println("\n \t0. Salir.");
            System.out.println("\t1. Polígonos Regulares y Teorema de Pitágoras");
            System.out.println("\t2. Aritmética básica");
            System.out.println("\t3. Ecuaciones 1er y 2do grado");

            System.out.printf("\nIntroduzca una opción: ");

          comprobarNumero(sc);
            opcion = sc.nextInt();


          

            System.out.println("");

            switch(opcion){
        

                case 1:
                
                    /* Código Alejandro Torres */
                    menuPoligonos(sc);

                    break;

                case 2:

                    /* Código Alejandro Pino Tejón */
                    menuAritmeticaBasica(sc);
                    
                    break;

                case 3: 

                    /* Código Santiago Sánchez Fernandez */
                    menuEcuaciones1y2Grado(sc);

                break;

            }
        
        }while( opcion != 0);

        sc.close();
    }





/* Código - Alejandro Torres - 14/02/2022 */

      /* Funciones Área Polígonos Regulares / Teorema de Pitágoras */

        public static void menuPoligonos(Scanner sc){

            
            int num1, num2, num3, subopcion1;

            

            do {

                System.out.println("\n\u001B[37m[1] Polígonos Regulares y Teorema de Pitágoras\n");
                System.out.println("\t0. Volver al menú principal");
                System.out.println("\t1. Área polígono regular");
                System.out.println("\t2. Teorema de pitágoras");
                System.out.printf("\n\nIntroduzca una opción: ");

                comprobarNumero(sc);
                subopcion1 = sc.nextInt();

               
                 switch(subopcion1) {

                    case 1:
                        System.out.printf("\nIntroduzca el número de lados: ");
                        comprobarNumero(sc);
                        num1 = sc.nextInt();

                        System.out.printf("\nIntroduzca la longitud: ");
                        comprobarNumero(sc);
                        num2 = sc.nextInt();

                        System.out.printf("\nIntroduzca la apotema: ");
                        comprobarNumero(sc);
                        num3 = sc.nextInt();

                        System.out.println("\n\t-- Resultado: " + areaPoligonosRegulares(num1, num2, num3) + " m2\n");

                        break;
                    
                    case 2:
                        System.out.printf("\n\u001B[34mCateto \u001B[31mA\u001B[37m: ");
                        comprobarNumero(sc);
                        num1 = sc.nextInt();

                        System.out.printf("\n\u001B[34mCateto \u001B[31mB\u001B[37m: ");
                        comprobarNumero(sc);
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
        public static void menuAritmeticaBasica(Scanner sc){

            
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



        /* Código - Santiago Fernandez - 15/02/2022 */

        public static double ecuacion1Grado (double a, double b, double c, String operacion) {

            double resultado;
            if (operacion.equalsIgnoreCase("si")) {

                resultado = (c-b)/a;

            } else  {

                resultado = (c+b)/a;
            } 

            return resultado;

        }

        public static double[] ecuacion2Grado(double a, double b, double c) {
 
            double discriminante = (Math.pow(b, 2) - (4 * a * c));
            if (discriminante >= 0) {
         
                double soluciones[];
         
                // Una solucion
                if(discriminante == 0){
         
                    soluciones = new double[1];
         
                    soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
         
                // Dos soluciones
                }else{
         
                    soluciones = new double[2];
         
                    soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
         
                    soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
         
                }
         
                return soluciones;
            } else {
                // Sin solucion
                return null;
            }
         
        }

        public static boolean opcionValida(String opcion) {

        boolean valido;

         if (opcion.equalsIgnoreCase("si")) {

           valido =  true;
         } else if (opcion.equalsIgnoreCase("no")) {

           valido =  true;
         } else {

           valido =  false;
         }

         return valido;

        }

        public static void menuEcuaciones1y2Grado(Scanner sc){

            
            String respuesta;
            double num1, num2, num3; 
            int subopcion2;
            

            do {
                
                System.out.println("\t\n[2] Ecuaciones primer y segundo grado\n");
                System.out.println("\t0. Volver al menú principal");
                System.out.println("\t1. Ecuacion primer grado");
                System.out.println("\t2. Ecuacion segundo grado");
                
                System.out.printf("Introduzca una opción: ");
                comprobarNumero(sc);
                subopcion2 = sc.nextInt();
            
                /* Ecuaciones primer y segundo grado (1. Ecuacion primer grado - 2. Ecuacion segundo grado ) */

                    switch(subopcion2) {


                        case 1:
                            System.out.printf("\nIntroduzca el numero de la x: ");
                            comprobarNumero(sc);
                            num1 = sc.nextDouble();

                            System.out.printf("\nIntroduzca el segundo número: ");
                            comprobarNumero(sc);
                            num2 = sc.nextDouble();

                            System.out.printf("\nIntroduzca el resultado: ");
                            comprobarNumero(sc);
                            num3 = sc.nextDouble();

                            System.out.printf("\nIntroduzca si la ecuacion es una suma o no:");
                            System.out.printf("\nSolo son validas si o no:");

                            respuesta = sc.next();

                            System.out.println(respuesta);

                            
                            System.out.println(respuesta.equalsIgnoreCase("si"));


                            while (!opcionValida(respuesta)) {

                                System.out.printf("\n No es una opcion valida");
                                System.out.printf("\nSolo son validas si o no");
                                System.out.printf("\nIntroduzca su opcion");

                                respuesta = sc.next();


                            }


                            System.out.println("\n\tResultado: " + ecuacion1Grado(num1, num2, num3, respuesta));

                            break;
                        
                        case 2:
                            System.out.printf("\nIntroduzca el multiplo de la x al cuadrado: ");
                            comprobarNumero(sc);
                            num1 = sc.nextDouble();

                            System.out.printf("\nIntroduzca el multiplo de la x: ");
                            comprobarNumero(sc);
                            num2 = sc.nextDouble();

                            System.out.printf("\nIntroduzca el 3 numero: ");
                            comprobarNumero(sc);
                            num3 = sc.nextDouble();


                            double resultados[] = ecuacion2Grado(num1, num2, num3);

                            if (resultados == null) {
                                System.out.println("No tiene solucion");
                            } else {
                                for (int i = 0; i < resultados.length; i++) {
                                    System.out.println(resultados[i]);
                                }
                            }

                            break;

                        

                        default:
                            System.out.println("\nPor favor, introduzca una opción válida (1-4)");
                        
                    }

                } while(subopcion2 != 0);

                
        }

        public static void comprobarNumero( Scanner datoIntroducido) {

            while(!datoIntroducido.hasNextInt()) {

                System.out.println("Valor no valido");
                datoIntroducido.next();
                System.out.println("Introduce un numero");
               
            }

        }

            

        
}
