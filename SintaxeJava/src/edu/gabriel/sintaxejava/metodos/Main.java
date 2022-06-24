package edu.gabriel.sintaxejava.metodos;

public class Main {

    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();

        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.aumentarCanal();

        System.out.println("Subir canal: " + smartTv.canal);

        smartTv.mudarCanal(25);

        System.out.println("Novo canal: " + smartTv.canal);



    }
}
