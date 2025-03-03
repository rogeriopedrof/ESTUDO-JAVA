package desafio01;

public class desafio01 {
    public static void main(String[] args) {

        // GUERREIRO1
        String nome = "Piccolo";
        int PL = 15;
        String missao = " Derrotar Raditz";
        String status = "Em andamento, Unido à Goku";
        char ND = 'C';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome);
        System.out.println("Poder de luta: " + PL);
        System.out.println("Missão: " + missao);
        System.out.println("Status da missão: " + status);
        System.out.println("Nível de dificuldade: " + ND);

        // GUERREIRO2
        String nome2 = "Tenshihan";
        int PL2 = 18;
        String missao2 = " Derrotar Nappa";
        String status2 = "Em andamento, Unido à Chaos";
        char ND2 = 'B';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome2);
        System.out.println("Poder de luta: " + PL2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão: " + status2);
        System.out.println("Nível de dificuldade: " + ND2);

        // GUERREIRO3
        String nome3 = "Goku";
        int PL3 = 24;
        String missao3 = " Derrotar Vegeta";
        String status3 = "Em andamento, Unido à todos os guerreiros Z";
        char ND3 = 'A';

        System.out.println("----------------------------------");

        System.out.println("Nome do Guerreiro: " + nome3);
        System.out.println("Poder de luta: " + PL3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão: " + status3);
        System.out.println("Nível de dificuldade: " + ND3);

        System.out.println("----------------------------------");


        System.out.println("Resultado das Lutas:\n");

        if (PL < 15) {
            if (ND == 'C' || ND == 'B') {
                status = "1.Raditz foi DERROTADO";
                System.out.println(status);
            } else {
                status = "1.Piccolo foi DERROTADO";
                System.out.println(status);
            }
        } else {
            status = "1.Raditz é DERROTADO com facilidade!";
            System.out.println(status);
        }

        if (PL2 >= 18) {
            if (ND2 == 'A') {
                status2 = "2.Nappa foi DERROTADO";
                System.out.println(status2);
            } else {
                status2 = "2.Tenshihan foi DERROTADO";
                System.out.println(status2);
            }
        } else {
            status2 = "2.Nappa foi DERROTADO com facilidade!";
            System.out.println(status2);
        }
        if (PL3 > 23) {
            if (ND3 == 'A') {
                status3 = "3.Vegeta foi DERROTADO";
                System.out.println(status3);
            } else {
                status3 = "3.Goku foi DERROTADO";
                System.out.println(status3);
            }
        } else {
            status3 = "3.Vegeta foi DERROTADO com facilidade";
            System.out.println(status3);
        }
    }
}
