package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * file util methods
 * @author I333495
 *
 */
public class FileUtil {
	
	/**
	 * get file buffered reader
	 * @param inputpath
	 * @return
	 */
	public static BufferedReader getReader(String inputpath){
		
		try{
			File reader = new File(inputpath);
			InputStreamReader isr = new InputStreamReader(new FileInputStream(reader), "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			return br;
		}catch(Exception e){
			
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * get writer
	 * @param outputpath
	 * @return
	 */
	public static Writer getWriter(String outputpath){
		
		try{
			FileOutputStream fos = new FileOutputStream(outputpath);
			Writer writer = new OutputStreamWriter(fos, "utf-8");
			
			return writer;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
	}
	
}
