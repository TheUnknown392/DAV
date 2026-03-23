namespace Chapter2{
    class WhileLoopExample{
	static void Main(){
	    string input = "";
	    Console.Write("Enter text 'exit' to stop: ");
	    while(input != "exit"){
		input = Console.ReadLine() ?? "";
		Console.Write($"You have entered {input}: ");
	    } 
	    Console.WriteLine("Program ended");
	}
    }
}
