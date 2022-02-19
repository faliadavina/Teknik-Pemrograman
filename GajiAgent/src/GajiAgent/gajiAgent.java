package GajiAgent;

import java.util.*;

/*
 * Program ini dibuat untuk menghitung gaji pokok dari agent dengan ketentuan :
 * Jika agent menjual item minimal 40 maka akan mendapatkan bonus 25% dari total penjualan item
 * Jika agent menjual item minimal 80 maka akan mendapatkan bonus 35% dari total penjualan item
 * Jika agent menjual item dibawah 15 maka akan mendapatkan pemotongan gaji Pokok 15% dari total minus item
 * Selain itu agent akan menerima bonus 10% dari total penjualan item
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-18
 * 
 */

public class gajiAgent {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Inisialisasi
		int gajiPokok = 500000;
		int totalGaji;
		int perItem = 50000;
		int item = input.nextInt();
		
		//Pemeriksaan jumlah item
		if(item >= 40 && item <= 80) {
			totalGaji = (item*perItem)*25/100 + gajiPokok;
			System.out.println(totalGaji);
		}
		if(item >= 80) {
			totalGaji = (item*perItem)*35/100 + gajiPokok;
			System.out.println(totalGaji);
		}
		if(item < 15) {
			item = 15-item;
			totalGaji = gajiPokok - (item*perItem)*15/100;
			System.out.println(totalGaji);
		}
		if(item >= 15 && item <=40){
			totalGaji = (item*perItem)*10/100 + gajiPokok;
			System.out.println(totalGaji);
		}

	}

}
