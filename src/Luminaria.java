import java.util.ArrayList;
import java.util.List;

public class Luminaria extends ItemAmbiente {
    private final List<Teclado> acionadores;

    public Luminaria(String nome) {
        super(nome);
        this.acionadores = new ArrayList<>();
    }

    public boolean adicionarAcionadores(Teclado teclado){
        if (!acionadores.contains(teclado)){
            acionadores.add(teclado);
            return true;
        }
        return false;
    }
}

/*Importações:
O código começa com duas importações para classes do pacote "java.util". 
Ele importa as classes "ArrayList" e "List" do pacote "java.util". Essas 
classes são usadas para trabalhar com listas (ou arrays dinâmicos) em Java.

Declaração da classe "Luminaria":
A classe "Luminaria" é definida e estende outra classe chamada "ItemAmbiente". 
Isso significa que a classe "Luminaria" herda os membros (campos e métodos) da 
classe "ItemAmbiente" e também pode adicionar seus próprios membros.

Declaração do campo "acionadores":
A classe "Luminaria" possui um campo privado chamado "acionadores", que é uma 
lista (ArrayList) de objetos da classe "Teclado". Isso significa que uma luminária 
pode ser controlada por zero ou mais teclados. A lista "acionadores" é inicializada 
no construtor da classe como uma nova instância de ArrayList.

Construtor da classe "Luminaria":
A classe possui um construtor público que recebe um parâmetro "nome" (presumivelmente, 
o nome da luminária) e chama o construtor da classe pai "ItemAmbiente" passando o "nome". 
Isso inicializa o campo "nome" na classe pai.
Além disso, o construtor inicializa a lista "acionadores" como uma nova instância vazia de ArrayList.

Método "adicionarAcionadores":
A classe "Luminaria" possui um método público chamado "adicionarAcionadores" que recebe 
um parâmetro "teclado", que é um objeto da classe "Teclado".
Este método verifica se o objeto "teclado" já está na lista de "acionadores" da luminária 
usando o método "contains" da lista. Se o "teclado" não estiver na lista, ele é adicionado 
à lista usando o método "add" da lista e o método retorna true para indicar que a adição foi bem-sucedida.
Se o "teclado" já estiver na lista, o método retorna false para indicar que a adição não foi realizada. */



/*Em resumo, a classe Luminaria é uma representação de uma luminária 
que possui uma lista de teclados como acionadores e oferece um método 
para adicionar teclados a essa lista. O método adicionarAcionadores 
garante que não haja teclados duplicados na lista. */