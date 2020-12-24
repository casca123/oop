using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace oop9
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int n = 0, k = 0;
        double x = 0, y = 0;

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            calc();
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
            calc();
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            calc();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            calc();
        }

        void calc()
        {
            double res = 0;
            label9.Text = "";
            n = Convert.ToInt32(textBox1.Text);
            k = Convert.ToInt32(textBox2.Text);
            x = Convert.ToDouble(textBox4.Text);
            y = Convert.ToDouble(textBox3.Text);

                for (int i = 1; i <= n; i++)
                {
                    for (int j = 1; j <= k; j++)
                    {
                        res += (5 * x + 3 * y) / (i * i * j * j);
                    }
                }

            label9.Text = Convert.ToString(Convert.ToInt32(res),8);
            label10.Text = Convert.ToString(res);
            label11.Text = Convert.ToString(Convert.ToInt32(res), 16);
        }

    }
}
