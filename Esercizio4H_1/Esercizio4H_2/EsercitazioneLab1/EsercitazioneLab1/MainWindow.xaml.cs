using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace EsercitazioneLab1
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Converte(object sender, RoutedEventArgs e)
        {
            int decimale=0;
            for(int i=0; i < Binario.Text.Length-1; i++)
            {
                //la stringa in C# può essere gestita anche come array di caratteri
                if (Binario.Text[i] == '1')
                {
                    decimale += (int) Math.Pow(2,i);//ho fatto il casting perchè Math.pow() restituisce un double
                }
                
            }
        }
    }
}
