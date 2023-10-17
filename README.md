# Processo seletivo desktop
Esse código tem por objetivo servir de base para as próximas etapas do processo seletivo da Scenario Automation, onde serão solicitadas novas funcionalidades ou alterações no mesmo. Ele representa de maneira simplista um projeto de automação. O projeto pode ser abstraído como uma casa, que possui vários ambientes (cômodos da casa). Esses cômodos contêm alguns itens, no caso do nosso exemplo, luminárias, módulos e teclados. Os módulos são módulos de potência que controlam diversos equipamentos (cargas); no código, utilizamos luminárias, mas o controle pode ser mais amplo, atingindo também motores de piscina, ventiladores, entre outros itens. Essas cargas são acionadas por outros equipamentos, os teclados. Cada teclado aciona diversas cargas, não necessariamente apenas cargas que estejam no mesmo ambiente.


Classes e Hierarquia de Herança:

ItemAmbiente: Classe base que define o comportamento comum para itens de ambiente, usada como superclasse para Modulo, Luminaria, e outras classes.
Modulo e Luminaria: Ambas herdam de ItemAmbiente e têm funcionalidades específicas relacionadas a módulos e luminárias.
Ambiente: Representa um ambiente e contém uma lista de itens de ambiente (ItemAmbiente).
Projeto: Representa um projeto e contém uma lista de ambientes (Ambiente).
Composição:

As classes fazem uso de composição para criar relações entre objetos. Por exemplo, Ambiente contém uma lista de ItemAmbiente.
Lista e Coleções:

Uso de Listas (ArrayList) para armazenar itens em Ambiente, Projeto, Modulo, e Luminaria.
Equals e HashCode:

Override dos métodos equals() e hashCode() para garantir a correta comparação e identificação de objetos.
Enumeração (enum):

Utilização de uma enumeração chamada Corteclado para definir tipos de cores de teclado.
Construtores:

Uso de construtores para inicialização e configuração de objetos.
Métodos para Adicionar e Remover Itens:

Implementação de métodos para adicionar e remover itens de ambiente em Ambiente.
Padrões de Nomenclatura:

Utilização de padrões de nomenclatura, como camelCase para nomes de métodos e PascalCase para nomes de classes.
