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
        /* se usassi lo stesso nome per l'evento che si scatena al check di un radiobutton inserendo l'immagine a seconda del contenuto del radiobutton checkato( per esempio se checko "Venezia" deve comparirmi la foto di Venezia ecc...)
         private void RadioButton_Checked(object sender, RoutedEventArgs e)
        {//(RadioButton)sender.Content--> a seconda del radiobutton che scatena l'evento, mi prendo il contenuto che sarà uguale al nome dato alla foto di riferimento( o Venezia o Napoli...)
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/"+(RadioButton)sender.Content+".jpg", UriKind.Absolute);
            CittàSelezionata.Source = new BitmapImage(immagine);
            città_selezionata = (RadioButton)sender.Content;
        }
         
         */
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

        private void NuovaCittà_Checked(object sender, RoutedEventArgs e)
        {
            città_selezionata = NuovaCittà.Content.ToString();
        }
    }
}
