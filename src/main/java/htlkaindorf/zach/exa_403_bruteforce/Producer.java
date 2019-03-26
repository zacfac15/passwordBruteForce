package htlkaindorf.zach.exa_403_bruteforce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Producer implements Runnable
{

  private Password passwd;
  private String file = System.getProperty("user.dir")
          + File.separator + "src"
          + File.separator + "res"
          + File.separator + "10-million-password-list-top-1000000.txt";

  public Producer(Password passwd)
  {
    this.passwd = passwd;
  }

  @Override
  public void run()
  {
    passwd.getPassword();
  }

  public String Load() throws FileNotFoundException, IOException
  {
    String passwd = "";
    
    BufferedReader br = new BufferedReader(new FileReader("test.txt"));
    
    while((br.readLine()) != null)
    {
      passwd = br.readLine();
    }
    
    br.close();

    return passwd;
  }
}
