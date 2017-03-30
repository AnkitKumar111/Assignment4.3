class C{
public void test(){
System.out.println("C");
}
}
  
class B extends C{
public void test(){
System.out.println("B");
}
}
  
class A extends B{
	
public void test(){
System.out.println("A");
}
public static void main(String[] args) {
	    //A m = new A();
	   // m.test();
	   //test();
  }
}

/*correct option is f:

explanation:

this is not possible because you can only refer to you're immediate superclass
if you want to go further up in the hierarchy then you need to go to Class B and 
change the code..
*/
	