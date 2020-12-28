clear all;
close all;

file98491 = load("../programing98491.txt");
file98491_2 = load("../terminal98491.txt");

file98495 = load("../programing98495.txt");
file98495_2 = load("../terminal98495.txt");

file98629 = load("../programing98629.txt");
file98629_2 = load("../terminal98629.txt");

eixox = 1:292;

figure(1)
y98491 = log10(file98491_2(:, 3));
x98491 = file98491(:,3);
plot(eixox, y98491);
hold on;
plot(eixox, x98491);
title 'Profits Ignored - 98491'
legend('Tasks Programing','Solutions', 'Location', 'northwest');

figure(2)
y98495 = log10(file98495_2(:, 3));
x98495 = file98495(:,3);
plot(eixox, y98495);
hold on;
plot(eixox, x98495);
title 'Profits Ignored - 98495'
legend('Tasks Programing','Solutions', 'Location', 'northwest');

figure(3)
y98629 = log10(file98629_2(:, 3));
x98629 = file98629(:,3);
plot(eixox, y98629);
hold on;
plot(eixox, x98629);
title 'Profits Ignored - 98629'
legend('Tasks Programing','Solutions', 'Location', 'northwest');



