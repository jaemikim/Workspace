package kr.co.himedia.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileInputStream fis = new FileInputStream("output3.txt");   
			FileOutputStream fos = new FileOutputStream("output4.txt")){
			
			byte[] readBytes = new byte[50];
			int data = 0;
			
			while((data = fis.read(readBytes)) != -1) {
				fos.write(readBytes);
				for(int k = 0; k < data; k++)
					System.out.print((char)readBytes[k]);
				System.out.println(" : " + data + "바이트 읽음");
			}
			fos.flush();
			System.out.println("복사본 파일이 생성되었습니다.");
		}
	}
}
