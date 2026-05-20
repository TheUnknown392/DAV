namespace Six {

    public class Person {
        string name;
        int age;

        public Person(string n, int age) {
            name = n;
            this.age = age;
        }
    }

    public class Employee : Person {
        string company;
        string joined;

        public Employee(string name, int age, string com, string jo): base(name, age) {

            company = com;
            joined = jo;
        }
    }

    public interface Task {
        void listTask();
    }

    public interface PaidLeave {
        void Leaves();
    }
    public class Manager : Employee, Task, PaidLeave {
        string Department;
        int Salary;

        public Manager( string name, int age, string com, string jo, string dept, int salary): base(name, age, com, jo) {
            Department = dept;
            Salary = salary;
        }

        public void listTask() {
            Console.WriteLine("You have no task");
        }

        public void Leaves(){
            Console.WriteLine("You have a lot of leaves left");
        }
    }

    class MultiMultipleInheritance {

        static void Main() {

            Manager man = new Manager( "Nihal", 23, "DAV", "Teacher", "BCA", 100000);

            man.listTask();
            man.Leaves();
        }
    }
}
