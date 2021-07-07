using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace verifica
{
    /// <summary>
    /// Logica di interazione per parte2.xaml
    /// </summary>
    public partial class parte2 : Window
    {
        public parte2()
        {
            InitializeComponent();
        }
        public int punteggio2;
        private void CheckBox_Checked(object sender, RoutedEventArgs e)
        {

        }

        private void CheckBox_Checked_1(object sender, RoutedEventArgs e)
        {
            punteggio2++;
        }

        private void CheckBox_Checked_2(object sender, RoutedEventArgs e)
        {
            punteggio2++;
        }

        private void RadioButton_Checked(object sender, RoutedEventArgs e)
        {
            punteggio2++;
        }

        private void CheckBox_Checked_3(object sender, RoutedEventArgs e)
        {
            if (45_2.isChecked == true)
            {
                if (_90gradi.IsChecked == true)
                {
                    punteggio2 = punteggio2 + 2;
                }

            }
        }

       
    }
}
