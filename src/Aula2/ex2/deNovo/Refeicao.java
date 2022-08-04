package Aula2.ex2.deNovo;

public class Refeicao {
    private int id;
    private static int lastId = 0;

    public Refeicao(){
        id = lastId++;
    }

    public int getRefeicaoId() {
        return id;
    }
}
