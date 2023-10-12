import java.util.ArrayList;
import java.util.List;

public class Modulo extends ItemAmbiente{
    private final List<Luminaria> canais;

    public Modulo(String nome) {
        super(nome);
        this.canais = new ArrayList<>();
    }

    public void adicionarLuminaria(Luminaria luminaria){
        canais.add(luminaria);
    }
}

/* Esse código Java define uma classe chamada `Modulo` que herda da classe `ItemAmbiente` 
e representa um módulo de iluminação. O módulo possui uma lista de luminárias que podem 
ser adicionadas a ele.

Aqui está uma explicação detalhada do código:

1. **Imports**: O código começa com duas declarações de importação que trazem as classes 
`ArrayList` e `List` do pacote `java.util`. Essas classes são usadas para lidar com listas 
dinâmicas de objetos.

2. **Declaração da Classe `Modulo`**: A classe `Modulo` é declarada e estende a classe 
`ItemAmbiente`. Isso significa que `Modulo` herda todas as propriedades e métodos da classe 
`ItemAmbiente`. A classe `Modulo` representa um módulo de iluminação em um ambiente.

3. **Atributos**:
- `private final List<Luminaria> canais`: Este é um atributo privado e final (ou seja, 
não pode ser modificado após a inicialização) que armazena uma lista de objetos do tipo 
`Luminaria`. Essa lista é usada para manter as luminárias associadas a este módulo.

4. **Construtor**:
- `public Modulo(String nome)`: Este é o construtor da classe `Modulo`. Ele recebe um 
parâmetro de nome e chama o construtor da classe pai (`ItemAmbiente`) usando `super(nome)` 
para inicializar o nome do módulo. Além disso, ele inicializa a lista de luminárias 
(`canais`) como uma nova instância de `ArrayList`.

5. **Método `adicionarLuminaria`**:
- `public void adicionarLuminaria(Lumin*/



/*Em resumo, o código define uma classe "Modulo" que herda 
de "ItemAmbiente" e possui uma lista de luminárias chamada 
"canais". Há um construtor que inicializa a lista de canais 
e um método para adicionar luminárias a essa lista. A utilização 
real e o comportamento completo da classe dependem de como a classe 
"Luminaria" e a classe "ItemAmbiente" estão implementadas. */