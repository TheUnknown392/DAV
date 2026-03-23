namespace Chapter2{
    class SwitchStatement{
	static void Main(){
	    Console.Write("Please input proper language name: ");
	    string input = Console.ReadLine() ?? "";
	    switch(input){
		case "C#":
		case "Java":
		case "C":
		    Console.WriteLine("It is a Programming Language");
		    break;
		default:
		    Console.WriteLine("Invalid Programming Language");
		    break;
	    }
	}
    }
}
