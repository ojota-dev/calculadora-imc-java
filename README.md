# Calculadora de IMC em Java
Uma aplicação de console simples desenvolvida em **Java** para calcular o Índice de Massa Corporal (IMC) do usuário e classificar o resultado de acordo com os padrões de saúde.

Este projeto foi construído apenas para praticar conceitos fundamentais da linguagem Java e lógica de programação.

## Funcionalidades
- Entrada de dados interativa via terminal (peso e altura).
- Suporte ao padrão decimal americano (utilizando ponto "." como separador via Locale.US).
- Cálculo preciso do IMC.
- Classificação automática do resultado em faixas (Baixo peso, Peso normal, Sobrepeso, Obesidade).

## Tecnologias Utilizadas
- **Java** (OpenJDK 25.0.4.1)
- **Scanner** (java.util.Scanner) para a leitura dos dados no console.
- **Locale** (java.util.Locale) para tratamento de internacionalização de números decimais.

## Como Executar o Projeto

### Pré-requisitos
Possuir o **JDK** (Java Development Kit) instalado e configurado na sua máquina.

### Passo a Passo
1. Clone o repositório:
`git clone https://github.com/ojota-dev/calculadora-imc-java.git`

2. Navegue até a pasta do projeto:
`cd calculadora-imc-java`

3. Compile o arquivo Java:
`javac CalculadoraIMC.java`

4. Execute a aplicação:
`java CalculadoraIMC`

## Aprendizados
Durante o desenvolvimento deste projeto foi praticado:

- Declaração e manipulação de variáveis primitivas (`double`).
- Entrada de dados no console com a classe `Scanner`.
- Resolução de conflitos de formato regional de números decimais (`Locale`).
- Estruturas de controle condicional (`if`, `else if`, `else`).
- Saída formatada no terminal com `printf`.