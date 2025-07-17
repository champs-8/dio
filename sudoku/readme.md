# Sudoku em Java

Projeto desenvolvido em Java para simular o clássico jogo **Sudoku** no terminal, aplicando os princípios da **Programação Orientada a Objetos (POO)**. O foco foi a construção de uma lógica robusta de validação de jogadas e gerenciamento do estado do tabuleiro.

<div align="center">
   <img src="https://raw.githubusercontent.com/champs-8/champs-8.github.io/main/media/sudoku.png" title="Jogo do sudoku" alt="Jogo do sudoku"/>
</div>

---

## 🎯 Funcionalidades

- ✔️ Geração de tabuleiro completo com solução válida
- ✔️ Remoção de números para criação de desafio (níveis de dificuldade)
- ✔️ Validação de jogadas (linha, coluna e bloco 3x3)
- ✔️ Detecção de conclusão correta do jogo
- ✔️ Interface por terminal com leitura de coordenadas e valores

---

## 🎮 Como Jogar?

1. 🔲 **Escolha a dificuldade**  
   Ao iniciar o jogo, você será solicitado a digitar **quantos quadrados vazios** deseja no tabuleiro.  
   Quanto mais vazios, mais difícil será o desafio!


2. 🧠 **O tabuleiro será gerado automaticamente**  
   O jogo irá montar um tabuleiro de Sudoku com a quantidade de espaços vazios escolhida.


3. 🎯 **Insira sua jogada**  
   Para preencher uma célula do tabuleiro, siga esta ordem de entrada:

   - ✏️ Digite o **número da coluna** e pressione **Enter**
   - ✏️ Digite o **número da linha** e pressione **Enter**
   - 🔢 Digite o **número que deseja inserir** e pressione **Enter**
   

   ✅ Se o movimento for válido, o número será adicionado ao tabuleiro.

   ❌ Se a jogada for inválida (número repetido na linha, coluna ou bloco), o jogo informará o erro.

4. 🏁 **Objetivo**  
   Complete o tabuleiro corretamente preenchendo todos os espaços vazios com números de 1 a 9, respeitando as regras do Sudoku!



📝 **Observação**:  
O jogo roda no terminal. Use números inteiros válidos ao inserir os valores.

Boa sorte! 🍀


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
├── SudokuGame # Classe responsável pela lógica e visualização do jogo
├── SudokuBoard.java # Representa o tabuleiro e suas operações
├── SudokuCell.java # Representa uma célula do tabuleiro (valor e se é fixa)
├── SudokuGenerator.java # Responsável por gerar tabuleiros válidos
├── SudokuValidator.java # Contém as regras de validação do Sudoku

```

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/champs-8/dio.git
   cd dio/sudoku
2. Compile o código:
   ```bash
   javac Main.java SudokuBoard.java SudokuCell.java SudokuGenerator.java SudokuValidator.java SudokuGame.java
   ```
3. Execute o programa:
   ```bash
    java Main
    ```
