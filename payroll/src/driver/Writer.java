package driver;

import payroll.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Writer {

    private PrintWriter writer;
    private PrintWriter finalWriter;
    private FileReader read;
    private BufferedReader reader;

    public void writer(Payroll company) throws IOException{
        writer = new PrintWriter(new FileWriter((company.getName() + ".txt"), false));
        Employee curEmployee;
        writer.println(company.getStockWorth());
        for(int i = 0; i <  7; i++) {
            writer.println(company.getPayGradeNums().get(i));
        }
        for(int i = 0; i < company.getListSize(); i++) {
            curEmployee = (Employee) company.getEmployee(i);
            writer.println(curEmployee.getName() + ","
            + curEmployee.getPaygrade() + ","
            + curEmployee.getbaseSalary() + ","
            + curEmployee.getStockShares() + ","
            + curEmployee.getStockOptions());
        }
        writer.close();
    }

    public List<String> getCompanies() throws IOException {
        read = new FileReader("companies.txt");
        reader = new BufferedReader(read);
        List<String> ret = new ArrayList<>(0);
        String line = null;
        while((line = reader.readLine()) != null) {
            ret.add(line);
        }
        read.close();
        reader.close();
        return ret;
    }

    public void writeCompany(String companyName) throws FileNotFoundException, UnsupportedEncodingException {
        finalWriter = new PrintWriter(new FileOutputStream("companies.txt", true));
        finalWriter.println(companyName);
        finalWriter.close();
    }

    public Payroll loadCompany(String companyName) throws IOException {
        read = new FileReader(companyName + ".txt");
        reader = new BufferedReader(read);
        Payroll company = new Payroll();
        List<Float> paygradeNums = new ArrayList<>(0);
        String line;
        company.setName(companyName);
        company.setStockWorth(Float.parseFloat(reader.readLine()));
        for(int i = 0; i < 7; i++)
            paygradeNums.add(Float.parseFloat(reader.readLine()));
        company.setPaygrade(paygradeNums);
        while((line = reader.readLine()) != null) {
            String[] info = line.split(",");
            company.addEmployee(info[0], Integer.parseInt(info[1]), Float.parseFloat(info[2]), Integer.parseInt(info[3]), Boolean.parseBoolean(info[4]));
        }
        reader.close();
        return company;
    }

    Writer() {}

}
