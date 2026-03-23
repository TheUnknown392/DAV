namespace Chapter2{
    class ForLoopPractice{
	static void Main(){
	    for(int i = 1; i<=5; i++){
		Console.WriteLine($"Outer loop: {i}");
		Console.WriteLine("----------------------------------");

		for(int j = 1; j<=5; j++){
		    Console.WriteLine($"Inner loop: {j}");
		    Console.WriteLine("----------------------------------");
		} 
	    }
	}
    }
}
