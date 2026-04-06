namespace ChapterThree{
    class ModifierExample{

        public class Modifier{
            public string name;
            private int age;

            public void SetName(string name){
                this.name = name;
            }
            
            public void SetAge(int age){
                this.age = age;
            }
            
            public int GetAge(){
                return this.age;
            }
        }


        public static void Main(){
            Modifier mod = new Modifier();
            mod.SetName("Nihal Shrestha");

            // mod.age = 10; // this does not work
            mod.SetAge(10);

            Console.WriteLine($"Name: {mod.name}");
            Console.WriteLine($"Age: {mod.GetAge()}");
        }
    }
}
