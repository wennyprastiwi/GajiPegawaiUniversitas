package gajipegawai;

/**
* Pegawai :abstract class
*/
public abstract class Pegawai {
   //private field: starting salary
   private double startingSalary;
  
   public Pegawai(){
       this.startingSalary = 1500000; //set nilai gaji
   }
  
   //getter for stating gaji
   public double getStartingSalary() {
       return startingSalary;
   }
   // metode abstrak: untuk diimplementasikan dalam kelas turunan

   public abstract double kalkulasiGaji();
}
