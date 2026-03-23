namespace Chapter2{
    class IfStatement{
	static void Main(){
	    Console.Write("Please Input some number: ");
	    int x = Convert.ToInt32(Console.ReadLine() ?? "");
	    if(x==67){
		Console.WriteLine("Siiiiixx Seeevveeeennnnn");
		return;
	    }
	    if(x>6){
		Console.WriteLine("X is greater than 6");
	    }else if(x <10){ // This will not run
		Console.WriteLine("Something has been written");
            }else{
		Console.WriteLine("X is less than 6");
	    }
	}
    }
}
