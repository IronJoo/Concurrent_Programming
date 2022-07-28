package Aula3.ex2;

public class Main {
    //criar sempre primeiro transportadora
    Transportadora transportadora = new Transportadora();

    //dpeois criar produtor que guarda recurso partilhado
    Cliente cliente1 = new Cliente(1, transportadora);

    //por fim criar consumidor que guarda recurso partilhado
}
