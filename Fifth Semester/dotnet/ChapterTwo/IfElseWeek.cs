namespace Chapter2{
    class IfElseWeek{
	static void Main(){
	    Console.Write("Please input the number for day of the week: ");
	    int day_num = Int32.Parse(Console.ReadLine() ?? "");
	    
	    if(day_num<=0 || day_num>7){
		Console.WriteLine("Please input the value between 1-7");
		return;
	    }
	    
	    if(day_num == 1){
		Console.WriteLine("Sunday");
	    }else if(day_num == 2){
		Console.WriteLine("Monday");
	    }else if(day_num == 3){
		Console.WriteLine("Tuesday");
	    }else if(day_num == 4){
		Console.WriteLine("Wednesday");
	    }else if(day_num == 5){
		Console.WriteLine("Thursday");
	    }else if(day_num == 6){
		Console.WriteLine("Friday");
	    }else if(day_num == 7){
		Console.WriteLine("Saturday");
	    }else{
		Console.WriteLine("You have reached Unreachable");
	    }
	    
	}
    }
}
