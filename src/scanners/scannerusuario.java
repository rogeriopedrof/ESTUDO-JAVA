package scanners;

import java.util.Scanner; // Importação java automática

public class scannerusuario {
    public static void main(String[] args) {

        /* Scanners: Entrada de dados pelo usuário.
         * Objetivo: O usuário deve fornecer dados sobre um guerreiro, e esses dados devem ser validados.
         *
         * Declaração do Scanner:
         * - Chame a função Scanner -> importação automática é realizada
         * - Nomeie o objeto.
         * - Crie uma nova instância com "new Scanner".
         * - Entre parênteses, utilize "System.in" para permitir a entrada de dados pelo teclado.
         */

        Scanner caixadetexto = new Scanner(System.in); //Abertura do Scanner
        // Lêr dados: caixadetexto.nextLine();
        // Lêr e armazena dados: String nomeGuerreiro = caixadetexto.nextLine();

        // Fornecendo um nome
        System.out.println("Digite o nome do Guerreiro:");
        String nomeGuerreiro = caixadetexto.nextLine(); // Só aceitará a entrada de Strings
        System.out.println(nomeGuerreiro + " É o nome de um verdadeiro Guerreiro!");

        // Fornecendo o Pode de luta do Guerreiro (PLG)
        System.out.println("Digite qual o seu poder de luta:");
        int PLG = caixadetexto.nextInt(); // Só aceitará a entrada de int's
        System.out.println(PLG + " de poder de luta? Uau, é mesmo muito forte!");

        caixadetexto.close();//Fechamento do Scanner
    }
}
