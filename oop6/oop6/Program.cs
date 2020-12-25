using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace oop6
{
    class Program
    {
        static void Main(string[] args)
        {
            Bank<int, double, int> property = new Bank<int, double, int>("Serv1", 4, 4, 4, 4, 3);
            Bank<double, double, double> property1 = new Bank<double, double, double>("Serv2", 4.3, 4.3, 4.2, 4.1, 3.2);
            Bank<int, int, int> property2 = new Bank<int, int, int>("Serv3", 4, 4, 4, 4, 3);
            Bank<double, int, double> property3 = new Bank<double, int, double>("Serv4", 4.3, 4.3, 4, 4.3, 3);

            Console.ReadKey();

        }
    }

    class Bank<T, TT, TTT>
    {
        public string Service { get; set; }
        public TTT Staff { get; set; }
        public TTT StaffN { get; set; }
        public TT CaseNum { get; set; }
        public T Complexity { get; set; }
        public T Complexity1 { get; set; }

        public Bank(string serv, TTT staff, TTT staffnum, TT casen, T comp,T comp1)
        {
            Service = serv;
            Staff = staff;
            StaffN = staffnum;
            CaseNum = casen;
            Complexity = comp;
            Complexity1 = comp1;
            GetInf();
        }

        public void GetInf()
        {

            Console.WriteLine("Услуга: " + Service);
            Console.WriteLine("Работник: " + Staff);
            Console.WriteLine("Работник номер: " + StaffN);
            Console.WriteLine("Сложность: " + Complexity);
            Console.WriteLine("Сложность 2: " + Complexity1);
            Console.WriteLine("Номер дела : " + CaseNum);
            Console.WriteLine();
        }

    }
}
