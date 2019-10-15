package gajipegawai;
/**
*Class StafBiasa derived from Employee class
*/
public class StafBiasa extends Pegawai{
   //2 private fields
   private int attendancePerMonth;
   private double payPerAttendance;
  
   //constructor
   public StafBiasa(int attendancePerMonth,double payPerAttendance) {
       super();
       this.attendancePerMonth = attendancePerMonth;
       this.payPerAttendance = payPerAttendance;
   }
   @Override
   public double kalkulasiGaji() {
       //kalkulasi total gaji
       return (getStartingSalary() + (attendancePerMonth * payPerAttendance));
   }
   @Override
   public String toString() {
       return "StafBiasa [attendancePerMonth=" + attendancePerMonth + ", payPerAttendance=" + payPerAttendance
               + "]";
   }
  
  
}
