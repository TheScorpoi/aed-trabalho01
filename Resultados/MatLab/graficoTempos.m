clear all; close all;


file98491 = load("../temposExecucao98491.txt");
file98495 = load("../temposExecucao98495.txt");
file98629 = load("../temposExecucao98629.txt");

x = 1:length(file98491(:,1));

figure(1);
plot(x, log10(file98491(:,3)), '-o');
hold on;
plot(x, log10(file98495(:,3)), '-s');
plot(x, log10(file98629(:,3)), '-^');
hold off
title 'Tempos de Execução'
xlabel 'Tarefas'
ylabel ({'Tempo (s)', '_{(log10)}'});
legend ({'98491', '98495', '98629'},'Location', 'northwest', 'FontSize', 14);