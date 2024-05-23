/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author Yayas
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Employee: " + getNama() + ", Alamat: " + getAlamat() + ", Nomor Telepon: " + getNomorTelepon() + ", Email: " + getEmail() + ", Kantor: " + kantor + ", Gaji: " + gaji + ", Tanggal Dipekerjakan: " + tanggalDipekerjakan;
    }

    public String getKantor() {
        return kantor;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public MyDate getTanggalDipekerjakan() {
        return tanggalDipekerjakan;
    }

    public void setTanggalDipekerjakan(MyDate tanggalDipekerjakan) {
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }
}

