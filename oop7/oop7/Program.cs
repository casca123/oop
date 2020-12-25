using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace oop7
{
    class Program
    {
        static void Main(string[] args)
        {
            string mv = "";

            List<Stationety> Stationety = new List<Stationety>();
            Stationety.Add(new Stationety("pencil", "wood", "drawing", 6));
            Stationety.Add(new Stationety("pencil premium", "red wood", "drawing", 1));
            Stationety.Add(new Stationety("pen", "plastic", "writing", 9));
            Stationety.Add(new Stationety("pen premium", "gold", "writing", 1));

            do
            {
                Console.WriteLine("\n\nChoose move \na: show all\nb: addition\nc: search\nd: del all\nq: exit\n\n");
                mv = Console.ReadLine();
                switch (mv)
                {
                    case "a": { showall(); break; }
                    case "b": { add(); break; }
                    case "c": { find(); break; }
                    case "d": { del(); break; }
                    default: { Console.WriteLine("Try again"); break; }
                }
            } while (mv != "q") ;


            void showall()
            {
                foreach (var item in Stationety)
                {
                    Console.WriteLine("\nName:"+item.Name);
                    Console.WriteLine("Material: "+item.Material);
                    Console.WriteLine("Area: "+item.ApplicationArea);
                    Console.WriteLine("Number: "+item.Number);
                }
            }

            void add()
            {
                Console.WriteLine("\nInput name: ");
                string n = Console.ReadLine();
                Console.WriteLine("Input material: ");
                string m = Console.ReadLine();
                Console.WriteLine("Input area: ");
                string a = Console.ReadLine();
                Console.WriteLine("Input number: ");
                int num =Convert.ToInt32(Console.ReadLine());
                Stationety.Add(new Stationety(n, m,a ,num ));
            }

            void find()
            {
                Console.WriteLine("\nInput name: ");
                string n = Console.ReadLine();
                Console.WriteLine("Answer" +
                       Stationety.Find(x => x.Name.Contains(n)));
            }
            void del()
            {
                Stationety.Clear();
                Console.WriteLine("All list clear");
            }

            Console.ReadKey();
        }

        

    }

    class Stationety
    {
        public string Name { get; set; }
        public string Material { get; set; }
        public string ApplicationArea { get; set; }
        public int Number { get; set; }
    
        public Stationety()
        {
            Console.WriteLine("Input name: ");
            Name = Console.ReadLine();
            Console.WriteLine("Input material: ");
            Material = Console.ReadLine();
            Console.WriteLine("Input application area: ");
            ApplicationArea = Console.ReadLine();
            Console.WriteLine("Input number: ");
            Number = Convert.ToInt32(Console.ReadLine());
        }

        public Stationety(string name, string material, string applicationarea, int number)
        {
            Name = name;
            Material = material;
            ApplicationArea = applicationarea;
            Number = number;
        }
    }
}
