import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Inspector {

    public static void generateResumeCsv(String path){
        String[] headers = null;
        int lineCounter;

        try(BufferedReader bfr = new BufferedReader(new FileReader(path))){
            String line = bfr.readLine();

            if(line != null){
                headers = line.split("[,|;\\t]");
            }

            while(line !=null){
                line = bfr.readLine();
            }

            resumeCsv(headers);
        }catch (IOException ex){
            System.out.println(ex);
        }

    }


    public static void resumeCsv(String[] headers){

        try(FileWriter fw = new FileWriter("resume.txt")){
            fw.write("headers: \n");
            for(String header: headers){
                fw.write(header + "\n");
            }

        }catch(IOException ex){
            System.out.println(ex);
        }

    }
    public void readCsvFile(File file) {

    }
}
