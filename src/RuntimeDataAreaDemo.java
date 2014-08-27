/*
 * This article contains :
 * 
 * Overview of Runtime data areas
 * Details of runtime data areas
 * Exception conditions with runtime data areas
 * Monitor JVM runtime data areas
 * 
 * Runtime data areas :
 * 
 * Java virtual machine defines various runtime data areas, 
 * Mainly these are part of Stack and Heap.
 * 
 * Basic rule of storing java program in memory is Objects and Instance variables are stored in heap memory area and local variables live in stack.
 * 
 * Further exploring these, list of runtime data areas in java virtual machine are,
 * 1. Program counter register ( PC Register )
 * 2. Java virtual machine stacks ( JVM Stack )
 * 3. Heap
 * 4. Method area
 * 5. Run-time constant pool
 * 6. Native method stack
 * 
 * in which some are created on java virtual machine startup and some are per thread which are created on when a thread is created and destroy when thread completes.
 * 
 * Details of runtime data areas :
 * 
 * Program counter register :
 * We know that JVM can support many thread of execution at once. Each JVM thread has its own PC Register.
 * At any point of time while executing the code of single method (referred as current method), if it is not a native method, pc register address of JVM instruction currently being executed.
 * For native method, value of pc register is undefined.
 * 
 * Java virtual machine stacks :
 * Each JVM thread has a private JVM stack, created at the time of thread creation.
 * JVM stack holds data as a Frame, when a new method will be invoked a frame will be pushed into the jvm stack and popped when method execution completes.
 * No other data, except frame, can be push/popped into JVM stack.
 * 
 *  Frames :
 *  	Frames are used to store partial results, return value from method, perform dynamic linking and dispatch exceptions.
 *  	Lifetime of a frame is equal to method execution time, A frame will be pushed to JVM stack when a method will be invoked and distroyed when method execution completes.
 *  	At a point of time, Only one frame at a given time can be in active state per thread, which is frame for function being executed.
 *  	Each frame has its own,
 *  		Array of local variables : 
 *  			All local variables of method are stored in this array, Single local variable can hold any value of type byte, char, short, int, float, reference, return address and boolean
 *  			while pair of local variable can hold long and double.
 *  			local variables are also used to pass parameters when method is invoked. Where local variable 0 is always used to pass reference of object on which instance method is invoked. (this)
 *  			Any other parameters will be stored from 1. 
 *  		Operand stack :
 *  			Operand stack holds the operand used by operators to perform operations. Each entry on the operand stack can hold a value of any Java Virtual Machine type.
 *  			Java Virtual Machine instructions take operands from the operand stack, operate on them, and push the result back onto the operand stack. The operand stack is also used to prepare parameters to be passed to methods and to receive method results.
 *  			For example, iadd instruction will add two integer values, so it will pop top two integer values from operand stack and will push result into operand stack after adding them.
 *  		
 *  		Reference to runtime constant pool (Dynamic linking)
 *  			In class file structure, flow of method that will be invoked and variable to be accessed is stored as symbolic reference.
 *  			Dynamic linking translates this symbolic reference to concrete method reference and loads the class as required
 *  			This reference to runtime constant pool is stored in frame to perform dynamic linking at runtime.
 *   
 * Heap :
 * Heap is a runtime data area in memory where Objects, Instance variable and Arrays are stored.
 * Heap memory storage may be of fixed size or may be expanded as required by computation, and this memory does not need to be contiguous.
 * Heap is created at virtual machine startup and Objects which are no more referenced will be deallocated from memory by automatic garbage collector, objects are never explicitly deallocated.  
 *
 * Method area :
 * Method area is created on virtual machine startup, shared among all java virtual machine threads and it is logically part of heap area.
 * It stores per-class structures such as the run-time constant pool, field and method data, and the code for methods and constructors.
 * This can be of fixed size or can be expanded as per requirement of computation.
 * 
 * Run-time constant pool :
 * Runtime constant pool is per class/interface structure, It is runtime representation of constant_pool table generated at compile time which is stored in class file.
 * Constant pool contains several literal values or symbolic references that will be resolved at runtime.
 * Runtime constant pool for class/interface is allocated from method area and constructed when class or interface is created by JVM. 
 * 
 * Image
 * 
 * Exceptional condition in JVM runtime data areas :
 * There are two exceptions associated with JVM runtime data areas. OutOfMemoryError and StackOverFlowError.
 * 
 * OutOfMemoryError is applicable for all of the above listed except PC register. 
 * OutOfMemoryError will be thrown if memory expansion of any of the memory area will be attempted but enough memory is not available to allocate.
 *  
 * StackOverFlowError is applicable for Native Method Stack and Java Virtual Machine Stack. 
 * StackOverFlowError will be thrown If the computation in a thread requires a larger stack than is permitted.
 * 
 * 
 * Monitor JVM Runtime data areas :
 * You can check JVM runtime memory allocation using JConsole (Java monitoring and management console)
 * How to run JConsole in windows/Linux/Unix : 
 * http://docs.oracle.com/javase/1.5.0/docs/guide/management/jconsole.html#starting
 * How to run JConsole in MAC : 
 * https://developer.apple.com/library/mac/documentation/Darwin/Reference/Manpages/man1/jconsole.1.html
 * 
 * Sample window :
 * Image
 */
public class RuntimeDataAreaDemo 
{
	
}