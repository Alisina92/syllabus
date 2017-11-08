public class TestClass
{
  public static void main(String[] args)
  {
    sayHello();
  }
  
  public void sayHello() {
    System.out.println("Hello!");
  }
  
}

public class TestClass
{
  public static void main(String[] args)
  {
    System.out.println(getPhrase());
  }
  
  public String getPhrase() {
    String phrase = "Hello!";
    
    return phrase;
  }
  
}

public class TestClass
{
  public static void main(String[] args)
  {
    String phrase = "Hello!";
    sayPhrase(phrase);
  }
  
  public void sayPhrase(String phrase) {
    System.out.println(phrase);
  }
  
}
```
