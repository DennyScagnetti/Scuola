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

namespace SelezionaImmagine
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        string città_selezionata = "";
        public MainWindow()
        {
            InitializeComponent();
        }

        private void RBVenezia_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/Venezia.jpg", UriKind.Absolute);
            CittàSelezionata.Source = new BitmapImage(immagine);
            città_selezionata = "Venezia";
        }

        private void RBRoma_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/Roma.jpg", UriKind.Absolute);
            CittàSelezionata.Source = new BitmapImage(immagine);
            città_selezionata = "Roma";
        }

        private void RBMilano_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/Milano.jpg", UriKind.Absolute);
            CittàSelezionata.Source = new BitmapImage(immagine);
            città_selezionata = "Milano";
        }

        private void RBNapoli_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/Napoli.jpg", UriKind.Absolute);
            CittàSelezionata.Source = new BitmapImage(immagine);
            città_selezionata = "Napoli";
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
           if(città_selezionata == "")
            {
                MessageBox.Show("Devi prima selezionare una città!!");
            }
            else { 
            SceltaEffettuata W = new SceltaEffettuata();
            W.CittàScelta.Content = città_selezionata;
            W.ImgScelta.Source = CittàSelezionata.Source;
            W.Show();
            this.Close();
            }
        }
    }
}
