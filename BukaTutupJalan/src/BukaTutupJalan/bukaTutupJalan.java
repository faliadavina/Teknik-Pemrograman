package BukaTutupJalan;

import java.util.*;
import java.util.StringTokenizer;

/*
 * Program ini dibuat untuk menentukan setiap 4 mobil apakah diperintahkan untuk berhenti
 * atau jalan berdasarkan plat nya yang digabung dari 4 mobil tersebut.
 * Masing - masing plat terdiri dari 4 angka
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-19
 * 
 */

public class bukaTutupJalan {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Menerima input user
		String plat = input.nextLine();
		// Menggunakan String token untuk memisahkan dan menyatukan plat
		StringTokenizer token = new StringTokenizer(plat);
		String sum = "";
		int count;
		
		//Menyatukan token yang sudah dipisah kedalam variable sum 
		while (token.hasMoreTokens()){  
			sum = sum + token.nextToken();         
	     }
		//Mengkonvert sum kedalam Long agar dapat diberikan operasi matematik
		Long parseSum = Long.parseLong(sum); 
		Long status = (parseSum - 999999) % 5;
		
		//Pengecekan kondisi
		if(status == 0) {
			System.out.println("jalan");
		}else{
			System.out.println("berhenti");
		}
	}

}
