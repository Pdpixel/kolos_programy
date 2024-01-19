//a
base = 2/3;
value = 5^7;
log_result = log(value) / log(base);
disp(log_result);

// b
A = [7 -2 3; -2 5 8; 6 -1 0];
A_inv = inv(A);
disp("Macierz odwrotna do podanej macierzy to:");
disp(A_inv);

//c
l = 345;
g = 10;
T = 2*%pi*sqrt(l/g);
disp("Wartość T wynosi:");
disp(T);

//d
sum = 0;
for n = 1:40
    sum = sum + (n^3) / (n+2);
end
disp(sum);
