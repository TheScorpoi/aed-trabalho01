clear all;
close all;

file98491 = load("../totalsProfit98491.txt");
file98495 = load("../totalsProfit98495.txt");
file98629 = load("../totalsProfit98629.txt");


figure(1)
profit98491 = file98491(:, 3);
hist(profit98491);
title 'Histograma Profit - 98491'
xlabel 'Profit'
ylabel 'Número de ocorrências'

figure(2)
profit98495 = file98495(:, 3);
hist(profit98495);
title 'Histograma Profit -98495'
xlabel 'Profit'
ylabel 'Número de ocorrências'

figure(3)
profit98629 = file98629(:, 3);
hist(profit98629);
title 'Histograma Profit - 98629'
xlabel 'Profit'
ylabel 'Número de ocorrências'