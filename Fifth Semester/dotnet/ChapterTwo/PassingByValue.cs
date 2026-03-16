namespace ChapterTwo{
    class PassingByValue{
	static void Main(){
	    int num = 10;
	    Console.WriteLine($"Before: {num}");

	    MethodByValue(num);
	    num = num - 5;
	    Console.WriteLine($"After: {num}");
	}
	static void MethodByValue(int value){
	    value = value + 20;
	    Console.WriteLine($"Inside: {value}");
	}
    }
}

