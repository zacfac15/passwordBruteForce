package htlkaindorf.zach.exa_403_bruteforce;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class Cryption
{
  
  public static String enc(String passwd)
  {
    String hexStr = "Is not working";
    try
    {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] hash = md.digest(passwd.getBytes());
      hexStr = DatatypeConverter.printHexBinary(hash);
      System.out.println(hexStr);
    }
    catch (NoSuchAlgorithmException ex)
    {
      System.out.println(""+hexStr);
      System.out.println(ex.toString());
    }
    
    return hexStr;
  }
 
  
  public static void main(String[] args)
  {
     System.out.println(enc("asf"));
  }
}

