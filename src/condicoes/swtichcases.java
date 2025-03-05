package condicoes;

import java.util.Scanner;

public class swtichcases {
    public static void main(String[] args) {
        /* SwitchCases: Executar códigos em casos especificos
        * Objetivo: Usuário escolher um dos guerreiro Z
        *
        * */
        Scanner caixadetxt = new Scanner(System.in);

        System.out.println("Selecione um Guerreiro (Utilize 1,2 ou 3):");
        System.out.println("1.Goku");
        System.out.println("2.Piccolo");
        System.out.println("3.Tenshinhan");

        int esclh = caixadetxt.nextInt();

        switch (esclh) {
            case 1:
                System.out.println("Selecionado: Goku");
                break; // PARA
            case 2:
                System.out.println("Selecionado: Piccolo");
                break;
            case 3:
                System.out.println("Selecionado: Tenshinhan");
                break;
            default: // Caso o usuário for BURRO e não escolha nenhuma das alternativas válidas, este bloco de código será executado como padrão.
                System.out.println("??? Cê é burro, cara? Eu falei pra utilizar: 1, 2 ou 3...");
        }

        caixadetxt.close();
    }
}
