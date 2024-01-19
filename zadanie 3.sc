// Dane
rok = [2010, 2012, 2024];
przychod = [42332, 23243, 33244];
koszty = [2323, 2332, 3212];
zyski = [3233, 4323, 5986];

// Tworzenie wykresu
figure
bar(rok, [przychod; koszty; zyski]')
xlabel('Rok')
ylabel('Wartość')
title('Wykres słupkowy przychodów, kosztów i zysków')
legend('Przychód', 'Koszty', 'Zyski')
