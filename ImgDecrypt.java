import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImgDecrypt {

	public static void decrypt_img() throws FileNotFoundException, IOException
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Note : Encryption Key act as Password to Decrypt the same Image, otherwise it will corrupt the Image.");
         
        System.out.print("Enter a key for Decryption : ");
        int key = sc.nextInt();
 
        FileInputStream fis = new FileInputStream("D:\\encryptdecrypt\\encrypt.jpg");
         
        byte data[] = new byte[fis.available()];

        fis.read(data);
        
        int i = 0;
        for (byte b : data) {
            data[i] = (byte)(b ^ key);
            i++;
        }
           
        FileOutputStream fos = new FileOutputStream("D:\\encryptdecrypt\\decrypt.jpg");
        fos.write(data);
        
        fos.close();
        fis.close();
        
        System.out.println("Decryption Done...");
	}
	
}
