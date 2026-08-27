# Running

Exercício em Java para modelar um aplicativo de corridas, relacionando clientes, motoristas, veículos e trajetos.

## Objetivo

O projeto demonstra os fundamentos de orientação a objetos:

- herança entre usuários, clientes e motoristas;
- herança e polimorfismo entre automóveis, carros e motos;
- associação entre uma corrida e seus participantes;
- encapsulamento por meio de atributos privados, getters e setters.

## Domínio da aplicação

Uma corrida reúne os seguintes elementos:

```text
Cliente + Motorista + Automóvel + Origem + Destino + Valor
```

O cliente solicita a corrida, o motorista realiza o trajeto e o automóvel utilizado pode ser um carro ou uma moto. A classe `Corrida` concentra essas relações e apresenta um resumo no console.

## Conceitos praticados

### Herança

`Cliente` e `Motorista` representam especializações de `Usuario`. Da mesma forma, `Carro` e `Moto` herdam características comuns de `Automovel`.

### Polimorfismo

Uma corrida recebe um `Automovel`, permitindo utilizar diferentes tipos de veículo, como `Carro` ou `Moto`, sem alterar a estrutura da corrida.

### Encapsulamento

Os dados das entidades são mantidos nos próprios objetos e acessados por métodos. Isso facilita a validação e a evolução das regras do sistema.

## Exemplo de saída esperada

Depois que as classes estiverem compilando, o programa deverá exibir informações semelhantes a:

```text
====== CORRIDA ======
Cliente: nome do cliente
Motorista: nome do motorista (CNH: número da CNH)
Veiculo: fabricante modelo | Placa: ABC1D23
Trajeto: origem -> destino
Valor: R$ 25.0
==============================
```

## Estrutura

O código-fonte está em `course/`:

- `Main.java`: ponto de entrada e exemplo de criação de corridas;
- `Corrida.java`: representa uma corrida e exibe seus detalhes;
- `Usuario.java`: base para os usuários do sistema;
- `Cliente.java`: dados específicos do cliente;
- `Motorista.java`: dados específicos do motorista;
- `Automovel.java`: classe base dos veículos;
- `Carro.java` e `Moto.java`: especializações de automóvel.

## Como executar

Com um JDK instalado, a partir da raiz do projeto:

```powershell
javac course\*.java
java -cp course Main
```

Os arquivos `.class` serão gerados dentro de `course/`. Eles podem ser removidos após o teste com:

```powershell
Remove-Item course\*.class
```

## Próximos passos

- corrigir as assinaturas dos construtores e os tipos usados nas classes;
- completar os objetos de motorista, origem, destino e valor em `Main.java`;
- adicionar validação para dados obrigatórios, placa, CPF e valor da corrida;
- criar testes para carros, motos e exibição dos detalhes da corrida;
- separar o código em pacotes, como `model` e `app`, conforme o projeto crescer.

## Estado atual

O projeto está em desenvolvimento. O exemplo em `Main.java` e algumas classes ainda possuem definições incompletas, portanto a compilação pode exigir correções antes da execução.
