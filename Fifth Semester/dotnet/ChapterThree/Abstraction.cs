namespace ChapterThree{
    public abstract class ShapeClass{
        public abstract double GetArea();
        public abstract double GetPerimeter();

        public void Display(){
            Console.WriteLine($"Area: {GetArea()}");
            Console.WriteLine($"Perimeter: {GetPerimeter()}");
        }       
    }

    public class CircleClass : ShapeClass{
        public double Radius {get; set;}
        
        public CircleClass(double radius){
            this.Radius = radius;
        }

        public override double GetArea(){
            return Math.PI * Radius * Radius;
        }

        public override double GetPerimeter(){
            return 2*Math.PI*Radius;
        }
    }

    public class RectangleClass : ShapeClass{
        public double Length {get; set;}
        public double Breadth {get; set;}
        
        public RectangleClass(double length, double breadth){
            this.Length = length;
            this.Breadth = breadth;
        }
        
        public override double GetArea(){
            return Length*Breadth;
        }
        
        public override double GetPerimeter(){
            return 2*(Length + Breadth);
        }
    }

    public class Abstraction{
        static void Main(){
            ShapeClass circle = new CircleClass(5);
            circle.Display();
            
            ShapeClass rect = new RectangleClass(1,2);
            rect.Display();
        }
    }
}
