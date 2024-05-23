/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author Yayas
 */
public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + getNama() + ", Alamat: " + getAlamat() + ", Nomor Telepon: " + getNomorTelepon() + ", Email: " + getEmail() + ", Kantor: " + getKantor() + ", Gaji: " + getGaji() + ", Tanggal Dipekerjakan: " + getTanggalDipekerjakan() + ", Jam Kerja: " + jamKerja + ", Pangkat: " + pangkat;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
}

