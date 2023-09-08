package com.goldilocks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Reader_Writer {
	
	public static void main(String[] args) {
		
		String inputFile = "input.csv";
        String outputFile = "output.csv";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            double sum = 0.0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                
                for(String num : values ) {
                	sum += Double.parseDouble(num);
                }

                    writer.write(line + "," + sum);
                    writer.newLine();
                
            }

            reader.close();
            writer.close();

            System.out.println("Output completed successfully " + outputFile);
         }catch (IOException ex) {
            System.out.println(ex.getMessage());
         }
	}
}


