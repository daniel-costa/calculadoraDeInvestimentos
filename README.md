## Calculadora de Investimentos
### Objetivo
- Projetar o resultado de investimentos recorrentes ao longo do tempo, reinvestimendo os dividendos mensais.
### Descrição
- A base para esse calculo é um valor inicial a ser investido, um valor de recorrencia mensal investido, a taxa de rendimento mensal, o tempo de duração do investimento e uma correção anual do valor mensal investido. Essa correção anual do valor mensal investido é necessária por conta que a inflação diminuie a relevância do dinheiro ao longo do tempo, e considerando que como "tudo" teve um aumento nos preços as suas receitas deveriam acompanhar esse aumento também.
- O calculo leva em conta que todo o rendimento mensal será reinvestido no mês seguinte, dessa forma utilizando de juros compostos para potencializar o investimento final. 

### Pre-requisitos para gerar o executável
- Ter a Maquina Virtual Java instalada
- Ter o Maven instalado
    
### Passo-a-Passo
#### Clonar o repositório
- Comando: `git clone https://github.com/nogueiralegacy/projetaInvestimento`

#### Acessar a raiz do projeto

#### Gerar o jar file executável
- Executar o comando `mvn package -P executavel-unico`

#### Executar o jar file
- Basta utilizar o comando `java -jar target\projetaInvestimento-console-exec.jar`
- Pronto agora é responder as perguntas com os valores desejados.

### Resultado
- Ao final da coleta dos dados é fornecido: 
  - uma projeção desse investimento
  - o valor total investido

## Tech

### Ferramentas
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

### Linguagem

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
