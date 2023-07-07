package hw3;

//Algorithms. Homework 3
//
//@author Tetiana Tatsenko
//@version 7 Jul 2023
//
//Task:
//Написать рекурсивный метод получения чисел Фибоначчи

public class Homework3 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Здесь можно указать желаемое число Фибоначчи
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

