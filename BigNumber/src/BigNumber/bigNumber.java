package BigNumber;

import java.util.*;
import java.math.BigInteger;

/*
 * Program ini dibuat untuk menampilkan hasil pertambahan dan perkalian dari dua angka
 * yang diinput oleh user menggunakan Big Integer
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-19
 * 
 */

public class bigNumber {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Variabel ditampung dalam BigInt agar dapat menampilkan nilai yang besar
		BigInteger a = input.nextBigInteger();
		BigInteger b = input.nextBigInteger();
		
		//Pertambahan
		BigInteger total = a.add(b);
		//Perkalian
		BigInteger jumlah = a.multiply(b);
		
		//Print Output
		System.out.println(total);
		System.out.println(jumlah);
	}

}
