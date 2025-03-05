package desafio01;

public class desafio01 {
    public static void main(String[] args) {


        /* Lógica do ifs:

         * Com um poder de luta inferior a X, o guerreiro consegue vencer o vilão, desde que o vilão não esteja em um
         * nível superior ao esperado. Caso isso aconteça, o guerreiro é derrotado facilmente. Agora, se o guerreiro
         * tiver um poder superior a X, ele vence facilmente.
         */


        // GUERREIRO1
        String nome = "Piccolo";
        float PL = 1.3f;
        String missao = " Derrotar Raditz";
        String status = "Unido a Goku, Piccolo carrega seu Makankosapo afim de MATAR Raditz.";
        char ND = 'C';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome);
        System.out.println("Poder de luta: " + PL);
        System.out.println("Missão: " + missao);
        System.out.println("Status da missão: " + status);
        System.out.println("Nível de dificuldade: " + ND);

        System.out.println("----------------------------------");

        if (PL < 2.3) {
            if (ND == 'B' || ND == 'A' || ND == 'S') { //OPs lógicos: && (and), ||(ou) e !(not)
                status = "1.Piccolo foi DERROTADO com facilidade!";
                System.out.println(status);
            } else {
                status = "1.Raditz foi DERROTADO";
                System.out.println(status);
            }
        } else {
            status = "1.Raditz foi DERROTADO com facilidade!";
            System.out.println(status);
        }


        // GUERREIRO2
        String nome2 = "Tenshihan";
        float PL2 = 1.8f;
        String missao2 = " Derrotar Nappa";
        String status2 = "Sozinho e ferido, Tenshinhan dá seus últimos esforços a fim de vingar seu amigo e DETER esse MONSTRO SAIYAJIN.";
        char ND2 = 'B';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome2);
        System.out.println("Poder de luta: " + PL2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão: " + status2);
        System.out.println("Nível de dificuldade: " + ND2);

        System.out.println("----------------------------------");

        if (PL2 < 8.0) {
            if (ND2 == 'B' || ND2 == 'A' || ND == 'S') {
                status2 = "2.Tenshinhan foi DERROTADO com facilidade!";
                System.out.println(status2);
            } else {
                status2 = "2.Nappa foi DERROTADO";
                System.out.println(status2);
            }
        } else {
            status2 = "2.Nappa foi DERROTADO com facilidade!";
            System.out.println(status2);
        }


        // GUERREIRO3
        String nome3 = "Goku";
        float PL3 = 30.0f;
        String missao3 = " Derrotar Vegeta";
        String status3 = "Munido da poderosa Genki-dama, Goku prepara o julgo final de Vegeta.";
        char ND3 = 'A';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome3);
        System.out.println("Poder de luta: " + PL3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão: " + status3);
        System.out.println("Nível de dificuldade: " + ND3);

        System.out.println("----------------------------------");

        if (PL3 < 17.0) {
            if (ND3 == 'S') {
                status3 = "3.Goku foi DERROTADO com facilidade!";
                System.out.println(status3);
            } else {
                status3 = "3.Vegeta foi DERROTADO";
                System.out.println(status3);
            }
        } else {
            status3 = "3.Vegeta foi DERROTADO com facilidade!";
            System.out.println(status3);
        }
        System.out.println("----------------------------------");

    }
}
