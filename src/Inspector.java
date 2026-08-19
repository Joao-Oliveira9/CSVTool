import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Inspector {

    public void generateResumeCsv(String path){
        String[] headers;

        try(BufferedReader bfr = new BufferedReader(new FileReader(path))){
            String line = bfr.readLine();

            if(line != null){
                headers = line.split(",");
            }

            while(line !=null){

            }

        }catch (IOException ex){

        }

    }

    public void readCsvFile(File file) {

    }
}
