package iostream;
import java.io.*;
/**
 *
 * @author user
 */
public class FileIOStreamFileReaderExample {
    public static void main(String arg[]) throws IOException{ //character stream
        String in_path = "C:\\xampp\\htdocs\\DAV\\JAVA\\LabTwelveInputOutputStream\\src\\iostream\\Subject.txt";
        String out_path = "C:\\xampp\\htdocs\\DAV\\JAVA\\LabTwelveInputOutputStream\\src\\iostream\\SubjectOut.txt";
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader(in_path);
            out = new FileWriter(out_path);
            int c;
            while((c = in.read())!= -1){
                out.write((char)c);
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
            
        }
    }
}

// jdbc swing fileHandling Important topics