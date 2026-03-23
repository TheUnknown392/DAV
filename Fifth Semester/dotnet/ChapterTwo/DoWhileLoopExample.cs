namespace Chapter2{
    class DoWhileLoopExample{
	static void Main(){
	    int number;
	    do{
		Console.Write("enter a positive numer: ");
		number = Int32.Parse(Console.ReadLine() ?? "");
	    }while(number <= 0);
	    Console.WriteLine("You entered: " + number);
	}
    }
}
