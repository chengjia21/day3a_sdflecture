package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    

    public List<Employee> readCSV(String fileName) throws IOException{
        BufferedReader br = null;

        String line = "";
        List<Employee> employees = new ArrayList<Employee>();

        br = new BufferedReader(new FileReader(fileName));

        line = br.readLine();

        while(line != null) {
            String [] lineData = line.split(CSVWriter.COMMA_DELIMITER);

            if (lineData.length > 0){
                Employee emp = new Employee(lineData[0], lineData[1], lineData[2], lineData[3], lineData[4], lineData[5]);
            }
        }
        
        br.close();

        return employees;




    }









}
