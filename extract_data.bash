#! /bin/bash

#grep "Solution time =" *.txt | cut -b 1-2,4-5,28- >temposExecucao
grep "Solution time =" 002020/*.txt | sed -e 's/_0.txt:Solution time =//' -e 's/_/ /' >../temposExecucao.txt
grep "Best Profit =" 002020/*.txt | sed -e 's/_0.txt:Best Profit =//' -e 's/_/ /' >../totalsProfit.txt


