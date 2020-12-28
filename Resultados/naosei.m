clear all;
close all;

file = load("programing98491.txt");
file2 = load("terminal98491.txt");

eixox = 1:292;

figure(2)
y98491 = log10(file2(:, 3));
x98491 = file(:,3);
plot(eixox, y98491);
hold on;
plot(eixox, x98491);
title 'Profits Ignored - 98491'
legend('Tasks Programing','Soluções', 'Location', 'northwest');
