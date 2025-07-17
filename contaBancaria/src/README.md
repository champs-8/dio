# 💳 Sistema de Conta Bancária em Java

Este é um projeto simples de **simulação bancária via terminal**, desenvolvido em Java.  
O usuário pode criar uma conta, depositar, sacar, pagar boletos, consultar saldo e limite de cheque especial.

Ideal para fins educacionais, reforçando conceitos de lógica, programação orientada a objetos e entrada de dados no console.

---

## 🧾 Funcionalidades

- 👤 Criar conta bancária com nome e valor inicial
- 💰 Depositar e sacar dinheiro
- 📄 Pagar boletos com ou sem saldo
- 🧾 Consultar saldo e limite de cheque especial
- 📉 Usar cheque especial quando o saldo for insuficiente
- 🔄 Menu interativo em loop até o usuário escolher sair

---

## 🏗️ Estrutura do Projeto

```bash
contaBancaria/
├── src/
│ ├── ContaBancaria.java # Classe principal com menu interativo
│ ├── Conta.java #  Classe da conta bancária
│ └── Client.java #  Classe que representa o cliente
```

---

## 🚀 Como Executar

### ✅ Pré-requisitos

- Java JDK 8 ou superior
- Terminal ou IDE (ex: IntelliJ IDEA, Eclipse, VS Code)

---

### 🖥️ Passos via terminal

1. Clone o repositório:

```bash
git clone https://github.com/champs-8/dio.git
cd dio/contaBancaria/
```

Compile os arquivos Java:

```
javac *.java
```

Execute o programa:
```
java ContaBancaria
```

---

## 🧠 Lógica do Sistema
- O programa pergunta se o usuário já possui uma conta.
- Caso não tenha, será feito:
- Cadastro de cliente
- Criação de conta
- Definição de limite de cheque especial
- 💡 R$ 50,00 se depósito ≤ R$ 500
- 💡 50% do valor depositado se depósito > R$ 500

  Após o cadastro, o usuário entra no menu com opções:
- Consultar saldo
- Ver limite do cheque especial
- Realizar saque
- Fazer depósito
- Pagar boleto
- Verificar quanto já usou do cheque especial
- Sair

> O cheque especial é usado automaticamente quando o saldo for insuficiente.

--- 

⚙️ Tecnologias utilizadas

- ☕ Java (JDK 8+)

- 🎯 Scanner (entrada de dados)

- 🧱 Programação orientada a objetos

- 🛠️ Console interativo
