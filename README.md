# AED_Trabalho01
Trabalho Prático 01 - AED

## Job Selection
Dado um número de tarefas, e um número de programadores, o programa implementado em C, de forma genérica, através de um algoritmo recursivo feito por nós, retorna a melhor maneira de realização do trabalho, ou seja, a maneira em que se consegue obter mais lucro, sem que ocorra sobreposição de programadores. 

### Pré-requesitos 
Para compilar os programas, é vital ter um Compilador de C instalado na máquina (p.e. gcc).
O projeto foi desenvolvido com recurso ao IDE VSCode, para implementação do código c, e ao Matlab, para a realização de gráficos usados no relatório. 

### Compilar
Para compilar o programa, é necessário executar o comando na pasta onde o ficheiro **job_selection.c** se encontra da seguinte maneira:
**Os argumentos passados no segundo comando são meramente ilustrativos.**

```
cc -Wall -O2 job_selection.c -o prog -lm
./prog 2020 30 6 1
```
Com o objetivo de conseguir obter os resultados mais rapidamente, usamos o script **job_selection_do_all.bash**, onde conseguimos correr o programa
n vezes em n terminais diferentes, sendo o n máximo o número de cores do processador.
```
chmod u+x job_selection_do_all.bash
./job_selection_do_all.bash
```

### Relatório
Este projeto está acompanhado por um [Relatório](/Relatório), onde é explicado todo o processo de construção do problema, e onde são tiradas as conclusões do mesmo.

## Autores

 - **[Pedro Sobral](https://github.com/TheScorpoi) - 98491**
 - **[André Freixo](https://github.com/andre180701) - 98495**
 - **[Marta Fradique](https://github.com/MartaFradique) - 98629**
