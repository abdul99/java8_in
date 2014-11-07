package in.java8.ocjp.examples;

/*
 * This article contains :
 * What is method overloading
 * 
 * 
 * Pre reading :
 * We recommend to read the previous two articles before going through this article.
 * Polymorphism in java (http://java8.in/polymorphism-in-java/)
 * 
 * What is method overloading :
 * Java compiler can distinguish the methods with same name and different method signature. A class can contain methods with same name but different parameters.
 * Methods with same name but different signature are called overloaded methods.
 * As mentioned in the article, Polymorphism in java, overloaded method invocation will be decided at compile time, so method overloading is example of compile time polymorphism.
 *
 *  Rules for method overloading signatures :
 *  Below are listed valid method overloading rules.
 *  	1 ] Different number of argument.
 *  	2 ] Same number of argument having different types.
 *  	3 ] Different number of argument and types (this will fall in first rule)
 *  
 *  Some invalid method overloading paradigm :
 *  	1 ] Different method return type is not method overloading.
 *  	2 ] You can not declare more than one method with same name and same arguments, compiler will not allow to do this.
 *  	3 ] 
 */
class TestOverloading
{
	public void firstMethod(String a)
	{
		System.out.println("with int");
	}
	public void firstMethod(Object a)
	{
		System.out.println("with Integer");
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		TestOverloading objTest = new TestOverloading();
		objTest.firstMethod("");
	}
}
