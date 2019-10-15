package gajipegawai;

/**
* Kelas Dosen berasal dari kelas Karyawan
*/
public class Dosen extends Pegawai{
   //2 private fields
   private int numberOfCredits;
   private double payPerCredit;
  
   //constructor
   public Dosen(int numberOfCredits,double payPerCredit) {
       super();
       this.numberOfCredits = numberOfCredits;
       this.payPerCredit = payPerCredit;
   }
   @Override
   public double kalkulasiGaji() {
       //kalkulasi total gaji
       return (getStartingSalary() + (numberOfCredits * payPerCredit));
   }
   @Override
   public String toString() {
       return "Dosen [numberOfCredits=" + numberOfCredits + ", payPerCredit=" + payPerCredit + "]";
   }
  
}
