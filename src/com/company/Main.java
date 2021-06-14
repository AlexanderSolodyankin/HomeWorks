package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);// создал сканер для системного ввода имени файла и его расширения
        System.out.println("Введите имя файла"); // укозания что делать для пользователя
        String setNameFile = sc.nextLine(); // вносим в строку значения ввода из системы
        FileWriter newFile = new FileWriter(setNameFile); // Создаем файл и вносим ему значение имени из строки
        File file = new File(setNameFile); // открыл клас для того чтобы переименовать файл
        newFile.close(); // закрыл файл


        System.out.println("Был создайн файл: " + file.getName());
        String filePath = file.getName(); // передаю имя файла в строкове значение для его переопределения
        int indexPoint = filePath.indexOf("."); // поиск индекса до точки чтобы виписать имя файла
        String fileName = filePath.substring(0, indexPoint); // выписываю имя файла без его расширения
        int indexEnd = filePath.length();// передаю в целочисленное зночение длину строки для того чтобы выписать расширение файла
        String fileExtantion = filePath.substring(indexPoint, indexEnd); // выписываю расширение файла в отдельную строку
        String oldExtanin = fileExtantion;
        System.out.println("Имя файла: " + fileName); // проверка результата
        System.out.println("Расширение файла: " + fileExtantion); // проверка результата
        System.out.println("Поменяйте расширение файла");
        fileExtantion = sc.nextLine(); // вношу изменения в расширение файла
        if (fileExtantion.contains(".")) { // если вдруг при вводе забудут добавить точку то точка добовляется сама
            System.out.println("Расширение с точкой");
        } else {
            System.out.println("Добовляю точку так как вы забыли!!!");
            fileExtantion = "." + fileExtantion;
        }
//        filePath = file.getPath().replace(oldExtanin, fileExtantion);
        filePath = fileName + fileExtantion; // обьеденяю значения имени и расширения
        System.out.println("Вывод изменения имени с расширением в файл: " + filePath);
        file.renameTo(new File(filePath)); // переименовываю файл
        System.out.println("Расширение файла изменено на: " + file.getPath());
        // получил интересный результат того что файл меняет имя только после закрытия программы


        // так что могу сказать я подглядел данную домашку так как не знал как меня имя в самом файле
        // домашку качнул из интернета и переписал ее по свойму чтобы понять как она работает
        // ниже домашка взятая из интернета так как тему я понял и фичу из домашки из интернета я тоже более менее понял
        // она ищет по слову(обьекту - значению) в строке и меняет его если есть точное совпадение
        // переписал ее сюда так как было лень писать расширенную версию


        FileWriter newFile1 = new FileWriter("qq.work.xml");// создаю новый файл с расширением
        newFile1.close();// закрываю файл
        File file1  = new File("qq.work.xml");// считываю файл для изменения
        String str1 = file1.getPath().replace(".xml", ".tmp");// вношу в строку измененный параметр расширения
        // изменения идут только при точном соответсвии строчного зночения!!!!!!!!
        file1.renameTo(new File(str1));// вношу строку в имя файла




    }

}

