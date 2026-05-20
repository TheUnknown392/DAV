using System;

namespace Five{
    class PI{
        private PI(){}
        public static float Value = 3.1415f;
    }

    public class Circle{
        float r;

        public Circle(){
            r = 0;
        }

        public Circle(float f){
            r = f;
        }

        public float Area(){
            return PI.Value * r * r;
        }

        public float Perimeter(){
            return 2 * PI.Value * r;
        }
    }

    public class Constructor{
        public static void Main(){
            Circle circle = new Circle(10);

            Console.WriteLine($"Area: {circle.Area()}");
            Console.WriteLine($"Perimeter: {circle.Perimeter()}");
        }
    }
}
