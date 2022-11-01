/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_gefy;

/**
 *
 * @author Gefy Fitry Wijaya
 */
public class Jawaban2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    var nilai = 80;
    var absen = 30;
        
    var LulusNilai = nilai >=75;
    var LulusAbsen = nilai >=75;
        
    var Lulus = LulusNilai && LulusAbsen ;
    
        if (nilai >= 75 && absen <= 75) {  //menghapus :
      System.out.println ("Selamat Anda Lulus");
      } else {
      System.out.println ("Silahkan Coba Lagi Tahun Depan");
        }
        if (nilai >= 80 && absen >= 80) {
      System.out.println (" Nilai Anda A"); 
      } else if (nilai >= 70 && absen >= 70){
      System.out.println ("Nilai Anda B"); 
      } else if (nilai >=60 && absen >= 60){
      System.out.println ("Nilai Anda C");
      } else if (nilai >= 50 && absen >= 50){
      System.out.println ("Nilai Anda D");
      } else {
      System.out.println ("Nilai Anda A"); //merubah Nilai Anda E menjadi A
      }
        }
        }
    

