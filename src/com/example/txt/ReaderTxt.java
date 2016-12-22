package com.example.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReaderTxt {
	/**
	 * 功能：Java读取Txt文件的内容 1、先获得文件句柄 2、获得文件句柄当作是输入一个字节码流，需要对这个字节流进行读取 3、
	 * 
	 * @param filePath
	 */

	public static void readTxtFile(String filePath) {
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到制定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错！");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String filePath = "E:\\新建文件夹\\Javaweb.txt";
		readTxtFile(filePath);
	}

}
