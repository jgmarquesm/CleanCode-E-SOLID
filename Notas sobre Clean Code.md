# Notas sobre Clean Code e S.O.L.I.D

## Clean Code (Resumo em 7 princípios inicias)

- 1 - **Nomes auto explicativos**: Sejam de variáveis, funções, interfaces, classes, métodos, etc... É muito importante que o nome de algo faça sentido no
contexto do código em que ele está sendo escrito.
- 2 - **Regra do escoteiro**: Se refere ao ato de sempre refatorar o código, sempre deixar ele melhor(mais limpo) a cada vez que mexer.
- 3 - **Crie funções pequenas**: Ter funções e métodos pequenas e de responsabilidade única aumenta a coesão do código.
- 4 - **Don't Repeat Yourself (DRY)**: Não ficar repetindo código já escrito. Precisou reusar alguma parte do código? Então pq não refatorar isso para um
objeto ou função?
- 5 - **Comente somente o que é estritamente necessário**: Um bom(limpo) código não precisa de comentários para ser entendido. A identificação do que ele
faz é visível ao ler o próprio código.
- 6 - **Tratamento de Exceções**: Em um código bom é possível identificar eventuais Execeções e com isso pode-se tratar bem cada uma dessas exceções.
- 7 - **Testagem**: Os testes são parte do código, então faça! Através deles podemos identificar Execeções não tratadas antes do código seguir para
as próximas etapas da esteira de produção.

**Importante**: Evitar o uso de "números mágicos" (números explicítos) como paramentros passados. Ao invés disso, faça uma declaração de constante e
associe o número mágico à ela.

### Conceitos relacionados

- **DDD** Negócio ao Código: Muito por cima, é importante seraparar as coisas pelos seus contextos.
- Linguagem Onipresente: O nome dados aos elementos do código devem levar em consideração o contexto e serem sempre muito claros sobre o que representam
- Princípio SRP: Um princípio dividido com o S.O.L.I.D. e muito importante pois diz que cada Classe, método, função deve ter apenas uma razão de
existir. Sobre funções e métodos aind atem a ressalva de que deve ter apenas um nível de abstração e isso implica quase que diretamente na indireção
(delegação) de responsabilidade.
- Princípio DRY: Don't Repeat Yourself - Como o próprio nome diz, o DRY prega a reutlização de código. Sempre que possível defina uma função para fazer
a parte que se repete.
- Indireção / Delegação: Diretamente ligada com o SRP e o DRY, o Delegação de responsabilidade é usada para manter o baixo acoplamento e também apenas
um nível de abstração.
- Lei de Demeter:
- Acoplamento e Coesão:
- Imutabilidade:
- OO + Funções Puras: Sempre que possível, faça uso de funções puras (que não dependam do meio exterior).
- Testes Tempestivos: É muito interessante desenvolver com TDD, mas não prenda à isso, faça uso dos teste tempestivos (fazer teste sempre a tempo e
rodar sempre quando necessário)
- Refatoração Tempestiva: Assim como os teste tempestivos, é necessário sempre refatorar (alinha-se a regra do escoteiro).
- Regras da Simplicidade: Um código simples é diferente de um código simplório. Simplicidade é o maior nível da sofisticação. Mantenha a solução simples
com toda sua funcionalidade. Para isso é necessário aplicar todos os conceitos acima.

## S.O.L.I.D.

**S**: SRP - Single Responsability Principle: Cada Classe e/ou método deve ter apenas uma razão de existir/mudar.

Consequências de não aplicar:

- Falta de Coesão - A Classe/Método assume responsabilidades que não são suas.
- Alto Acoplamento - Maior nível de dependências, de modo que o sistema se torna ingessado e frágil em relação à alterações.
- Dificuldade em fazer testes automatizados - Difícil mockar
- Baixo reaprovaitamento

**O**: OCP - Open-Closed Principle: Aberto para extensão, mas fechados para modifição. Ao invés de alterar o funcionamento do código fonte original,
quando for ser implementada um nova feature, deve-se apenas extender o código já existente.

**L**: LSP - Liskov Substitution Principle: Uma Classe derivada, deve ser substituível por sua Super Class sem que altere o comportamento do código.

**I**: ISP - Interface Segregation Principle: É melhor criar interfaces mais específicas do que uma única interface genérica.

**D**: DIP - Dependency Inversion Principle: Devemos depender de abstrações, e não de implementações.
