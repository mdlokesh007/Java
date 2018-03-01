package justJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class deltaFiles {
        public deltaFiles(){
            System.out.println("Test.Test()");
        }

        public static void main(String[] args) throws Exception {
            usingBufferedReader();
            usingScanner();
        }

		private static void usingScanner() throws FileNotFoundException, IOException {
			System.out.println("::::::::::::::::::::::: usingScanner :::::::::::::::::::::::::::::::");
			Scanner br1 = null;
			Scanner br2 = null;
            String sCurrentLine;
            List<String> list1 = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            br1 =  new Scanner(new File("C:\\\\Users\\\\AB73058\\Documents\\workspace-sts-3.8.3.RELEASE\\justJava\\src\\justJava\\test1.txt"));
            br2 =  new Scanner(new File("C:\\Users\\AB73058\\Documents\\workspace-sts-3.8.3.RELEASE\\justJava\\src\\justJava\\test2.txt"));
            while (br1.hasNext()){
            	list1.add(br1.nextLine());}
            while (br2.hasNext()){
            	list2.add(br2.nextLine());}
            List<String> tmpList = new ArrayList<String>(list1);
            tmpList.removeAll(list2);
            System.out.println("content from test1.txt which is not there in test2.txt");
            for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from test1.txt which is not there in test2.txt
            }
            System.out.println("content from test2.txt which is not there in test1.txt");
            tmpList = list2;
            tmpList.removeAll(list1);
            for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from test2.txt which is not there in test1.txt
            }			
		}

		private static void usingBufferedReader() throws FileNotFoundException, IOException {
			System.out.println("::::::::::::::::::::::: usingBufferedReader :::::::::::::::::::::::::::::::");
			BufferedReader br1 = null;
            BufferedReader br2 = null;
            String sCurrentLine;
            List<String> list1 = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            br1 = new BufferedReader(new FileReader("C:\\\\Users\\\\AB73058\\Documents\\workspace-sts-3.8.3.RELEASE\\justJava\\src\\justJava\\test1.txt"));
            br2 = new BufferedReader(new FileReader("C:\\Users\\AB73058\\Documents\\workspace-sts-3.8.3.RELEASE\\justJava\\src\\justJava\\test2.txt"));
            while ((sCurrentLine = br1.readLine()) != null) {
                list1.add(sCurrentLine);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                list2.add(sCurrentLine);
            }
            List<String> tmpList = new ArrayList<String>(list1);
            tmpList.removeAll(list2);
            System.out.println("content from test1.txt which is not there in test2.txt");
            for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from test1.txt which is not there in test2.txt
            }
            System.out.println("content from test2.txt which is not there in test1.txt");
            tmpList = list2;
            tmpList.removeAll(list1);
            for(int i=0;i<tmpList.size();i++){
                System.out.println(tmpList.get(i)); //content from test2.txt which is not there in test1.txt
            }
		}
    }