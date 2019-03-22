package htlkaindorf.zach.exa_403_bruteforce;

public class Password
{

  private String password;

  public Password(String password)
  {
    this.password = password;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public boolean check(String test)
  {
     if(password.equals(test))
     {
       return true;
     }
     else
     {
       return false;
     }
  }

}
