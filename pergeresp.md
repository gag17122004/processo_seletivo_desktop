Classe Main:

1.	O que é feito no método main da classe Main?
2.	Quais são os objetos criados no método main e como são inicializados?
3.	Como os objetos são adicionados ao ambiente?

Classe Main Resposta:

1.	O método main da classe Main cria instâncias de várias classes, como Projeto, Ambiente, Modulo, Luminaria e Teclado, e as associa umas às outras, criando uma estrutura de projeto com ambientes e módulos de iluminação.
2.	Os objetos são inicializados usando construtores das respectivas classes, passando os nomes e parâmetros necessários para cada objeto.
3.	Os objetos são adicionados ao ambiente por meio do método adicionarItemAmbiente da classe Ambiente.

Classe Modulo:

1.	O que é um módulo? Qual é o propósito dessa classe?
2.	Como as luminárias são associadas a um módulo?
3.	O que é armazenado na lista canais?

Classe Modulo Resposta:

1.	Um módulo representa uma unidade funcional que possui uma lista de luminárias associadas a ele.
2.	As luminárias são associadas a um módulo através do método adicionarLuminaria.
3.	A lista canais armazena as luminárias associadas a esse módulo.

Classe Luminaria:

1.	O que é uma luminária? Qual é o propósito dessa classe?
2.	Como os acionadores (teclados) são associados a uma luminária?
3.	Como é garantido que um acionador não seja adicionado mais de uma vez à lista?

Classe Luminaria Resposta:

1.	Uma luminária representa um dispositivo de iluminação que pode ser acionado por teclados.
2.	Os acionadores (teclados) são associados a uma luminária através do método adicionarAcionadores.
3.	O método adicionarAcionadores garante que um acionador não seja adicionado mais de uma vez à lista.o

Classe ItemAmbiente:

1.	Qual é o propósito dessa classe abstrata?
2.	Por que estão sendo sobrescritos os métodos equals e hashCode?
3.	O que é comparado no método equals?

Classe ItemAmbiente Resposta:

1.	A classe ItemAmbiente é uma classe abstrata que representa um item genérico de um ambiente.
2.	Os métodos equals e hashCode são sobrescritos para garantir a comparação correta de objetos dessa classe.
3.	No método equals, é comparado se o nome do item ambiente é igual.

Classe Ambiente:

1.	O que é um ambiente? Qual é o propósito dessa classe?
2.	Como os itens de ambiente são adicionados e removidos do ambiente?
3.	O que é comparado no método equals?

Classe Ambiente Resposta:

1.	Um ambiente representa uma área específica em um projeto, como uma sala.
2.	Os itens de ambiente, como módulos e luminárias, são adicionados e removidos do ambiente usando os métodos adicionarItemAmbiente e removerItemAmbiente, respectivamente.
3.	O método equals compara se o nome do ambiente é igual.

Classe Projeto:

1.	O que é um projeto? Qual é o propósito dessa classe?
2.	Como os ambientes são associados a um projeto?
3.	Como é garantido que um ambiente não seja adicionado mais de uma vez à lista?

Classe Projeto Resposta:

1.	Um projeto representa uma entidade que contém uma lista de ambientes.
2.	Os ambientes são associados a um projeto através do método adicionarAmbiente.
3.	O método equals compara se o nome do projeto é igual.

Classe Teclado:

1.	O que é um teclado? Qual é o propósito dessa classe?
2.	O que é a enumeração Corteclado e como ela é usada na classe Teclado?
3.	O que é comparado no método equals?

Classe Teclado Resposta:

1.	A classe Teclado representa um dispositivo de entrada que pode ter uma cor associada.
2.	A enumeração Corteclado representa as cores possíveis do teclado e é usada para definir a cor do teclado na criação do objeto Teclado.
3.	O método equals compara se o nome do teclado é igual.

Enumeração Corteclado:

1.	Para que serve essa enumeração?
2.	Quais são os possíveis valores para a cor do teclado?

Enumeração Corteclado Resposta:

1.	A enumeração Corteclado representa as possíveis cores de um teclado.
2.	Os possíveis valores para a cor do teclado são BRANCO e PRETO.

