/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2634;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fritz
 *
 * matriz de transição At , de dimensões 2 x 2
 * 
 *  vetor ut da semana t pudesse se computado através da expressão ut= At ut-1, 
 * 
 * 1. Saber se todas as matrizes de um intervalo de tempo estão consistentes ou se há alguma matriz corrompida;

2. Atualizar a matriz A t de uma determinada semana;

3. Determinar o maior intervalo de tempo onde todas as matrizes consecutivas são consistentes.
* 
* 
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(new File("src/e2634/entrada"));
        
        int t = in.nextInt();
        
        //para cada caso de teste
        for (int i = 1; i <= t; i++) {
            
            System.out.println("Experimento #" + i + ":");
            int semanaInicial = in.nextInt(); //valor de w
            int anoInicial = in.nextInt(); // valor de y
            
            //segunda linha de cada caso de teste
            int numeroMatrizes = in.nextInt();
            
            //vetor de matrizes
            int mat[][][] = new int[numeroMatrizes][2][2];
            
            //lendo as matrizes
            for (int m = 0; m < numeroMatrizes; m++) {
                
                mat[m][0][0] = in.nextInt();
                mat[m][0][1] = in.nextInt();
                mat[m][1][0] = in.nextInt();
                mat[m][1][1] = in.nextInt();
                
            }
            
            //valor de M
            int numeroComandos = in.nextInt();
            
            for (int comando = 0; comando < numeroComandos; comando++) {
                
                String letra = in.next();
                
                switch (letra) {
                    
                    case "Q":
                        int a = in.nextInt();
                        int b = in.nextInt();
                        
                        boolean valido = true;
                        
                        for (int semana = a - 1; semana < b; semana++) {
                            
                            int determinante = mat[semana][0][0] * mat[semana][1][1] -
                                    mat[semana][0][1] * mat[semana][1][0];
                            
                            //System.out.println("Semana " + semana + " Det:  " + determinante);
                            if (determinante == 0) {
                                valido = false;
                                break;
                            }
                        }
                        
                        a = semanaInicial + a - 1;
                        b = semanaInicial + b - 1;
                        
                        int ano1 = anoInicial;
                        if (a > 52) {
                            a -= 52;
                            ano1++;
                        }
                        
                        int ano2 = anoInicial;
                        if (b > 52) {
                            b -= 52;
                            ano2++;
                        }
                        //System.out.println(a + "/" + anoInicial " + 2012 a 09/2012:");
                        System.out.printf("%02d/%d a %02d/%d: ", a, ano1, b, ano2 );
                        
                        if (valido) {
                            System.out.println("dados consistentes (D > 0)");
                        } else {
                            System.out.println("dados corrompidos");
                        }
                        
                        
                        break;
                    case "U":
                        int ut = in.nextInt() -1;
                        mat[ut][0][0] = in.nextInt();
                        mat[ut][0][1] = in.nextInt();
                        mat[ut][1][0] = in.nextInt();
                        mat[ut][1][1] = in.nextInt();
                        //System.out.println("Alterei a matriz " + ut);
                        //System.out.println(mat[ut][0][0]);
                        break;
                    case "M":
                        //System.out.println("Estou no M");
                        
                        int intervalo = 0;
                        int maiorIntervalo = 0;
                        int intervaloInicio = 0;
                        
                        for (int semana = 0; semana < numeroMatrizes; semana++) {
                            
                            int determinante = mat[semana][0][0] * mat[semana][1][1] -
                                    mat[semana][0][1] * mat[semana][1][0];
                            
                            System.out.println("Semana " + semana + " Det:  " + determinante);
                            if (determinante != 0) {
                                if (intervalo == 0) {
                                    intervaloInicio = semana;
                                }
                                intervalo++;
                            } 
                            
                            if (determinante == 0) {
                                intervalo = 0;
                            }
                            
                            if (intervalo > maiorIntervalo) {
                                maiorIntervalo = intervalo;
                            }
                        }
                        
                        System.out.println(maiorIntervalo + "\t" + intervaloInicio);
                        
                        System.out.println("Maior periodo consistente: %02d/%d a %02d/%d");
                        
                        
                        
                        break;
                    
                }
                
                
            }
            
            System.out.println();
        }
        
    }
    
}
