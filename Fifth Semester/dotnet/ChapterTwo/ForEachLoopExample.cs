namespace Chapter2{
    class ForEachLoopExample{
	static void Main(){
	    
	    // string[] cars = {"BMW","Volvo", "Ford", "Toyota", "Tata"};
	    // for(int i = 0; i < cars.Length; i++){ 
	    // 	Console.WriteLine(cars[i]);
	    // }
	    
	    // string[] cars = {"BMW","Volvo", "Ford", "Toyota", "Tata"};
	    // foreach (string car in cars){
	    // 	Console.WriteLine(car);
	    // }

	    int[] IntArray = { 1, 2, 3, 4, 5, 6, 7 };

	    Console.WriteLine("Print Array elements using foreach loop:");
	    // The foreach loop will run till the last element in the array.
	    foreach(int i in IntArray){
		Console.WriteLine(i);
	    } 
	}
    }
}
