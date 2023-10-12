import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ambiente {
    private String nome;
    private final List<ItemAmbiente> listaItensAmbiente;

    public Ambiente(String nome) {
        this.nome = nome;
        listaItensAmbiente = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean adicionarItemAmbiente(ItemAmbiente item){
        if (!listaItensAmbiente.contains(item)){
            listaItensAmbiente.add(item);
            return true;
        }
        return false;
    }

    public boolean removerItemAmbiente(ItemAmbiente item){
        if (listaItensAmbiente.contains(item)){
            listaItensAmbiente.remove(item);
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ambiente ambiente = (Ambiente) o;
        return Objects.equals(nome, ambiente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

/* Importações:
O código começa importando três classes do pacote java.util: ArrayList, 
List e Objects. Isso permite o uso de listas, listas genéricas e métodos 
de manipulação de objetos.

Declaração da classe Ambiente:
A classe Ambiente é definida com os seguintes membros:
Um campo privado chamado nome, que armazena uma descrição ou nome do ambiente.
Um campo final chamado listaItensAmbiente, que é uma lista de objetos do tipo 
ItemAmbiente. O campo é marcado como final, o que significa que, uma vez atribuído, 
ele não pode ser alterado.

Construtor:
A classe Ambiente possui um construtor que aceita um argumento do tipo String chamado 
nome. Este construtor é usado para criar uma instância da classe Ambiente e inicializar 
o campo nome com o valor fornecido. Além disso, ele inicializa a lista de itens do 
ambiente, listaItensAmbiente, como uma instância de ArrayList.

Métodos de acesso:
A classe possui métodos getNome() e setNome(String nome) para acessar e modificar o campo nome.

Métodos adicionarItemAmbiente e removerItemAmbiente:
Esses métodos permitem adicionar e remover objetos do tipo ItemAmbiente à lista 
listaItensAmbiente. Eles retornam true se a operação for bem-sucedida (ou seja, se o item não 
existir na lista ao adicionar ou existir na lista ao remover) e false caso contrário.

Sobrescrita dos métodos equals e hashCode:
A classe Ambiente sobrescreve os métodos equals(Object o) e hashCode(). O método equals 
compara duas instâncias de Ambiente para verificar se seus campos nome são iguais, enquanto 
o método hashCode retorna um código hash com base no campo nome. Isso permite que objetos 
dessa classe sejam comparados e usados como chaves em coleções, como HashMap.*/



/*Em resumo, a classe Ambiente representa um ambiente com um nome e 
uma lista de itens associados a ele, permitindo a adição e remoção de 
itens do ambiente. A implementação inclui métodos para comparar e 
calcular o hash com base no nome do ambiente. */