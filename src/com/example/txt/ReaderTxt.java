package com.example.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReaderTxt {
	/**
	 * ���ܣ�Java��ȡTxt�ļ������� 1���Ȼ���ļ���� 2������ļ��������������һ���ֽ���������Ҫ������ֽ������ж�ȡ 3��
	 * 
	 * @param filePath
	 */

	public static void readTxtFile(String filePath) {
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.out.println("�Ҳ����ƶ����ļ�");
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String filePath = "E:\\�½��ļ���\\Javaweb.txt";
		readTxtFile(filePath);
	}

}
