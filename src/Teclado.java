import java.util.Objects;

public class Teclado extends ItemAmbiente {

    private Corteclado corTeclado;

    public Teclado(String nome, Corteclado corTeclado) {
        super(nome);
        this.corTeclado = corTeclado;
    }

    public Corteclado getCorTeclado() {
        return corTeclado;
    }

    public void setCorTeclado(Corteclado corTeclado) {
        this.corTeclado = corTeclado;
    }
}

/*import java.util.Objects;: Isso importa a classe Objects do 
pacote java.util. No entanto, no código fornecido, a classe Objects 
não está sendo usada explicitamente. Portanto, esta importação pode 
ser removida, a menos que haja partes do código que não foram incluídas.

public class Teclado extends ItemAmbiente: A classe Teclado é definida 
e estende a classe ItemAmbiente. Isso significa que a classe Teclado 
herda todos os membros (métodos e campos) públicos e protegidos da 
classe ItemAmbiente.

private Corteclado corTeclado;: Isso declara um campo privado chamado 
corTeclado do tipo Corteclado. Essa variável é usada para armazenar a 
cor do teclado.

O construtor Teclado(String nome, Corteclado corTeclado) é definido para 
criar objetos da classe Teclado. O construtor recebe dois parâmetros: 
nome (uma string que representa o nome do teclado) e corTeclado (um objeto 
do tipo Corteclado que representa a cor do teclado). Dentro do construtor, 
a superclasse ItemAmbiente é chamada com o argumento nome usando super(nome), 
e o campo corTeclado é inicializado com o valor fornecido.

public Corteclado getCorTeclado(): Este método é um getter (acessador) 
público que permite acessar o valor da cor do teclado armazenado no 
campo corTeclado.

public void setCorTeclado(Corteclado corTeclado): Este método é um setter 
(modificador) público que permite definir o valor do campo corTeclado com 
um novo valor Corteclado. Isso é útil para alterar a cor do teclado após 
a criação do objeto. */



/*Portanto, esta classe representa um teclado que herda 
funcionalidades de uma classe chamada "ItemAmbiente", 
possui um atributo para armazenar a cor do teclado e 
tem métodos para obter e definir essa cor. */