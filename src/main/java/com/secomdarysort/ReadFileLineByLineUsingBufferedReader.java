package com.secomdarysort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

  public static void main(String[] args) {
    BufferedReader reader;
    double max = Double.MIN_VALUE;
    try {
      reader =
          new BufferedReader(
              new FileReader("D:\\ddm exercises solution\\sheet1_files\\weather_shuf.csv"));
      String line = reader.readLine();
      while (line != null) {
        String[] values = line.split(";");

        double x = Double.parseDouble(values[values.length - 1]);
        max = Math.max(max, x);
        // read next line
        line = reader.readLine();
      }
      reader.close();
      System.out.println(max);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
