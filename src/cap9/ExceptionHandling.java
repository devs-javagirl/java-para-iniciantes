package cap9;

// Java program to demonstrate working of chained exceptions
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            // Creating an exception
            NumberFormatException ex =
                    new NumberFormatException("Deu problema");

            // Setting a cause of the exception
            ex.initCause(new NullPointerException(
                    "This is actual cause of the exception"));

            // Throwing an exception with cause.
            throw ex;
        }

        catch(NumberFormatException ex)
        {
            // displaying the exception
            System.out.println(ex);

            // Getting the actual cause of the exception
            System.out.println(ex.getCause());
        }
    }
}
