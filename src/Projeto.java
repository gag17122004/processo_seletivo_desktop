import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private final List<Ambiente> listaAmbientes;

    public Projeto(String nome) {
        this.nome = nome;
        listaAmbientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean adicionarAmbiente(Ambiente ambiente) {
        if (!listaAmbientes.contains(ambiente)) {
            listaAmbientes.add(ambiente);
            return true;
        }
        return false;
    }
}

/*import java.util.ArrayList; e import java.util.List;: Essas linhas importam 
as classes ArrayList e List do pacote java.util. Essas classes são usadas para 
armazenar uma lista de elementos, no caso, uma lista de objetos da classe Ambiente.

public class Projeto {: Aqui, a declaração da classe Projeto começa.

private String nome;: Esta linha declara uma variável de instância privada chamada 
nome, que armazenará o nome do projeto.

private final List<Ambiente> listaAmbientes;: Aqui, é declarada uma variável de 
instância privada e final chamada listaAmbientes. Ela é do tipo List, que é uma 
interface genérica para armazenar uma lista de objetos, e é parametrizada com a 
classe Ambiente. A palavra-chave final significa que uma vez atribuído um valor 
a esta variável, ele não pode ser alterado.

public Projeto(String nome) {: Isso é o construtor da classe Projeto, que recebe 
um argumento nome ao criar uma instância da classe.

this.nome = nome;: Aqui, o construtor atribui o valor do argumento nome à variável 
de instância nome, que foi declarada na linha 4.

listaAmbientes = new ArrayList<>();: Neste trecho, o construtor inicializa a 
variável listaAmbientes criando uma nova instância de ArrayList e atribuindo-a 
a essa variável. Isso cria uma lista vazia para armazenar objetos da classe Ambiente.

public String getNome() {: Este é um método getter que permite obter o valor 
da variável de instância nome.

return nome;: O método retorna o valor da variável nome.

public void setNome(String nome) {: Este é um método setter que permite definir 
o valor da variável de instância nome.

this.nome = nome;: Aqui, o método atribui o novo valor nome à variável de instância nome.

public boolean adicionarAmbiente(Ambiente ambiente) {: Este método permite 
adicionar um objeto da classe Ambiente à lista de ambientes associada a este projeto.

if (!listaAmbientes.contains(ambiente)) {: Ele verifica se o objeto ambiente não está 
na lista de ambientes. Para isso, usa o método contains da lista.

listaAmbientes.add(ambiente);: Se o objeto ambiente não estiver na lista, ele é 
adicionado usando o método add.

return false;: Se o objeto ambiente já estiver na lista, o método retorna false para 
indicar que a adição não foi bem-sucedida.

return true;: Se o objeto ambiente não estava na lista e foi adicionado com sucesso, 
o método retorna true para indicar que a adição foi bem-sucedida. */



/*O código define uma classe simples para representar um 
projeto com um nome e uma lista de ambientes, permitindo a 
adição de ambientes ao projeto. A funcionalidade da classe 
depende da implementação da classe Ambiente, que não está 
incluída no código fornecido. */