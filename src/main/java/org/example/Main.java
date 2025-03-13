package org.example;

public class Main {
    public static void main(String[] args) {
        List403Impl arr = new List403Impl();

        //Добавление элемента на последнее место, метод add
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(8);
        arr.add(3);
        arr.add(9);
        arr.add(0);
        arr.add(10);

        //Добавление элемента на определенную позицию, метод add с позицией
        arr.add(4,3);

        arr.add(5);
        System.out.println("Исходный массив: " + arr);
        //Получаем размер массива, метод size
        System.out.println("Размер массива: " + arr.size());

        //Удаление элемента на определенной позиции, метод remove
        int n = 4;
        arr.remove(n);
        System.out.println("Массив после удаления элемента на " + (int)(n+1) + " позиции: " + arr);

        //Сортировка по убыванию, метод sort
        arr.sort(false);
        System.out.println("Отсортированный по убыванию: " + arr);

        //Сортировка по возрастанию, метод sort
        arr.sort(true);
        System.out.println("Отсортированный по возрастанию: " + arr);

        //Получаем элемента массива i индекса
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Выброс ошибки
        arr.add(14,-1);

    }
}