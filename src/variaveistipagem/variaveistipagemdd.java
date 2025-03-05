package variaveistipagem;

public class variaveistipagemdd {
        public static void main(String[] args) { // PSVM

            System.out.println("Hello World!"); // SOUT


            /* Sixtaxe de Variaveis
             * 1. Tipo da Variavel
             * 2. Nome da Variavel (Codificador)
             * 3. Sinal de Atribuição
             * 4. Valor da Variavel
             * 5. Fechamento com Ponto de Virgula.
             * */


            // Primitivos - NO METHODS
            int idade = 29; //Números inteiros
            float altura = 1.75f; // Números decimais
            boolean vivoOUmorto = true; // Valores verdadeiros ou falso


            // Não primitivos - YES METHODS
            String nome = "Goku"; // Texto

            /* Metodos -> atruibue função a um valor.
             *
             * Sixtaxe:
             * 1. Codificador da variavel
             * 2. PONTO
             * 3. A função.
             * */

            String nomeCAIXAALTA = nome.toUpperCase(); //Uma variável recebeu um metodo e foi atribuída a outra variável.
            System.out.println("Meu nome é "+ nomeCAIXAALTA); // Metodo UpperCase poem em CAPSLOCK.

            String planeta = "TERRA";
            String planetaCAIXABAIXA = planeta.toLowerCase(); // Metodo LowerCase tira de CAPSLOCK.
            System.out.println("Eu moro no planeta "+ planetaCAIXABAIXA);
        }

}
