package com.tian.javajob;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author JARVIS
 * @version 1.0
 * 2019/8/19 11:05
 */
public class AzkabanTest {
    public void run() throws IOException {
        // 根据需求编写具体代码
        FileOutputStream fos = new FileOutputStream("/opt/module/azkaban/output.txt");
        fos.write("this is a java progress".getBytes());
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        AzkabanTest azkabanTest = new AzkabanTest();
        azkabanTest.run();
    }
}
