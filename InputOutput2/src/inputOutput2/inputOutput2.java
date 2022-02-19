package inputOutput2;

import java.util.*;

/*
 * Program ini dibuat untuk melakukan format pada output dengan ketentuan :
 * Angka yang diinput akan ditampilkan dengan jumlah maksimal 3 angka, jika angka yang
 * diinput kurang dari 3 angka maka tambahkan 0 didepannya.
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-18
 */

public class inputOutput2 {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Inisialisasi
		String word;
		int number;
		
		//Menerima inputan user dan menampilkan nya
		for(int i=0;i<3;i++) {
			word = input.next();
			number = input.nextInt();
			System.out.println("================================");
			System.out.printf("%-15s%03d\n",word,number); //format output yang dibutuhkan
			System.out.println("================================");
		}
	}

}
