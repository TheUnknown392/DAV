namespace Chapter2{
    class JumpStatementBreak{
	static void Main(){
	    for(int i = 1; i <= 10; i++){
		if(i == 5){
		    continue; // skips iteration.
		    // break; // stops the loop.
		}
		Console.WriteLine($"I : {i}");
	    }
	    Console.WriteLine("Out of for-loop");
	    Console.WriteLine("-------------------------------");
	    Console.WriteLine("First Statement");
	    goto label1;

	    Console.WriteLine("Second Statement");
	label1:
	    Console.WriteLine("Third Statement");
	    Console.WriteLine("End of Main method statement");
	}
    }
}
