package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    public static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";



    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
    employees = new ArrayList<>();

    Employee emp1 = new Employee("123", "name1", "312", "dew", "engin.com", "31231");
    Employee emp2 = new Employee("53", "fe", "com", "prof", "comp.com", "123456");

    Employee emp3 = new Employee("31", "name2", "sci", "student", "sci.com", "5151");

    return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);

        fileWriter.append(FILE_HEADER.toString());
        fileWriter.append(NEWLINE_SEPARATOR.toString());


        for(Employee emp: employees){
            fileWriter.append(emp.getStaffNo());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(emp.getFullName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(emp.getDepartment());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(emp.getRole());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(emp.getEmailAddress());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(emp.getSalary()));
            fileWriter.append(NEWLINE_SEPARATOR);
        }

        fileWriter.flush();
        fileWriter.close();

    }



}
