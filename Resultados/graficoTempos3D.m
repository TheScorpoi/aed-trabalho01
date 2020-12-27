clear all; close all;

% Gráfico com os tempos de execução

file98491 = load("temposExecucao98491.txt");
file98495 = load("temposExecucao98495.txt");
file98629 = load("temposExecucao98629.txt");

T98491 = file98491(:,1);
P98491 = file98491(:,2);
t98491 = log10(file98491(:,3));

T98495 = file98495(:,1);
P98495 = file98495(:,2);
t98495 = log10(file98495(:,3));

T98629 = file98629(:,1);
P98629 = file98629(:,2);
t98629 = log10(file98629(:,3));

figure(1)
plot3(T98491, P98491, t98491, '-s');
hold on;
plot3(T98495, P98495, t98495, '-o');
plot3(T98629, P98629, t98629, '-^');
hold off;

title 'Todos os Tempos de Execução'
xlabel ('Tarefas')
ylabel ('Programadores')
zlabel ({'Tempo (s)', '_{(log10)}'});
legend ({'98491', '98495', '98629'},'Location', 'northwest', 'FontSize', 14);
grid on;