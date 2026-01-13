# Exercício proposto
## Descrição

Fazer um programa para ler o caminho de um arquivo .csvcontendo os dados de itens vendidos. Cada item possui umnome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizadoem uma subpasta chamada "out" a partir da pasta original doarquivo de origem, contendo apenas o nome e o valor total paraaquele item (preço unitário multiplicado pela quantidade),conforme exemplo.

**Exemplo**

Source file:
````
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
````

Output file (out/summary.csv):
````
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
````
