clear all;
close all;

file = load("temposExecucao.txt")

%file2 = load("temposExecucao.txt");
%file3 = load("temposExecucao.txt");

T = file(:,1);
P = file(:,2);
t = log10(file(:,3));

% T2 = file2(:,1);
% P2 = file2(:,2);
% t2 = log10(file2(:,3));
% 
% T3 = file3(:,1);
% P3 = file3(:,2);
% t3 = log10(file3(:,3));

figure(1)
plot3(T, P, t, '-s');

% plot3(T2, P2, t2, '-or');
% plot3(T3, P3, t3, '-tg');

title 'Todos os Tempos de Execução'
xlabel ('Tarefas')
ylabel ('Programadores')
zlabel ({'Tempo (s)', '_{(log10)}'});
grid on;