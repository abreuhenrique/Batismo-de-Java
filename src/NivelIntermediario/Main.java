package NivelIntermediario;

public class Main {
    static void main(String[] args) {

        /*
        *
        String nomeN = "Naruto Uzumaki";
        String aldeiaN = "Konoha";
        int idadeN = 17;
        System.out.println(nomeN);

        String nomeS = "Sasuke Uchiha";
        String aldeiaS = "Konoha";
        int idadeS = 17;
        System.out.println(nomeS);
        *
        * */

        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;

        //Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 18;

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 18;

        //Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 17;

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Konoha";
        Boruto.idade = 12;

        Boruto.AtivarJougan();
        Boruto.modoSabio();
    }
}
