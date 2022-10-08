package fileExist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExistOrNot {


		static String Path = "data\\Dictionary.txt";

		public static void main(String[] args) throws IOException {

			doesFileExist(Path);
	}
	public static String doesFileExist(String path) throws IOException {

			String line = null;

			try {
				File f = new File(Path);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);

				while ((line = br.readLine()) != null) {

					System.out.println(line);
				}
				br.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("File Not Found");

			}
			return line;
		}
	

	}


