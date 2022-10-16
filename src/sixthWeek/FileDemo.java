package sixthWeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("test.txt");
        try (
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);) {

            file.createNewFile();

            bw.write("Hello World");

            System.out.println("文件读取开始");
            System.out.println(br.readLine());
            System.out.println("文件读取结束");

            System.out.println("fileReader读取开始");
            System.out.println(fr.read());
            System.out.println("fileReader读取结束");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
