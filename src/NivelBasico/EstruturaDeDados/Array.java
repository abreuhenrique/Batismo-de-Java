package NivelBasico.EstruturaDeDados;

public class Array {
    static void main(String[] args) {

        //Arrays são tipos Referencia
        //String inicializa como null
        String[] ninja = new String[5];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";

        //Redeclarar um Array
        ninja = new String[6];
        ninja[0] = "Hashiram Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hirusen Sarutobi";
        ninja[3] = "Tsunade";
        ninja[4] = "Kakashi Hatake";
        ninja[5] = "Naruto Uzumaki";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

        //int inicializa como 0
        int[] idade = new int[2];
        idade[0] = 17;
        System.out.println(idade[1]);

        //Doubles inicializam como 0.0
        double[] flutuantes = new double[2];
        System.out.println(flutuantes[1]);

        //Boolean inicializam como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

    }
}
