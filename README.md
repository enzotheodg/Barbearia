# ✂️ Sistema de Agendamento de Barbearia

Este é um projeto simples de linha de comando (CLI) desenvolvido em **Java**. O sistema permite o cadastro de clientes com validação de dados e o agendamento de serviços com os barbeiros disponíveis.

## 🚀 Funcionalidades

O sistema possui um menu interativo com as seguintes opções:

1. **Cadastro de Cliente**: 
   - Solicita Nome, CPF, Telefone e E-mail.
   - Realiza validações automáticas (ex: CPF e Telefone devem ter 11 dígitos numéricos, Nome deve conter apenas letras, E-mail deve ter formato válido).
2. **Atualizar Cadastro**: 
   - Permite alterar os dados cadastrados anteriormente, passando pelas mesmas validações de segurança.
3. **Marcar um Horário**: 
   - Exibe a agenda de um barbeiro específico (ex: "Jonas").
   - Permite escolher um dia da semana (Segunda a Sexta).
   - Permite escolher um horário de atendimento (das 9h às 19h).
   - Permite escolher o serviço desejado (Corte, Barba, Barboterapia ou Sobrancelha).
4. **Sair**: Encerra a aplicação.

## 📂 Estrutura do Projeto

O projeto é composto por três classes principais:

* **`Barbearia.java`**: É a classe principal (contém o método `main`). Responsável por exibir o menu interativo, capturar as entradas do usuário e interagir com as outras classes.
* **`Cliente.java`**: Representa a entidade Cliente. Contém os atributos do cliente e métodos booleanos rigorosos para validação de formato de Nome, CPF, E-mail e Telefone utilizando Expressões Regulares (Regex).
* **`Barbeiro.java`**: Representa a entidade Barbeiro. Gerencia uma matriz bi-dimensional (`agenda`) que simula os dias da semana e os horários de trabalho, além de gerenciar a marcação de serviços.

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK 8 ou superior)
* **Scanner** (para entrada de dados via console)
* **Expressões Regulares (Regex)** (para validação de dados)
* **Collections (HashMap)** (para armazenamento dos barbeiros)

## ⚙️ Pré-requisitos

Para rodar este projeto, você precisará ter o **Java Development Kit (JDK)** instalado na sua máquina. 

Para verificar se o Java está instalado, abra o terminal e digite:
```bash
java -version
