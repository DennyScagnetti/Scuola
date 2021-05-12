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
            bool risp = true;
            string risp_manc = "";
            //controllo le risposte mancanti, se manca la 1, se la 2 ecc... e me lo segno nella stringa risp_manc
            if (e1_1.IsChecked == false && e1_2.IsChecked == false && e1_3.IsChecked == false && c1.IsChecked == false)
            {
                risp = false;
                risp_manc += " 1";
            }

            if (txt2.Text == "rispondi qui" || txt2.Text == "")
            {
                risp = false;
                risp_manc += " 2";
            }
            
            if (e3_1.IsChecked == false && e3_2.IsChecked == false && c2.IsChecked == false)
            {
                risp = false;
                risp_manc += " 3";
            }
            //se tutte le domande sono state risposte, faccio avviare la seconda finestra, conto
            //il totale di punti raggiunto e porto tale punteggio in una label appositamente
            //creata nella seconda finestra
            if (risp== true){ 
            Parte2 P = new Parte2();
            P.Show();
                int tot = 0;
                if (c1.IsChecked == true)
                    tot++;
                if (txt2.Text == "20")
                    tot++;
                if (c2.IsChecked == true)
                    tot++;
                P.conteggio.Text =Convert.ToString(tot);

                this.Hide();
            }
            else
            {//avviso l'utente quali domande ha tralasciato grazie alla stringa risp_manc
                MessageBox.Show("Hai tralasciato le seguenti risposte: " + risp_manc,"Risposte mancanti",MessageBoxButton.OKCancel, MessageBoxImage.Warning, MessageBoxResult.OK);
            }
        }

        private void txt2_GotFocus(object sender, RoutedEventArgs e)
        {//evento che si scatena quando l'utente pone il focus(quando compare la barra lampeggiante sulla textbox)
         //faccio quindi scomparire la parola "rispondi qui" e rendo il contenuto della textbox non più opaca
            ((TextBox)sender).Text = "";
            ((TextBox)sender).Opacity = 1.0;
        }
    }
}
