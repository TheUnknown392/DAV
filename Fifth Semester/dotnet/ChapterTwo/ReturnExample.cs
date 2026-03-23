namespace Chapter2{
    class ReturnExample{
	
	static float Add(int a, int b){
	    return a + b;
	}
	
	static float Subtract(float a, float b){
	    return a - b;
	}
	
	static void Main(){
	    float x, y;
	    x = 9.8f;
	    y = 11.2f;

	    int xi = 10, yi = 10;
	    
	    float addResult = Add(xi,yi);
	    float subResult = Subtract(x,y);
	    
	    Console.WriteLine($"Sum is {addResult}");
	    Console.WriteLine($"Subtraction is {subResult}");
	    Console.ReadKey();
	}
    }
}
