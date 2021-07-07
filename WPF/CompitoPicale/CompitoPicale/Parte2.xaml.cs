using Microsoft.Win32;
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
using System.Windows.Shapes;

namespace CompitoPicale
{
    /// <summary>
    /// Logica di interazione per Parte2.xaml
    /// </summary>
    public partial class Parte2 : Window
    {
        public Parte2()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            if (openFileDialog.ShowDialog() == true)
            {
                Uri pippo = new Uri(openFileDialog.FileName, UriKind.Absolute);
                foto_giocatore.Source = new BitmapImage(pippo);
            }
        }
    }
}
