namespace Chapter2{
    class ThrowStatement{
	static void CheckAge(int age){
	    if(age < 18){
		throw new ArgumentException("Age must be 18 or above");
	    }
	    Console.WriteLine("Access granted");
	}
	static void Main(){
	    try{
		CheckAge(17);
	    }catch (Exception e){
		Console.WriteLine($"Error message: {e.Message}");
	    }
        }
    }
}
