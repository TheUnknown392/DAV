/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iostream;
import java.io.*;
/**
 *
 * @author user
 */
public class FileOutputStreamExample {
    public static void main(String arg[]) throws IOException{
        String input_path="C:\\xampp\\htdocs\\DAV\\JAVA\\LabTwelveInputOutputStream\\src\\iostream\\Subject.txt"; // subject.txt
        String output_path="C:\\xampp\\htdocs\\DAV\\JAVA\\LabTwelveInputOutputStream\\src\\iostream\\SubjectOut.txt"; // copying from subject.txt
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            File inp_file = new File(input_path);
            File out_file = new File(output_path);
            
            input = new FileInputStream(inp_file);
            output = new FileOutputStream(out_file);
            
            int c;
            while((c=input.read())!=-1){ // reading from file
                output.write((char)c); // inserting to new file
            }
            
        }catch(IOException e){
            System.out.println("Error");
        }finally{
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
}
