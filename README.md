# Projeto Computador em Java

Este repositório contém meu primeiro projeto de **Programação Orientada a Objetos (POO)** em Java, desenvolvido para a disciplina de **Programação Orientada a Objetos** na faculdade.

## Descrição do Projeto

O projeto consiste em uma aplicação que modela computadores usando os conceitos de POO. Foi implementada uma classe `Computador` com diversos atributos e métodos, além de uma classe de teste para instanciar e manipular os objetos do tipo `Computador`.

### Funcionalidades
- **Criação de objetos**: a classe `Computador` permite a criação de objetos representando computadores.
- **Construtores**: a classe possui um construtor padrão (sem parâmetros) e um construtor com parâmetros.
- **Getters e Setters**: métodos para acessar e modificar os atributos do objeto.
- **Impressão de atributos**: método `imprimir` que exibe os detalhes do objeto.

## Estrutura do Projeto

O projeto contém dois arquivos principais:
1. **Computador.java**: Contém a definição da classe `Computador` com os seguintes atributos:
   - `marca` (String)
   - `modelo` (String)
   - `memoriaRAM` (int)
   - `processadorGHz` (double)
   - `preco` (double)

2. **TesteComputador.java**: Uma classe de teste que:
   - Instancia quatro objetos `Computador`.
   - Solicita ao usuário os dados dos computadores e os exibe ao final.

## Como Executar

### Pré-requisitos
- Ter o **Java Development Kit (JDK)** instalado (versão 8 ou superior).
- Um ambiente de desenvolvimento como **Visual Studio Code** ou **Eclipse**, ou simplesmente o terminal do sistema operacional.

### Passos para Executar:
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/repositorio-computador-java.git
2. Compile os arquivos .java:
   ```bash
   javac Computador.java TesteComputador.java
3. Execute a aplicação:
   ```bash
   java TesteComputador

### Exemplos de uso
Ao executar o programa, você será solicitado a inserir as informações de um ou mais computadores, como marca, modelo, memória RAM, processador e preço. O sistema então imprimirá essas informações formatadas.

### Tecnologias Utilizadas
- Java: Linguagem de programação usada para desenvolver a aplicação.
- Paradigma Orientado a Objetos: Modelo de desenvolvimento utilizado.

## Contribuição
Contribuições são sempre bem-vindas! Se você encontrar algum problema ou quiser adicionar novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.
