package exceptionHandling;

public class TryCatchException {
    public static void main(String[] args){
        /*without try catch block*/
//        System.out.println("statement1");
//        //System.out.println(10/0);
//        System.out.println("statement2");
        /*It is abnormally termination and not recommended*/
        /*With TryCatch Block*/
        System.out.println("Statement1");
        try{//risky code
            System.out.println(10/0);
        }
        catch(ArithmeticException e){//Handling code
            System.out.println(10/2);

        }
        System.out.println("statement2");
        /*within the try block the risky code and in catch block it takes handling code.
        * It is normal termination is graceful termination.
        * It is highly recommended to handle exception the code which may raise an exception is called risky code and we have to define that code inside try block and corresponding handling code we have to define inside catch block.
        *
        *
        *
        *
        * ControlFlow In TryCatch Finally:
        * */
        try{
            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");
        }catch(Exception e){
            System.out.println("statement4");
        }
        System.out.println("statement5");
        /*Case1:If there is no exception:1,2,3,5 are normal termination.
        * Case2:If exception at raised at statement 2 and the corresponding catch block matched:1,4,5 normal termination.
        * Case3:if an exception raised at statement 2 but the corresponding catch block not matched 1
followed by abnormal termination
        * Case4:If an exception raised at statement 4 or statement 5 then it is always abnormal termination.
        * Note:Within the try block if anywhere an exception raised then rest of the try block won’t
be executed even though we handled that exception. Hence we have to place/take
only risk code inside try and length of the try block should be as less as possible
        *  In addition to try block there may be a chance of raises a exception inside catch  and finally blocks.
        * If any statement which is not part of try block and raises a an exception then it always abnormal termination.
        *
        *
        *
        * Methods To print exception information:
        * Throwable class defines the following methods to print exception information.
        * Method 1:PrintStackTrace() printable format:Name of the exception:Description stack Trace.
        * Method2: toString() printable format:Name of exception:Description.
        * Method3:getMessage() printable format:Description.
        * */
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        /*Internally default exception handler will use print stacktrace method to print  exception information to the console*/



        /*Try with Multiple Catch Blocks:
        * The way of handling an exception is varied from exception to exception.Hence, for every exception it is highly recommended to take separate catch block that is try with multiple catch block is highly possible and recommended to use.
        * 1.try{
        * Risky code
        * }catch(exception e){
        * }//worst programming practise.
        *
        *
        * 2.try{
        * Risky code
        * }Catch(ArithmeticException e){
        * perform alternative arithmetic operations
        * }catch(SQLException e){
        * use mysql db instead of oracle db}
        * catch(FileNotFoundException e){
        * use local file instead of remote file}
        * catch(Exception e){
        * default exception handling
        * }
        * Best programming practise.
        *
        *
        *
        *If try with multiple catch block presents then the order of catch blocks is very important we have to take child first and then parent otherwise we will get compile time error saying exception xxx has already been got.
        *
        *
        *
        *
        * 3.try{
        * risky code
        * }catch(Exception e){//parent exception
        * }catch(ArithmeticException e){//child exception
        * }//ce:Exception java.lang.AE has already been caught.
        *
        *
        *
        * 4.try{
        * Risky code
        * }catch(Arithmetic Exception e){
        * }catch(Exception e){
        * }//valid
        *
        *
        * 5.try{
         * Risky code
         * }catch(Arithmetic Exception e){
         * }catch(ArithmeticException e){
         * }//CE:Exception java.lang.Arithmetic Exception is already been caught.
         * We can't declare two catch blocks to the same exception otherwise we will get compile time error.
        *
        * */


    }
}
