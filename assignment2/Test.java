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