
package e2690;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String[] texto = new String[num];
        
        for(int i = 0;i < num;i++){
            texto[i] = in.nextLine();
       }
        
        for(int x = 0; x < texto.length;x++){
            String textoC = "";
            for(int i = 0; i < texto[x].length();i++){
                switch(texto[x].charAt(i)){
                    case 'G':
                    case 'Q':
                    case 'a':
                    case 'k':
                    case 'u':
                        textoC += "0";
                        break;
                    case 'I':
                    case 'S':
                    case 'b':
                    case 'l':
                    case 'v':
                        textoC += "1";
                        break;
                    case 'E':
                    case 'O':
                    case 'Y':
                    case 'c':
                    case 'm':
                    case 'w':
                        textoC += "2";
                        break;
                    case 'F':
                    case 'P':
                    case 'Z':
                    case 'd':
                    case 'n':
                    case 'x':
                        textoC += "3";
                        break;
                    case 'J':
                    case 'T':
                    case 'e':
                    case 'o':
                    case 'y':
                        textoC += "4";
                        break;
                    case 'D':
                    case 'N':
                    case 'X':
                    case 'f':
                    case 'p':
                    case 'z':
                        textoC += "5";
                        break;
                    case 'A':
                    case 'K':
                    case 'U':
                    case 'g':
                    case 'q':
                        textoC += "6";
                        break;
                    case 'C':
                    case 'M':
                    case 'W':
                    case 'h':
                    case 'r':
                        textoC += "7";
                        break;
                    case 'B':
                    case 'L':
                    case 'V':
                    case 'i':
                    case 's':
                        textoC += "8";
                        break;
                    case 'H':
                    case 'R':
                    case 'j':
                    case 't':
                        textoC += "9";
                        break;
                }
            }
            if(textoC.length() < 12){
            System.out.println(textoC);
            }else{
                System.out.println(textoC.substring(0, 12));
            }
        }        
    }
}
