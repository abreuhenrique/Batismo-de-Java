package NivelBasico.Desafio01;

public class MissoesNinjaS {
    static void main(String[] args) {

        //Cadastro de Ninjas

        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Derrotar Deidara";
        char dificuldadeMissao1 = 'S';
        String statusMissao1;

        String nomeNinja2 = "Sakura Haruno";
        int idadeNinja2 = 14;
        String missaoNinja2 = "Acompanhar o Kakashi na Missao";
        char dificuldadeMissao2 = 'C';
        String statusMissao2;

        String nomeNinja3 = "Kakashi Hatake";
        int idadeNinja3 = 30;
        String missaoNinja3 = "Proteger Naruto";
        int dificuldadeMissao3 = 'S';
        String statusMissao3;

        if (idadeNinja1 < 15) {
            if(dificuldadeMissao1 == 'C' || dificuldadeMissao1 == 'D'){
                statusMissao1 = "Concluido";
            }else{
                statusMissao1 = "Nao concluido";
            }
        }else {
                statusMissao1 = "Concluido";
        }

        if(idadeNinja2 < 15) {
            if (dificuldadeMissao2 == 'C' || dificuldadeMissao2 == 'D'){
                statusMissao2 = "Concluido";
            }else {
                statusMissao2 = "Nao concluido";
            }
        } else {
            statusMissao2 = "Concluido";
        }

        if(idadeNinja3 < 15) {
            if (dificuldadeMissao3 == 'C' || dificuldadeMissao3 == 'D'){
                statusMissao3 = "Concluido";
            } else {
                statusMissao3 = "Nao concluido";
            }
        } else {
            statusMissao3 = "Concluido";
        }

        System.out.println("---- Ninjas de Konoha e suas Missoes ----");
        System.out.println("-----------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Dificuldade: " + dificuldadeMissao1);
        System.out.println("Status da Missao: " + statusMissao1);

        System.out.println("------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Dificuldade: " + dificuldadeMissao2);
        System.out.println("Status da Missao: " + statusMissao2);

        System.out.println("-------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " +missaoNinja3);
        System.out.println("Dificuldade: " + dificuldadeMissao3);
        System.out.println("Status da Missao: " + statusMissao3);

    }
}
