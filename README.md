# 🏦 API Bancária – Spring Boot  
Uma API completa de sistema bancário construída em **Java** com **Spring Boot**, implementando operações essenciais, segurança, notificações por e-mail e integração com IA para atendimento ao cliente.



## 📌 Visão Geral

Esta aplicação simula o backend de um **sistema bancário real**, oferecendo funcionalidades essenciais como:

- Cadastro de usuários e criação automática de contas  
- Depósito (crédito)  
- Saque (débito)  
- Transferências entre contas  
- Consulta de saldo  
- Consulta de dados de clientes  
- Envio de alertas por e-mail  
- Segurança com JWT (Spring Security)  
- Atendimento virtual com ChatGPT (opcional)

O objetivo é fornecer uma base sólida para estudos e para construção de sistemas financeiros seguros e organizados.


## 🚀 Funcionalidades Implementadas

### ✅ **1. Cadastro de Usuário**
Ao criar uma conta:
- O usuário autoriza uso dos dados.
- O sistema registra o cliente.
- É gerado automaticamente um **número de conta bancária**.
- Um e-mail de boas-vindas é enviado com o número da conta.


### ✅ **2. Serviços Bancários**
A API oferece os principais serviços que um banco real executa:

#### 🔹 **Crédito (Depósito)**  
Adiciona saldo na conta do usuário.

#### 🔹 **Débito (Saque)**  
Subtrai saldo disponível (caso haja limite suficiente).

#### 🔹 **Transferência entre Contas**  
- Debita a conta de origem  
- Credita a conta de destino  

Cada operação dispara um **e-mail de alerta** para o cliente.


### ✅ **3. Consultas**
- **Consulta de saldo**
- **Consulta de dados do cliente**
- **Consulta de transações**


### ✅ **4. Notificações por E-mail**
A cada operação, o cliente recebe um alerta, por exemplo:
- Cadastro realizado  
- Depósito efetuado  
- Saque aprovado  
- Transferência concluída  


### ✅ **5. Segurança – Spring Security + JWT**
A API utiliza:
- **Autenticação JWT**
- **Controle de permissões por papel (role)**  
  Exemplo:
  - Apenas administradores podem listar todos os usuários.
  - Clientes só acessam seus próprios dados.
  
As roles definem quais endpoints podem ser acessados por cada tipo de usuário.


### ✅ **6. Integração com ChatGPT (Atendimento Virtual)**
A API também integra um agente conversacional usando ChatGPT para:

- Suporte ao cliente  
- Explicações sobre operações  
- Ajuda no uso do sistema  


## 🧱 Arquitetura e Boas Práticas

Durante o desenvolvimento, foram utilizados diferentes padrões e abordagens:

- **DTOs** para transferência de dados  
- **Padrão Builder** para criação de objetos  
- **ModelMapper** para conversão entre entidades e DTOs  
- Separação clara entre:
  - Controllers  
  - Services  
  - Repositories  
  - Domain  
- Organização preparada para escalabilidade
- Refatorações contínuas seguindo padrões de mercado

O objetivo é preparar o código para um padrão profissional de desenvolvimento.




### 👤 Usuário

