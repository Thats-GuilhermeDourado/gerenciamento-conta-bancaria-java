# gerenciamento-conta-bancaria-java

Este repositório contém uma aplicação simples em Java para gerenciamento de contas bancárias. A aplicação permite adicionar, remover, consultar contas, além de realizar operações como depósito, saque e alteração de limites de saque.

Funcionalidades
Adicionar Conta: Adiciona uma nova conta bancária ao banco.
Remover Conta: Remove uma conta existente a partir do número da conta.
Consultar Conta: Exibe as informações de uma conta bancária específica (titular e saldo).
Depositar: Permite depositar um valor em uma conta bancária.
Sacar: Permite sacar um valor de uma conta, verificando saldo e limite de saque.
Alterar Limite de Saque: Modifica o limite de saque de uma conta bancária.

## Estrutura do Projeto
O projeto é composto pelos seguintes arquivos:

Banco.java: Classe que gerencia as contas bancárias, permitindo adicionar, remover e consultar contas.
ContaBancaria.java: Classe que representa uma conta bancária com atributos como número da conta, titular, saldo e limite de saque.
Main.java: Classe principal que contém exemplos de uso das funcionalidades implementadas.

## Como Executar

1. Clone o repositório:
git clone https://github.com/Thats-GuilhermeDourado/gerenciamento-conta-bancaria-java.git

2. Compile e execute o projeto:
   -  Navegue até o diretório onde os arquivos .java estão localizados.
   - Compile os arquivos com o comando:
javac Banco.java ContaBancaria.java Main.java

3. Execute o arquivo principal:
   - java Main

## Exemplo de Uso
Ao rodar o programa, ele executará as seguintes operações como exemplo:

Criação de duas contas (conta1 e conta2).
Adição das contas ao banco.
Consulta da conta1 e exibição do titular e saldo.
Depósito de R$ 200,00 na conta1 e exibição do saldo atualizado.
Saque de R$ 300,00 na conta1 e exibição do saldo atualizado.
Alteração do limite de saque da conta1 para R$ 600,00.
Tentativa de sacar R$ 700,00 na conta1 (não permitido devido ao limite).
Remoção da conta2 do banco.






