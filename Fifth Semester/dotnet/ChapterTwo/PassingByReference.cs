namespace ChapterTwo{
    class PassingByReference{
	static void Main(){
	    int num = 10;
	    Console.WriteLine($"Before: {num}");

	    MethodByReference(ref num);
	    num = num - 5;
	    Console.WriteLine($"After: {num}");
	}
	static void MethodByReference(ref int value){
	    value = value + 20;
	    Console.WriteLine($"Inside: {value}");
	}
    }
}
