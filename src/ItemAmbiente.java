import java.util.Objects;

public class ItemAmbiente {
    private String nome;

    public ItemAmbiente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAmbiente that = (ItemAmbiente) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

/*
1. `import java.util.Objects;`: Esta linha de código importa a classe `Objects` 
do pacote `java.util`. A classe `Objects` fornece métodos utilitários para 
operações comuns em objetos, como comparação, cálculo de hash e outros.

2. `public class ItemAmbiente {`: Aqui, a classe `ItemAmbiente` é definida 
como pública, o que significa que outras classes podem acessá-la. Esta 
classe representa um item em um ambiente.

3. `private String nome;`: Esta linha declara uma variável de instância privada 
chamada `nome`, que é uma string. O `nome` representa o nome do item no ambiente.

4. `public ItemAmbiente(String nome) {`: Este é o construtor da classe `ItemAmbiente`. 
Ele aceita um argumento `nome` ao criar um objeto `ItemAmbiente` e atribui esse nome à 
variável de instância `nome`.

5. `public String getNome() {`: Este é um método de acesso (getter) para obter o 
valor da variável `nome`.

6. `return nome;`: Este é o retorno do método `getNome`, que retorna o valor atual 
da variável `nome`.

7. `public void setNome(String nome) {`: Este é um método de modificação (setter) 
que permite definir um novo valor para a variável `nome`.

8. `this.nome = nome;`: Neste trecho, a variável de instância `nome` é atualizada 
com o novo valor fornecido como argumento para o método `setNome`.

9. `@Override`: Esta anotação é usada para indicar que os métodos a seguir estão 
substituindo métodos da classe pai (no caso, da classe `Object`).

10. `public boolean equals(Object o) {`: Este método substitui o método `equals` da 
classe `Object`. Ele é usado para comparar dois objetos `ItemAmbiente` para determinar se eles são iguais.

11. `if (this == o) return true;`: Esta linha verifica se o objeto sendo comparado (`o`) 
é o próprio objeto atual (`this`). Se for o caso, retorna `true`, indicando que são iguais.

12. `if (o == null || getClass() != o.getClass()) return false;`: Esta linha verifica se 
o objeto `o` é nulo ou se não pertence à mesma classe `ItemAmbiente`. Se alguma dessas 
condições for verdadeira, o método retorna `false`, indicando que os objetos não são iguais.

13. `ItemAmbiente that = (ItemAmbiente) o;`: Aqui, o objeto `o` é convertido para um objeto 
da classe `ItemAmbiente`, pois já foi verificado que ele pertence a essa classe.

14. `return Objects.equals(nome, that.nome);`: Esta linha compara os valores da variável `nome` 
do objeto atual (`this`) com o objeto `that` para determinar se são iguais usando o método `equals` 
da classe `Objects`. Se os nomes forem iguais, o método retorna `true`, indicando que os objetos são iguais.

15. `@Override`: Esta anotação indica que o método a seguir está substituindo 
o método `hashCode` da classe `Object`.

16. `public int hashCode() {`: Este método substitui o método `hashCode` da classe 
`Object`. Ele é usado para calcular um valor de hash para o objeto, que é frequentemente 
usado em estruturas de dados baseadas em hash, como tabelas de hash.

17. `return Objects.hash(nome);`: Neste caso, o valor de hash é calculado com base no valor 
da variável `nome`. O método `Objects.hash` é usado para calcular o hash, e o resultado é 
retornado como um valor inteiro. */



/*Essa classe é usada para representar um item em um ambiente, 
com funcionalidades para acessar e modificar o nome do item, 
além de implementar métodos para comparar a igualdade e gerar 
o hash do objeto com base no nome. */