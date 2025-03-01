package condicoes;

public class ifelse {
    public static void main(String[] args) {

        // Objetivo: Fazer o Yamcha derrotar o Vegeta, vencer o Torneio de Artes Marciais e, por consequência, recuperar a Bulma.

        String nome = "Yamcha";
        String torneioAM;

        int idade = 33;
        boolean DEUS = false;
        short niveldepoder = 1;


        /* Sintaxe das condicionais:
        *
        * 1. Declara o if (Se)
        * 2. Determina a CONDIÇÃO entre parênteses
        * 3. Poem o RESULTADO entre chaves
        *
        * 1. Declara o else if (Se não)
        * 2. Determina uma CONDIÇÃO entre parênteses
        * 3. Poem o RESULTADO entre chaves
        *
        * 1. Declara o else (Então)
        * 2. Poem o RESULTADO entre parênteses
        * */

        if (niveldepoder > 18 && DEUS == true) { // Se o valor da variavel for maior ou igual a 18 e ele for um deus, mostrar na tela "capaz de derrotar"
            System.out.println("Yamcha é capaz de derrotar Vegeta e vencer o torneio de Artes Marciais!");
        } else if (niveldepoder > 18) {
            System.out.println("Yamcha chega até a final, mas é derrotado por Vegeta!");
        } else { // Se não, mostrar "é derrotado"
            System.out.println("Yamcha é derrotado antes de por as mãos em Vegeta!");
        }
    }
}
