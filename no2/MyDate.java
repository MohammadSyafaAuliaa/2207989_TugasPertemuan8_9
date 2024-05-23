/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author Yayas
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        this.year = cal.get(java.util.Calendar.YEAR);
        this.month = cal.get(java.util.Calendar.MONTH) + 1;
        this.day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
