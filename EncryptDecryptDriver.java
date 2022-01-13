import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.NoSuchPaddingException;

public class EncryptDecryptDriver {

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
		
		boolean cont = true;
		String ans;
		ImgEncrypt imgEn = new ImgEncrypt();
		ImgDecrypt imgD = new ImgDecrypt();
		Scanner keyboard = new Scanner(System.in);
		
		while(cont) 
		{
			System.out.print("Do you wish to encrypt or decrypt (e/d) your image? ");
			String enORde = keyboard.next();
			
			System.out.println();
			
			if(enORde.equals("e"))
			{
				System.out.print("Enter the pathway of the image file you wish to encrypt: ");
				String filename = keyboard.next();
				System.out.println();

				try {
					imgEn.encrypt_img(filename);
	
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(enORde.equals("d"))
			{
				try {
					imgD.decrypt_img();
	
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			else 
			{
				System.out.println("Error: Invalid key. Please try again");
				System.out.println();
				continue;
			}
			
			System.out.println();
			System.out.print("Do you wish to continue encrypting/decrypting images?(yes/no) ");
			ans = keyboard.next();
			
			if(ans.equals("no"))
				cont = false;
			else if(!ans.equals("yes"))
			{
				System.out.println("Error: Invalid key. The program will terminate.");
				cont = false;
			}
			
			System.out.println();
		}
		
		System.out.println("Finished...");
	}

}			
