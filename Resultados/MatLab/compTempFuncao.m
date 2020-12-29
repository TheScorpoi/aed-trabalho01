clear all; close all;

% Inicialemente escolhemos um valores de T e de P arbitrário
% e dpeois todos os testes foram feitos para esses valores anteriormente escolhidos

temposFora = [1.207e01 1.188e01 1.186e01 1.153e01 1.182e01 1.111e01 1.110e01 1.176e01 1.191e01 1.195e01];
temposDentro = [1.238e01 1.232e01 1.218e01 1.210e01 1.240e01 1.247e01 1.255e01 1.251e01 1.235e01 1.234e01];

x = length(temposFora)

figure(1)
plot(1:x, temposFora, '-r');
hold on;
plot( 1:x, temposDentro, '-b');
hold off;
title 'Comparação - Inicialização das variáveis dentro e fora da função'
xlabel 'Nº Testes'
ylabel 'Tempo de Execução (s)'
legend('Fora', 'Dentro')
