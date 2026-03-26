namespace ChapterThree{

    public class Person{
        public string? name; // nullable
        public string? nationality;
        public int? age;

        
        public void Introduce(){
            Console.WriteLine($"Hello, my name is {name} and I am {age} years old");
        }

        public void Nationality(){
            Console.WriteLine($"My Nationality is {nationality}.");
        }
    }
    
    class ClassExamples{
        static void Main(){
            Person hari = new Person();
            hari.name = "Hari";
            hari.nationality = "Nepali";
            hari.age = 20;
            hari.Introduce();
            hari.Nationality();

            Console.WriteLine();

            Person shyam = new Person();
            shyam.name = "Shyam";
            shyam.nationality = "Indian";
            shyam.age = 21;
            shyam.Introduce();
            shyam.Nationality();
        }
    }
}
