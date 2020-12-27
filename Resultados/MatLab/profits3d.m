clear all;close all;

% Profit - 98491
file98491 = load("../totalsProfit98491.txt");

figure(1)
subplot(2,1,1);
stem(file98491);
title 'Profit - 98491'
xlabel 'Tarefas'
ylabel 'Profit'
hold on;

X = file98491(:, 1);
Y = file98491(:, 2);
Z = file98491(:, 3);

subplot(2,1,2);
stem3(X, Y, Z);
title 'Profit - 98491 3D'
xlabel 'Tarefas'
ylabel 'Programador'
zlabel 'Profit'
hold off;

% Profit - 98495
file98495 = load("../totalsProfit98495.txt");

figure(2)
subplot(2,1,1);
stem(file98495);
title 'Profit - 98495'
xlabel 'Tarefas'
ylabel 'Profit'

hold on;
X = file98495(:, 1);
Y = file98495(:, 2);
Z = file98495(:, 3);

subplot(2,1,2);
stem3(X, Y, Z);
title 'Profit - 98495 3D'
xlabel 'Tarefas'
ylabel 'Programador'
zlabel 'Profit'
hold off;


% Profit - 98629
file98629 = load("../totalsProfit98629.txt");
figure(3)

subplot(2,1,1);
stem(file98629);
title 'Profit - 98629'
xlabel 'Tarefas'
ylabel 'Profit'
hold on;

X = file98629(:, 1);
Y = file98629(:, 2);
Z = file98629(:, 3);

subplot(2,1,2);
stem3(X, Y, Z);
title 'Profit - 98629 3D'
xlabel 'Tarefas'
ylabel 'Programador'
zlabel 'Profit'
hold off;