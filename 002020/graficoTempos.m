clear all;
close all;
file = load("temposExecucao.txt");

T = file(:,1);
P = file(:,2);
t = log10(file(:,3));

figure(1)
plot3(T, P, t, '-s');
title 'Todos os Tempos de Execução'
xlabel ('Tarefas')
ylabel ('Programadores')
zlabel ({'Tempo (s)', '_{(log10)}'});
grid on;