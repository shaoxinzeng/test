package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) {
        File inputF = new File("D://input.txt");
        File outputF = new File("D://output.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
		try {
			fis = new FileInputStream(inputF);
			fos = new FileOutputStream(outputF,true);
			isr = new InputStreamReader(fis);
	        int ch = -1;
	        while ((ch = isr.read()) != -1) {
	            fos.write(ch);
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if(null != isr){
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != fos){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != fis){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
  }
}
