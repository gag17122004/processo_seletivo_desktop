public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto("Scenario");
        Ambiente sala = new Ambiente("Sala");
        projeto.adicionarAmbiente(sala);
        Modulo modulo = new Modulo("EB-SDM8");
        Luminaria spot = new Luminaria("Spot");
        Luminaria arandela = new Luminaria("Arandela");
        Teclado tecladoEntrada = new Teclado("Entrada",Corteclado.BRANCO);
        Teclado tecladoEscada = new Teclado("Escada",Corteclado.PRETO);

        sala.adicionarItemAmbiente(modulo);
        sala.adicionarItemAmbiente(spot);
        sala.adicionarItemAmbiente(arandela);
        sala.adicionarItemAmbiente(tecladoEntrada);
        sala.adicionarItemAmbiente(tecladoEscada);
        modulo.adicionarLuminaria(spot);
        modulo.adicionarLuminaria(arandela);
        spot.adicionarAcionadores(tecladoEntrada);
        arandela.adicionarAcionadores(tecladoEntrada);
        arandela.adicionarAcionadores(tecladoEscada);
    }
}

/*Classe Main:

É a classe principal que contém o método main, onde o programa começa a ser executado.
Método main:

Cria um objeto Projeto chamado "Scenario".
Cria um objeto Ambiente chamado "Sala".
Adiciona o ambiente "Sala" ao projeto.
Cria objetos do tipo Modulo, Luminaria, e Teclado.
Adiciona esses objetos como itens ao ambiente "Sala".
Associa as luminárias ao módulo.
Associa os teclados às luminárias.
Classes envolvidas:

Projeto: Representa um projeto de automação residencial.
Ambiente: Representa um ambiente na automação residencial (por exemplo, a sala).
Modulo: Representa um módulo de automação (por exemplo, um dispositivo de controle de iluminação).
Luminaria: Representa uma luminária.
Teclado: Representa um teclado, que provavelmente é usado como dispositivo de entrada.
Corteclado: Parece ser uma enumeração (não fornecida no código) que especifica o tipo de teclado (por exemplo, "BRANCO" ou "PRETO").
Métodos utilizados:

adicionarAmbiente(Ambiente ambiente): Método de Projeto para adicionar um ambiente ao projeto.
adicionarItemAmbiente(ItemAmbiente item): Método de Ambiente para adicionar um item (como módulo, luminária ou teclado) ao ambiente.
adicionarLuminaria(Luminaria luminaria): Método de Modulo para adicionar uma luminária ao módulo.
adicionarAcionadores(Teclado teclado): Método de Luminaria para associar um teclado como acionador da luminária. */



/*Basicamente, o código cria instâncias de diferentes classes (Projeto, Ambiente, Modulo, 
Luminaria e Teclado) e estabelece relações entre eles para representar um cenário de 
projeto com ambientes, módulos, luminárias e teclados.*/