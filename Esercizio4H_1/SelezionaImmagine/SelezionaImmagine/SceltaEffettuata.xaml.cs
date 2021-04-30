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

namespace SelezionaImmagine
{
    /// <summary>
    /// Logica di interazione per SceltaEffettuata.xaml
    /// </summary>
    public partial class SceltaEffettuata : Window
    {
        public SceltaEffettuata()
        {
            InitializeComponent();
        }

        private void Indietro_Click(object sender, RoutedEventArgs e)
        {
            
            MainWindow M = new MainWindow();
            if((NuovaCittà.Text != "Inserisci qui il nome" || NuovaCittà.Text != "") && (SourceCittà.Text != "Inserisci qui il path" || SourceCittà.Text != ""))
            {
                M.NuovaCittà.Content = NuovaCittà.Text;
                M.NuovaCittà.IsEnabled = true;
                M.NuovaCittà.IsChecked = true;
                M.NuovaCittà.Visibility = Visibility.Visible;
                Uri immagine = new Uri(SourceCittà.Text, UriKind.Absolute);
                M.CittàSelezionata.Source = new BitmapImage(immagine);
            }


            M.Show();
            this.Close();
        }

        private void NuovaCittà_GotFocus(object sender, RoutedEventArgs e)
        {
            ((TextBox)sender).Text = "";
            ((TextBox)sender).Opacity = 1.0;
        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (((ComboBox)sender).SelectedIndex == 0) { 
                NuovaCittà.IsEnabled = true;
                NuovaCittà.Visibility = Visibility.Visible;
                lblPathCittà.IsEnabled = true;
                lblPathCittà.Visibility = Visibility.Visible;
                SourceCittà.IsEnabled = true;
                SourceCittà.Visibility = Visibility.Visible;


            }
            else { 
                NuovaCittà.IsEnabled = false;
                NuovaCittà.Visibility = Visibility.Hidden;
                lblPathCittà.IsEnabled = false;
                lblPathCittà.Visibility = Visibility.Hidden;
                SourceCittà.IsEnabled = false;
                SourceCittà.Visibility = Visibility.Hidden;
            }
        }
    }
}
