package edu.stu;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            initFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initFiles() throws IOException {
        File normalFile = new File("/Users/vinqin/IdeaProjects/trust1/data/KDDTrain+_normal.txt");
        File abnormalFile = new File("/Users/vinqin/IdeaProjects/trust1/data/KDDTrain+_abnormal.txt");

        BufferedWriter nw = new BufferedWriter(new FileWriter(normalFile));
        BufferedWriter aw = new BufferedWriter(new FileWriter(abnormalFile));

        Scanner input = new Scanner(new FileInputStream("/Users/vinqin/IdeaProjects/trust1/data/KDDTrain+.txt"));
        StringBuilder nBuilder = new StringBuilder();
        StringBuilder aBuilder = new StringBuilder();
        int count = 1;

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if ("".equals(line)) {
                continue;
            }
            count++;
            if (line.contains("normal")) {
                nBuilder.append(line).append("\n");
            } else if (line.contains("anomaly")) {
                aBuilder.append(line).append("\n");
            }
            if (count % 100 == 0) {
                nw.write(nBuilder.toString());
                nw.flush();
                nBuilder.setLength(0);

                aw.write(aBuilder.toString());
                aw.flush();
                aBuilder.setLength(0);
            }
        }

        nw.close();
        aw.close();
        input.close();
    }
}
