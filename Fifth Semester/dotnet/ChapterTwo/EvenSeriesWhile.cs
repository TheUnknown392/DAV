namespace Chapter2{
    class EvenSeriesWhile{
	static void Main(){
	    Console.Write("Please input the number: ");
	    int limit = Int32.Parse(Console.ReadLine() ?? "");
	    int current = 2;
	    while(current < limit){
		Console.Write($"{current}, ");
		current += 2;
	    }
	    Console.WriteLine();
	}
    }
}
