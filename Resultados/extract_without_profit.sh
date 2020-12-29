#! /bin/bash
# script bash onde guardamos em 2 ficheiros .txt os tempos de execução, e os profits de cada task

cd ../098495_1/

grep "Programing Tasks =" *.txt | sed -e 's/_1.txt:Programing Tasks =//' -e 's/_/ /' >../Resultados/programing98495.txt
grep "Terminal Cases =" *.txt | sed -e 's/_1.txt:Terminal Cases =//' -e 's/_/ /' >../Resultados/terminal98495.txt


