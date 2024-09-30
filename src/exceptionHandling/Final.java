package exceptionHandling;

public class Final {
    public static void main(String[] args) {
        /*Final: It is the modifier applicable for classes methods and variables.
         * If a class declare as final we can't extend that class that is we can't create child class for that class that is inheritance is not possible for final classes.
         * If a method is final then we can't override that method in child class.If a variable declare as final as we can't perform reassignment for that variable.
         *
         *
         *
         * Finally block:Finally is a block always associated with try catch to maintain clean up code.
         * try{
         * Risky code}
         * catch(Exception e){
         * Handling code
         * }
         * finally{
         * cleanup code
         * }.
         * The speciality of finally block is it will always be executed irrespective exception is raised weather handle or not handled.
         *
         *
         *
         * Finalize():Finalize is a method always invoked(call) by garbage collector just before destroying an object to perform clean up activities.
         * Once finalize method completes immediately garbage collected destroyed that object.
         * Finally, block is responsible to perform clean up activities related to try block that is what ever resources we opened at the part try block will be closed inside the finally block.
         * whereas finalize method responsible to perform clean up activities related to Object that is what ever resources associated with object will be relocated before destroy an object by using finalize method.
         *
         *
         *
         *
         *
         * Various possible combination of try catch finally:
         * In Try catch finally order is important.
         * when ever we are try compulsory we should write either catch or finally otherwise we will get compile time error.
         * That is without catch or finally is invalid.
         * when ever we are writing catch block compulsory try block must be required that is catch without try is invalid.
         * when ever we are writing finally block compulsory we should write try block that is finally without try is invalid.
         * Inside try catch and finally blocks we can declare try catch and finally blocks that is nesting of try catch finally is allowed.
         * For try catch and finally blocks curley braces are mandatory.
         * */
//        1.try{
//
//        }catch(Exception e){
//
//        }//It is applicable


        ///////////////////////////////////////////////////
       // 2. try {

//        } catch (Exception e) {
//
//
//        } catch (ExceptionInInitializerError e) {
//
//        }//it is applicable


        //////////////////////////////////////////
//       3. try{
//
//        }catch(Exception e){
//
//        }catch(Exception e){
//
//        }//It is not applicable.



        ////////////////////////////////
//       //4. try {
//
//        } catch (Exception e) {
//
//        } finally {
//            System.out.println("hi");
//
//        }//it is applicable.




        //////////////////
//        5.try {
//
//        } finally {
//            System.out.println("hello");
//        }//It is applicable.


        /////////////////////////////////
//        6.try {
//
//        } catch (Exception e) {
//
//        }
//        try {
//
//        } catch (ArithmeticException e) {
//
//        }//It is applicable.
//        try {
//
//        } catch (Exception e) {
//
//        }
//        try {
//
//        } finally {
//            System.out.println("heeeee");
//        }//it is applicable.



        //////////////////////////////////////////////////
//        7.try{
//
//        }//it is not applicable compile time error try without catch or finally.





        ///////////////////////////////////////////////
//        8.catch(Exception e){
//
//        }//it is not applicable compile time error catch without try.
        /////////////////////////////////////////////////////




//        9.finally
//        {
//
//        }//it is not applicable compile time error finally without try.
        /////////////////////////////////////////////////////



//       10. try {
//
//        } finally {
//            System.out.println("neeeeeeeee");
//
//        }catch(Exception e){
//
//        }//compile time error catch with try.
        ////////////////////////////////////////////////////




//     11.   try {
//
//            try {
//
//            } catch (Exception e) {
//
//            }
//        } catch (Exception e) {
//
//        }//It is applicable.
        /////////////////////////////////////////////////



//        12.try {
//            try {
//
//            }
//        } catch (Exception e) {
//
//        }//compile time error try without catch or finally.
        /////////////////////////////////////////



//       13. try {
//            try {
//
//            } finally {
//                System.out.println("llll");
//
//            }
//        } catch (Exception e) {
//
//        }//it is applicable
        ///////////////////////////////////////




//        14.try {
//
//        } catch (Exception e) {
//            try {
//
//            } finally {
//                System.out.println("jjjjjjjjjjj");
//            }
//        }//it is applicable
        ////////////////////////////////////////




//        15.try{
//
//        }catch(Exception e){
//            finally{
//                System.out.println("mmmmmmmmm");
//            }
//        }//compile time error finally without try.
        ///////////////////////////////////////////////






//       16. try {
//
//        } catch (Exception e) {
//
//        } finally {
//            try {
//
//            } catch (Exception e) {
//
//            }
//        }//it is applicable.
        ////////////////////////////////////////////////




//       17. try{
//
//        }catch(Exception e){
//
//        }finally{
//            finally{
//
//            }
//        }//finally without try.
        /////////////////////////////




//       18. try{
//
//        }catch{
//
//        }finally{
//
//        }finally{
//
//        }//compile time error finally without try.
//////////////////////////////////////////////////////////////////////





//       19. try {
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//
//        }//Not applicable.
        ////////////////////////////////////////




//        20.try {
//
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//
//        }//Not applicable.
        /////////////////////////////////////



//       21. try {
//
//        } catch (Exception e) {
//
//        } finally {
//
//        }//Not applicable.

    }
}




















































