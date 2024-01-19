// Definiowanie funkcji
f = @(x) (x - 2) / (x**2 + 4);
g = @(x) (2*x**2 -3*x + 1/x);

// Zakres dziedziny
x = linspace(1,5,100);

// Obliczanie wartości funkcji
y_f = feval(x, f);
y_g = feval(x, g);

// Rysowanie wykresu
plot2d(x',y_f', style=-2)
plot2d(x',y_g', style=5)

// Dodawanie tytułu i legendy
xtitle('Wykres funkcji f i g','Oś X', 'Oś Y')
legend(['f(x)=(x-2)/(x^2+4)','g(x)=2*x^2 -3*x + 1/x'])
