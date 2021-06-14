package com.Draft;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Draft {
    public static void main(String[] args) throws IOException {
        FileWriter newFile = new FileWriter("qq.exe"); // создаю новый файл с расширением
        newFile.close(); // закрываю файл
        File file  = new File("qq.exe"); // считываю файл для изменения
        String str = file.getPath().replace(".exe", ".tmp"); // вношу в строку измененный параметр расширения
        file.renameTo(new File(str)); // вношу строку в имя файла
        System.out.println(file.getPath());

        FileWriter newFile1 = new FileWriter("qq.work.xml");
        newFile1.close();
        File file1  = new File("qq.work.xml");
        String str1 = file1.getPath().replace(".xml", ".tmp");
        file1.renameTo(new File(str1));
    }
}
