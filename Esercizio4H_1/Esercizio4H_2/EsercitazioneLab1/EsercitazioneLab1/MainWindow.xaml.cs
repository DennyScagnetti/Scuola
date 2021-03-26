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
        /*utilizzo questi booleani  per segnarmi l'ultimo focus, e quindi l'ultima posizione del cursore
        sfruttiamo questa situazione per sovrascrivere la casella dove il cursore non è stato per ultimo.
        Quindi se per ultimo è stato nella casella Binario, allora andremo a calcolare il decimale corrispettivo e viceversa.
         */
        bool focusBin = false, focusDec = false;
        public MainWindow()
        {

            InitializeComponent();

        }

        private void Converte(object sender, RoutedEventArgs e)
        {
            //da binario a decimale 
            
            
            if(Binario.Text == "" && Decimale.Text == "")
            {
                MessageBox.Show("Devi inserire un valore in una delle due caselle di testo!");
            }
            
            else if ((Binario.Text != "" && Decimale.Text == "") || focusBin)
            {
                int decimale = 0;
                
                for (int i = Binario.Text.Length-1; i >=0 ; i--)
                {
                    //la stringa in C# può essere gestita anche come array di caratteri
                    if (Binario.Text[i] == '1')
                    {
                        decimale = decimale + (int) Math.Pow(2, i);//ho fatto il casting perchè Math.pow() restituisce un double
                    }

                }
                Decimale.Text = decimale.ToString();
                Decimale.Focus();
                
            }
            
            //Fine da binario a decimale
            
            //da decimale a binario
            else if ((Binario.Text == "" && Decimale.Text != "") || focusDec) {
               
                Binario.Text = "";
            for (int i = Convert.ToInt32(Decimale.Text); i >= 1; i = i / 2)
            {
                Binario.Text += (i % 2).ToString();
            }
            String s = Binario.Text;
            Binario.Text = "";
            for (int i = s.Length - 1; i >= 0; i--)
            {
                Binario.Text = Binario.Text + s[i];
            }
                //fine da decimale a binario
                Binario.Focus();
            }
        }

        private void Binario_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            Binario.Text = "";
        }

        private void Decimale_GotFocus(object sender, RoutedEventArgs e)
        {
            focusDec = true;
            focusBin = false;
        }

        private void Binario_GotFocus(object sender, RoutedEventArgs e)
        {
            focusBin = true;
            focusDec = false;
        }

        private void Decimale_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            Decimale.Text = "";
        }


    }
}
