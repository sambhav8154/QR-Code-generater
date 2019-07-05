import java.io.FileOutputStream;
import java.util.Scanner;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeTest
{
 public static void main(String[] args)
 {
  try
  {
      //y pr
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter string you want to convert in QR= ");
      String name = sc.nextLine();
      String myString = name;
  
      QRCode qrc = QRCode.from(myString);
      
      qrc = qrc.to(ImageType.JPG);

  
      System.out.print("Enter Drive name in Upper case= ");
      String drive = sc.nextLine();
      System.out.print("Enter File name = ");
      String fname = sc.nextLine();
      String filePath = drive+":\\"+fname+".jpeg";
    
  
      FileOutputStream fos = new FileOutputStream(filePath);
  
 
      qrc.writeTo(fos);
 
  
      fos.close();
  
    System.out.println("File has been created in"+drive+": drive as "+fname+".JPEG");
  
  }
  catch (Exception e)
  {
   
   e.printStackTrace();
  }
  
 } 
 
}