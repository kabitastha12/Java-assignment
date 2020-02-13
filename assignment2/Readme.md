# Java Custom Exception

If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.

Let's see a simple example of java custom exception.

```
public class MyException extends Exception 
{
    public MyException(String s)
    {
        super(s);  
    }
}
```
Now lets test the exception,

```
class Test
{
    static void ReserveName(String name) throws MyException
    {
        if(name == "kabita")
        {
            throw new MyException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("kabita");
        } 
        catch (MyException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}

Output:
```
You cannot reserve this name. MyException: NameIsReserved
```