package Berhitung;

import java.util.*;

/*
 * Program ini dibuat untuk mengeksekusi angka dan operator yang diinput oleh komputer.
 * Terdapat 5 buah operator yang dapat diinput oleh user yaitu :
 * Penjumlahan, direpresentasikan dengan '+'.
 * Pengurangan, direpresentasikan dengan '-'.
 * Perkalian, direpresentasikan dengan '*'.
 * Pembagian, direpresentasikan dengan '/'.
 * Sisa hasil bagi, direpresentasikan dengan '%'
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-18
 * 
 */

public class berhitung {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int jumlah;
		int angkaA = input.nextInt(); 
		char operator = input.next().charAt(0);
		int angkaB = input.nextInt();
		
		if(angkaA >= 1 && angkaB <=1000) {
			if(operator == '+') {
				jumlah = angkaA+angkaB;
				//System.out.println(jumlah);
			}else if(operator == '-') {
				jumlah = angkaA-angkaB;
				//System.out.println(jumlah);
			}else if(operator == '*'){
				jumlah = angkaA*angkaB;
				//System.out.println(jumlah);
			}else if(operator == '/') {
				jumlah = angkaA/angkaB;
				//System.out.println(jumlah);
			}else{
				jumlah = angkaA%angkaB;
				//System.out.println(jumlah);
			}
			System.out.println(jumlah);
		}

	}

}
