
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class asdasd {
    public static void main(String[] args) {
        // 创建线程对象，采用匿名内部类方式。
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    //System.out.println("aasasdd");
                    Scanner scanner = new Scanner(System.in);
                    //String a =scanner.next();//输入 ab cd ef
                    String b =scanner.nextLine();//输入 ab cd ef
                    //System.out.println(a);//输出 ab
                    System.out.println(b);//输出 ab cd ef
                    if(b.equals("adcdef")){
                        System.out.println("推出！！");
                        return;
                    }


                }

            }
        });

        // 启动线程
        t.start();

        while(true){
            if(!t.isAlive()){
                System.out.println("已识别内部线程结束！！！！！");
                return;
            }

        }
    }
}
