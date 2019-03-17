package edu.stu.domain;

public class Cluster implements Comparable<Cluster> {

    private int size; // 簇的元素个数

    private int positiveSize; // 簇中类标为正的元素个数

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPositiveSize() {
        return positiveSize;
    }

    public void setPositiveSize(int positiveSize) {
        this.positiveSize = positiveSize;
    }

    @Override
    public int compareTo(Cluster that) {
        return that.size - this.size; // 从大到小排序
    }
}
