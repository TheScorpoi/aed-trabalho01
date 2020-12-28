#! /bin/bash

NMec=98491
I=1
d=$(printf "%06d" $NMec)
if [ -d $d ]; then
  d=$(printf "%06d" $NMec)
  rm -vf $(grep -L End $d/*)
fi
for T in {1..40}; do
  for P in {1..8}; do
    if (( $T >= $P )); then
      f=$(printf "%06d_%d/%02d_%02d_%d.txt" $NMec $I $T $P $I)
      if [ ! -e $f ]; then
        echo $f
        ./prog $NMec $T $P $I
      fi
    fi
  done
done
