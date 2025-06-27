package com.example;

import net.sf.jasperreports.engine.*;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        try {
            // Compile the .jrxml file
            JasperReport jasperReport = JasperCompileManager.compileReport(
                    App.class.getResourceAsStream("/reports/omerJasperTest.jrxml")
            );

            // Fill the report with empty data (no datasource)
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), new JREmptyDataSource());

            // Export to PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "omerReportPDF.pdf");

            System.out.println("Report generated:Omer ziauddin done sample_report.pdf");
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
