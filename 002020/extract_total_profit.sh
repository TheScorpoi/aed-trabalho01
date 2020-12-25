#!/bin/bash

grep "Best Profit =" *.txt | sed -e 's/_0.txt:Best Profit =//' -e 's/_/ /' >totalsProfit.txt