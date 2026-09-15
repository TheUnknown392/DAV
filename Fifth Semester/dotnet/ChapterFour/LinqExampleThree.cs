namespace ChapterFour{
    public class LinqStudent{
        public int age;
        public string name;
        public string address;
        public LinqStudent(string name, int age, string address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public class LinqEmployee{
        public int exp;
        public string work;
        public string name;
        public LinqEmployee(string name, string work, int exp){
            this.name = name;
            this.work = work;
            this.exp = exp;
        }
    }
    public class linqExampleThree{
        public static void Main(){
            List <string> str1 = new List<string> {"One", "Two", "Three", "Four"};
            List <string> str2 = new List<string> {"One", "Two", "Five", "Six"};

            var innerJoin = str1.Join(str2, s1=>s1, s2=>s2, (s1,s2) => s1); // intersection
            Console.WriteLine("\n\nJoin operator used: ");
            foreach(string item in innerJoin){
                Console.WriteLine(item);
            }

            var concatResult = str1.Concat(str2);
            Console.WriteLine("\n\nConcat operator used: ");
            foreach(string item in concatResult){
                Console.WriteLine(item);
            }

            var unionResult = str1.Union(str2);
            Console.WriteLine("\n\nUnion operator used");
            foreach(string item in unionResult){
                Console.WriteLine(item);
            }

            List<int> marks = new List<int>(){10, 30, 50, 20, 5};
            int maxValue = marks.Max();            
            int minValue = marks.Min();
            int sumValue = marks.Sum();
            int countValue = marks.Count();
            double avgValue = marks.Average();
            
            Console.WriteLine($"\n\nmaxValue: {maxValue}");
            Console.WriteLine($"minValue: {minValue}");
            Console.WriteLine($"sumValue: {sumValue}");
            Console.WriteLine($"countValue: {countValue}");
            Console.WriteLine($"avgValue: {avgValue}");

            List<LinqStudent> Students = new List<LinqStudent>(){};
            Students.Add(new LinqStudent("Nihal", 26,"patan"));
            Students.Add(new LinqStudent("roshan", 23,"ktm"));
            Students.Add(new LinqStudent("rimal", 16,"pkr"));
            Students.Add(new LinqStudent("rimpapa", 52,"biratnagar"));
            Students.Add(new LinqStudent("rimmama", 55,"biratnagar"));
            
            foreach(LinqStudent item in Students){
               Console.WriteLine(item.name);
               Console.WriteLine(item.age);
               Console.WriteLine(item.address);
            }
            
            var student = Students.Where(s => s.age > 28 && s.address == "patan")
                .OrderBy(s =>s.age)
                .Select(s => s.name);

            foreach(string n in student){
                Console.WriteLine(n);
            }

            List<LinqEmployee> employees = new List<LinqEmployee>(){};
            employees.Add(new LinqEmployee("rahul","Engineering",13));
            employees.Add(new LinqEmployee("ranjay","Barista",3));
            employees.Add(new LinqEmployee("dagda","Computer",5));
            employees.Add(new LinqEmployee("thumbelina","Dancer",7));

            var enp = employees.Where((s) => s.work == "Engineering" && s.exp > 5).Select(s => s.name);

            foreach(string n in enp){
                Console.WriteLine(n);
            }
        }
    }
}
