package csv_operations.create_csv;

import csv_operations.read_csv_appache_commons_csv.ReadFromCsv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateCsv {

        public static void writeCsv(String filePath,String json){
            List<Input> inputFile = new ArrayList<>();

            Input input = new Input();
            input.setConfigDataStoreName("ds_otc_om_la_app_settings");
            input.setErrorCode("");
            input.setErrorMessage("");
            input.setAllocatedJsonSet(json);
            inputFile.add(input);

            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(filePath);
                fileWriter.append("\"config_datastore_name\",\"error_code\",\"error_message\",\"allocated_json_set\"\n");
                for(Input input1: inputFile){
                    fileWriter.append("\"").append(input1.getConfigDataStoreName()).append("\"");
                    fileWriter.append(",");
                    fileWriter.append("\"").append(input1.getErrorCode()).append("\"");
                    fileWriter.append(",");
                    fileWriter.append("\"").append(input1.getErrorMessage()).append("\"");
                    fileWriter.append(",");
                    fileWriter.append("\"").append(input1.getAllocatedJsonSet()).append("\"");
                    fileWriter.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

//    public static List<String> createCsvFileWithEmployees(){
//            ArrayList<Employee> employeeList = ParseXml.getEmployees().getEmployee();
//            List<String> dataToPutIntoCsv = new LinkedList<>();
//            for (Employee employee : employeeList) {
//                GsonBuilder gsonMapBuilder = new GsonBuilder();
//                Gson gsonObject = gsonMapBuilder.create();
//                Map<String, String> csvFile = new LinkedHashMap<>();
//                csvFile.put("id", employee.getId().toString());
//                csvFile.put("first_name", employee.getFirstName());
//                csvFile.put("last_name", employee.getLastName());
//                csvFile.put("location", employee.getLocation());
//                String jsonObject = gsonObject.toJson(csvFile);
//                dataToPutIntoCsv.add(jsonObject);
//            }
//            return dataToPutIntoCsv;
//        }

    public static void main(String[] args) throws IOException {
//        System.out.println(CreateCsv.createCsvFileWithEmployees());
        String filePath = "C:\\Users\\Dmytro_Kononenko1\\Desktop\\BulkOpt_Create_Orders\\input.csv";
        writeCsv(filePath,ReadFromCsv.getExportFromSplitJoin().replaceAll("\"","\"\""));

    }

}
