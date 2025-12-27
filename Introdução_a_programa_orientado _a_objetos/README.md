# Exercícios de fixação

## Exercício 1

**Descrição:**

Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua **área, perímetro e diagonal**. Usar uma classe como mostrado no projeto ao lado.
````
-----------------------
     **RECTANGLE**
-----------------------
 - Windth: double
 - Heigth: double
-----------------------
 + Area(): double
 + Perimeter(): double
 + Diagonal(): double
-----------------------
````
**Exemplo:**
````
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
````
## Exercício 2

**Descrição:**

Fazer um programa para ler os dados de um funcionário (**nome, salário bruto e imposto**). Em seguida, mostrar os dados do funcionário (**nome e salário líquido**). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (**somente o salário bruto é afetado pela porcentagem**) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
````
------------------------------------------
              **EMPLOYEE**
------------------------------------------
 - Name: string
 - GrossSalary: double
 - Tax: double
------------------------------------------
 + NetSalary():double
 +IncreaseSalary(percente: double): vloid
------------------------------------------
````
**Exemplo:**
````
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00

Employee: Joao Silva, $ 5000.00

Which percentage to increase salary? 10.0

Updated data: Joao Silva, $ 5600.00
````
## Exercício 2

**Descrição:**

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.

**Exemplo 1:**

Entrada:
````
Alex Green
27.00
31.00
32.00
````
Saída:
````
FINAL GRADE = 90.00
PASS
````
**Exemplo 2:**

Entrada:
````
Alex Green
17.00
20.00
15.00
````
Saída:
````
FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
````
