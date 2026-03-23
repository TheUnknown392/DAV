namespace Chapter2{
    class ForLoopExample{
	static void Main(){
	    Console.Write("Enter some number: ");
	    long until = Int64.Parse(Console.ReadLine() ?? "");
	    for(int i = 1; i <= until; i++){
		Console.WriteLine($"Iteration: {i}");
	    }
	    // the only thing really important is the condition. We don't need to keep the increment and the initializers in the for loop.
	    /**
	       int number = 10;
	       for(;j <= number;){
	           Console.WriteLine("Hello, World");
		   j++;
	       }
	    **/
	}
    }
}
