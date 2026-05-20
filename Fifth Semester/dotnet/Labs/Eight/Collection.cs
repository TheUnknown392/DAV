using System.Collections.Generic;
namespace Eight{
    public class CustomList<T>{
        public List<T> list {get;}
        public CustomList(T value){
            list = new List<T>();
            list.Add(value);
        }
        
        public CustomList(List<T> l){
            list = new List<T>();
            foreach(T item in l){
                list.Add(item);
            }
        }
        
        public void AddElement(T data){
            list.Add(data);
        }
        
        public T Index(int i){
            return list[i];
        }
        

        public static CustomList<T> operator +(CustomList<T> a, CustomList<T> b){
            List<T> temp = new List<T>(a.list.Concat(b.list));
            return new CustomList<T>(temp);           
        }
    }
    public class Collection{
        public static void Main(){
            CustomList<int> list = new CustomList<int>(10);
            CustomList<int> list2 = new CustomList<int>(20);

//            Console.WriteLine(list.Index(0));

            CustomList<int> another = list + list2;

            foreach(int item in another.list){
                Console.WriteLine(item);
            }
            
            
        }
    }
}
