package Aula5.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio");
        Reservatorio reservatorio = new Reservatorio();
        Telefonista telefonista = new Telefonista(reservatorio);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Funcionario funcionario = new Funcionario(i, reservatorio);
            funcionarios.add(funcionario);
        }

        telefonista.start();
        for (int i = 0; i < 10; i++){
            funcionarios.get(i).start();
        }
    }
}
