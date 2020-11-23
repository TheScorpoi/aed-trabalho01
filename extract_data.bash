#! /bin/bash

grep "Solution time =" *.txt | cut -b 1-2,4-5,28- >t0
#grep "Solution time =" *.txt | sed -e 's/_0.txt:Solution time =//' -e 's/_/ /' >t1

