package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    static void main(String[] args) {
        /*
        * Lacos de Repeticao
        * WHILE - FOR
        * */

        //WHILE

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("O naruto fez um clone das sombras" + numeroDeClones);
            numeroDeClones++;
        }

        //FOR

        for(int i = 0; i <= 39; i++) {
            if(i == 0){
                System.out.println("O naruto já se clonou " + (i + 1) + " vez");
            } else {
                System.out.println("O naruto já se clonou " + (i + 1) + " vezes");
            }
        }
    }
}
