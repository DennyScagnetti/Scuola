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

namespace quiz_aprile
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
        public int punteggio;
        private void RadioButton_Checked(object sender, RoutedEventArgs e)
        {
            
        }

        private void secondaopzione_Checked(object sender, RoutedEventArgs e)
        {
           
            punteggio++;
        }

        private void terzaopzione_Checked(object sender, RoutedEventArgs e)
        {
            
        }

        private void quartaopzione_Checked(object sender, RoutedEventArgs e)
        {
            
        }

        private void txtrisposta2_TextChanged(object sender, TextChangedEventArgs e)
        {
            if(txtrisposta2 = "20")
            {
                txtrisultatomesso = txtrisposta2;
                punteggio++;
            }
            else txtrisultatomesso = txtrisposta2;


        }

        private void CheckBox_Checked(object sender, RoutedEventArgs e)
        {
            scelta = "1";
        }

        private void CheckBox_Checked_1(object sender, RoutedEventArgs e)
        {
            scelta = "2";
        }

        private void CheckBox_Checked_2(object sender, RoutedEventArgs e)
        {
            scelta = "3";
            punteggio++;
        }
    }
}
