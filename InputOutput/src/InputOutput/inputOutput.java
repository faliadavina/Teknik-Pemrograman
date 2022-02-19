package InputOutput;

import java.util.*;
import java.util.StringTokenizer; //library untuk membuat token

/*
 * Program ini akan memecah sebuah kalimat string yang diinputkan oleh user, lalu 
 * menghitung token nya
 * 
 *  @author Falia Davina Gustaman
 *  @since 2022-02-18
 * 
 */

public class inputOutput {

	public static void main(String[] args) {
		//Inisialisasi
		String inputWord;
		//Scanner
		Scanner input = new Scanner(System.in);
		//Inputan User
		inputWord = input.nextLine();
		//Untuk memanggil library didalam "()" diisi string dan jika ada token specifier nya
		StringTokenizer token = new StringTokenizer(inputWord, " !,?._'@");
		//Menampilkan output jumlah token menggunakan countTokens()
		System.out.println(token.countTokens());
		//Menampilkan String yang sudah di token kan
		while (token.hasMoreTokens())  //Dilakukan selama token masih ada 
	     {  
			//Print element selanjutnya     
	         System.out.println(token.nextElement());    
	     }
	}

}
