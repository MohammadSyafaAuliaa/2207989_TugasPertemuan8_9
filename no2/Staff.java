/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author Yayas
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Staff: " + getNama() + ", Alamat: " + getAlamat() + ", Nomor Telepon: " + getNomorTelepon() + ", Email: " + getEmail() + ", Kantor: " + getKantor() + ", Gaji: " + getGaji() + ", Tanggal Dipekerjakan: " + getTanggalDipekerjakan() + ", Gelar: " + gelar;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}

