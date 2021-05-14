using System;
using System.Collections.Generic;
using System.IO;
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
using System.Windows.Shapes;

namespace LettScritt
{
    /// <summary>
    /// Logica di interazione per DaComprare.xaml
    /// </summary>
    public partial class DaComprare : Window
    {
        public DaComprare()
        {
            InitializeComponent();
        }

        private void lista_Loaded(object sender, RoutedEventArgs e)
        {
            String riga;
            try
            {
                //Pass the file path and file name to the StreamReader constructor
                StreamReader sr = new StreamReader("D:/Scuola/Esercizio4H_1/LettScritt/LettScritt/Spesa.txt");
                //Read the first line of text
                riga = sr.ReadLine();
                //Continue to read until you reach end of file
                while (riga != null)
                {
                    //write the lie to console window
                    lista.Inlines.Add(riga);
                    lista.Text += "\n";
                    //Read the next line
                    riga = sr.ReadLine();
                }
                //close the file
                sr.Close();
              
            }
            catch (Exception excep)
            {
                Console.WriteLine("Exception: " + excep.Message);
            }
        }
    }
}
