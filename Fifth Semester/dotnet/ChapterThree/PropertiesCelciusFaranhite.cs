namespace ChapterThree{
    class Temperature{
        private float celcius;
        public float Celcius{
            get{
                return celcius;
            }
        }

        public float Fahrenheit{
            set{
                celcius = (value - 32)*5/9;
            }
        }
    }
    class PropertiesCelciusFaranhite{
        static void Main(){
            Temperature temp = new Temperature();

            temp.Fahrenheit = 10.2f;

            Console.WriteLine($"{temp.Celcius}");
        }
    }
}
                
