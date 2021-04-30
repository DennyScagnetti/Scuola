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

namespace CompitoAprile
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

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (/*txt2.Text == "rispondi qui"*/false)
            {
                MessageBox.Show("Hai tralasciato la domanda 2!!");


            }
            else { 
            Parte2 P = new Parte2();
            P.Show();
            this.Close();
            }
        }

        private void txt2_GotFocus(object sender, RoutedEventArgs e)
        {
            ((TextBox)sender).Text = "";
            ((TextBox)sender).Opacity = 1.0;
        }
    }
}
