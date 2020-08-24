program1:
==========
Case:1
public class Program1{
public static final boolean  COMPILED_IN_JAVA_6 = false;

	public static void main(String[] args) {
		if (COMPILED_IN_JAVA_6) {
			// Java 6 will be complied here
			a.b.c = c.b.a;
		} else {
			// Java 8 will be complied here

		}

	}
}
Case2: (javascript)

if(0){
a.b.c=c.b.a;
}
else{
}

Note: the above case 2 can be acheive in javascript but cannot achevied in java compiler treat "." notation as package 




