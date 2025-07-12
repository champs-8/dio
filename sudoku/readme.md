# Sudoku em Java

Projeto desenvolvido em Java para simular o clássico jogo **Sudoku** no terminal, aplicando os princípios da **Programação Orientada a Objetos (POO)**. O foco foi a construção de uma lógica robusta de validação de jogadas e gerenciamento do estado do tabuleiro.

---

## 🎯 Funcionalidades

- ✔️ Geração de tabuleiro completo com solução válida
- ✔️ Remoção de números para criação de desafio (níveis de dificuldade)
- ✔️ Validação de jogadas (linha, coluna e bloco 3x3)
- ✔️ Detecção de conclusão correta do jogo
- ✔️ Interface por terminal com leitura de coordenadas e valores

---

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (encapsulamento, classes, métodos)
- Algoritmo de **backtracking** para geração de soluções
- Manipulação de matrizes bidimensionais
- Leitura de dados do usuário com `Scanner`
- Separação de responsabilidades (modelo, lógica, visualização)

---

## 🏗️ Estrutura do Projeto

```bash

├── Main.java # Classe principal (ponto de entrada do programa)
├── Board.java # Representa o tabuleiro e suas operações
├── Cell.java # Representa uma célula do tabuleiro (valor e se é fixa)
├── SudokuGenerator.java # Responsável por gerar tabuleiros válidos
├── SudokuValidator.java # Contém as regras de validação do Sudoku
└── BoardPrinter.java (opcional) # Exibe o tabuleiro de forma formatada

```

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/champs-8/dio.git
   cd dio/sudoku
2. Compile o código:
   ```bash
   javac Main.java Board.java Cell.java SudokuGenerator.java SudokuValidator.java BoardPrinter.java
   ```
3. Execute o programa:
   ```bash
    java Main
    ```
