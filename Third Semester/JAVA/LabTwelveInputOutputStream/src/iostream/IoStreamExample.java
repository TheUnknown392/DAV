package iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author user
 */
public class IoStreamExample {
    public static void main(String args[]) throws IOException{
        String file_path ="C:\\xampp\\htdocs\\DAV\\JAVA\\LabTwelveInputOutputStream\\src\\iostream\\Subject.txt";
//        String path = "C:/xampp/htdocs/DAV/JAVA/LabTwelveInputOutputStream/src/iostream/Subject.txt";
            File subject = null;
            FileInputStream fi = null;
        try{
            subject = new File(file_path);
            int c;
            fi = new FileInputStream(subject);
            while((c = fi.read()) != -1){
//                if(c=='i'){
//                    System.out.print('e');
//                }else if(c=='e'){
//                    System.out.print('i');
//                }else{
//                    System.out.print((char)c);
//                }
                    System.out.print((char)c);
            }
        }catch(IOException e){
            System.out.println("Error");
        }finally{
            if(fi != null){
                fi.close();
            }
        }
    }
}
