/*can any class execute without main?
yes , till jdk 6.0
but jdk 7.0 onwards no class can execute without main

*/
class WithoutMain
{
 
 static 
 {
   System.out.println("from static block");
   
  // System.exit(0); 	//for exit and will not search main function
   
 }
 
 
 
 
}
