namespace ChapterFour{
    delegate int NumberChanger(int n);

    class MultiCastDelegate{
        static int num = 10;

        public static int AddNum(int p){
            num += p;
            return num;
        }

        public static int SubNum(int p){
            num -= p;
            return num;
        }

        public static int MulNum(int p){
            num *= p;
            return num;
        }

        public static int GetNum(){
            return num;
        }

        public static void Main(){
            NumberChanger nc1 = new NumberChanger(AddNum);
            NumberChanger nc2 = new NumberChanger(SubNum);
            NumberChanger nc3 = new NumberChanger(MulNum);

            nc1 += nc2;
            nc1 += nc3;

            int result = nc1.Invoke(2);

            Console.WriteLine($"returned value: {result}");
        }
    }
}
