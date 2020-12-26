clear all;
close all;
%x = [1 2 3 4 5];
%y = randi(10,5,4)

%bar3(x,y);

file = load("./002020/totalsProfit.txt");

stem(file);