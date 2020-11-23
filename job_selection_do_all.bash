#! /bin/bash

NMec=2020
I=0
d=$(printf "%06d" $NMec)
if [ -d $d ]; then
  d=$(printf "%06d" $NMec)
  rm -vf $(grep -L End $d/*)
fi
for T in {1..5}; do
  for P in {1..2}; do
    if (( $T >= $P )); then
      f=$(printf "%06d/%02d_%02d_%d.txt" $NMec $T $P $I)
      if [ ! -e $f ]; then
        echo $f
        ./job_selection $NMec $T $P $I
      fi
    fi
  done
done
