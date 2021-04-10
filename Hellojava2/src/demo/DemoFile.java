package Demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args){
        try {
            //write file
            FileInputStream fos = new FileInputStream("data.txt");
            DataInputStream dos = new DataInputStream(fos);
//            dos.writeBytes("xin chao, day la noi dung vua ghi lai");
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            System.out.println();
        }catch (FileNotFoundException f) {
            System.out.println("FILE NOT FOUND");
        }catch (IOException io){
            System.out.println("FILE ERROR");
        }
    }
}
