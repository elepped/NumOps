package gr.codehub.NumOps.service;

import java.io.*;

public class NumHistoryService {


    public void saveToHistory(int num1, int num2) throws IOException {
        PrintWriter pw;
        FileWriter fw =  new FileWriter(new File("history.txt"), true);
        pw = new PrintWriter(fw);
        pw.println(num1+" "+num2);
        pw.close();
    }

    public StringBuilder history(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            sb.append(st).append("<br>");
        }
        return sb;
    }
}
