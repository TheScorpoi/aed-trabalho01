#! /bin/bash
# script bash onde guardamos em 2 ficheiros .txt os tempos de execução, e os profits de cada task

cd ../098491/

grep "Solution time =" *.txt | sed -e 's/_0.txt:Solution time =//' -e 's/_/ /' >../Resultados/temposExecucao98491.txt
grep "Best Profit =" *.txt | sed -e 's/_0.txt:Best Profit =//' -e 's/_/ /' >../Resultados/totalsProfit98491.txt


