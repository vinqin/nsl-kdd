package edu.stu.util;

import edu.stu.domain.Cluster;
import edu.stu.domain.DataObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataSource {

    public ArrayList<DataObject> objects = new ArrayList<>();

    public void loadFile(File file) {
        try {
            Scanner input = new Scanner(new FileInputStream(file));
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                if ("".equals(line)) {
                    continue;
                }
                objects.add(new DataObject(line));
            }
            input.close();

            standardize();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void standardize() {
        double[] m = new double[DataObject.COL]; // 各个属性的平均值
        double[] s = new double[DataObject.COL]; // 各个属性的平均偏移
        for (int i = 0;
             i < DataObject.COL;
             i++) {
            double sum = 0;
            for (DataObject object : objects) {
                sum += object.getVector()[i];
            }
            m[i] = sum / objects.size();
        }

        for (int i = 0;
             i < DataObject.COL;
             i++) {
            double sum = 0;
            for (DataObject object : objects) {
                sum += Math.abs(object.getVector()[i] - m[i]);
            }
            s[i] = sum / objects.size();
        }

        for (DataObject object : objects) {
            double[] vector = object.getVector();
            for (int i = 0;
                 i < DataObject.COL;
                 i++) {
                vector[i] = (vector[i] - m[i]) / s[i];
            }
        }

    }

    public void printResult(Cluster[] clusters, int k) {
        System.out.println("聚类个数： " + k);
        Arrays.sort(clusters);
        int i = 1;
        for (Cluster cluster : clusters) {
            System.out.printf("%d: 聚类中共%d个元素，其中%d个元素实际类标为正%n", i++, cluster.getSize(), cluster.getPositiveSize());
        }

    }
}
