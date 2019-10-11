package csv_operations.read_csv_appache_commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import utils.PropertiesManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromCsv {

    public static String getExportFromSplitJoin() throws IOException {
        FileInputStream csvFile = new FileInputStream(PropertiesManager.getPropertyValueByName("csvFilePath","csv_file_path"));
        InputStreamReader input = new InputStreamReader(csvFile);
        CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
        String json = "";
        for (CSVRecord record : csvParser) {
            json = record.get("allocated_json_set");
        }
        return json;
    }

    public static void main(String[] args) throws IOException {
        FileInputStream csvFile = new FileInputStream(PropertiesManager.getPropertyValueByName("csvFilePath","csv_file_path"));
        InputStreamReader input = new InputStreamReader(csvFile);
        CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
        for (CSVRecord record : csvParser) {
//            System.out.println(record.get("Item"));
//            System.out.println(record.get("Quantity"));
//            System.out.println(record.get("Price"));
//            System.out.println(record.get("Description"));
            System.out.println(record.get("allocated_json_set"));
        }
    }
}
