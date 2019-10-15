package gajipegawai;

import java.util.Scanner;
/*************
Hitung Gaji untuk pegawai di Universitas
*************/
public class GajiPegawai {
  
   public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Masukkan gaji per kredit sks untuk dosen: ");
       double payPerCredit = sc.nextDouble(); // baca nilai dari pengguna
      
       System.out.println("Masukkan gaji per kehadiran untuk staf biasa: ");
       double payPerAttendance = sc.nextDouble(); // baca nilai dari pengguna
      
       sc.close();
      
       //create instance dan hitung gaji
       Pegawai e1 = new Dosen(50,payPerCredit);
       System.out.println("Gaji untuk "+e1+ " is = "+e1.kalkulasiGaji());
       Pegawai e2 = new Dosen(37,payPerCredit);
       System.out.println("Gaji untuk "+ e2 +" is = "+e2.kalkulasiGaji());
       Pegawai e3 = new StafBiasa(28,payPerAttendance);
       System.out.println("Gaji untuk "+e3+ " is = "+e3.kalkulasiGaji());
       Pegawai e4 = new StafBiasa(25,payPerAttendance);
       System.out.println("Gaji untuk "+e4+ " is = "+e4.kalkulasiGaji());
  
      
   }
}

