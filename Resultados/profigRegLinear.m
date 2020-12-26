clear all; close all;

% Codigo MatLab para a implementação de um gráfico
% mostra todos os profits, e faz a regressão linear

file = load("./002020/totalsProfit.txt");

profit = file(:,3); %eixo z

x = 1:length(profit);

pp = polyfit(x,profit,1);
plot(x, profit, 'o');
hold on;
xlabel 'Tarefas'
ylabel 'Profit'
title 'Regressão linear - Profits'

plot(x, polyval(pp, x),'-', "LineWidth", 3);
hold off;