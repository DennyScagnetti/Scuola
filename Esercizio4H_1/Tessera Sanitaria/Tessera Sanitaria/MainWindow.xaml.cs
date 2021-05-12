using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
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
using Microsoft.Win32;

namespace Tessera_Sanitaria
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

        private void Foto_Click(object sender, RoutedEventArgs e)
        {//inserimento di un'immagine scelta dall'utente per mezzo di una finestra 
         //che accede all' Hard Disk del proprio computer
            OpenFileDialog openFileDialog = new OpenFileDialog();
            if (openFileDialog.ShowDialog() == true)
            {
                Uri pippo = new Uri(openFileDialog.FileName, UriKind.Absolute);
                FotoProfilo.Source = new BitmapImage(pippo);
            }
        }

        private void data_di_nascita_LostFocus(object sender, RoutedEventArgs e)
        {//verifichiamo la validità della data inserita che sia in questo formato GG/MM/AAAA
            Regex validaData = new Regex(@"\d{2}/\d{2}/\d{4}$");
            try
            {
                bool valida = validaData.IsMatch(Data_di_nascita.Text);
                if (valida == false)
                {
                    MessageBox.Show("Il formato data inserito non è valido. Seguire il format GG/MM/AAAA");
                }
            }
            catch (ArgumentException A)
            {
                MessageBox.Show(A.Message);
            }
        }
    private void Codice_fiscale_LostFocus(object sender, RoutedEventArgs e)
        {//verifichiamo la validità del codice fiscale
            Regex validaData = new Regex(@"[a-zA-Z]{6}\d{2}[a-zA-Z]\d{2}[a-zA-Z]\d{3}[a-zA-Z]");
            bool valida;
            try
            {
                valida = validaData.IsMatch(Codice_fiscale.Text);
                if (valida == false)
                {
                    MessageBox.Show("Il codice fiscale non è nel formato corretto");
                }
            }
            catch (ArgumentException A)
            {
                MessageBox.Show(A.Message);
            }
           
        }

        private void Genera_Click(object sender, RoutedEventArgs e)
        {//controlliamo che tutti i campi siano stati completati e ci portiamo tali valori nella seconda finestra
            if (Nome.Text != "" && Cognome.Text != "" && Codice_fiscale.Text != "" && Data_di_nascita.Text != "" && FotoProfilo.Source != null)
            {
                RisFinale ris = new RisFinale();
                ris.lblNome.Content = Nome.Text;
                ris.lblCognome.Content = Cognome.Text;
                ris.lblCF.Content = Codice_fiscale.Text.ToUpper();
                ris.lblDdN.Content = Data_di_nascita.Text;
                ris.ImgFinale.Source = FotoProfilo.Source;
                ris.Show();
                this.Hide();
            }
            else
                MessageBox.Show("Devi compilare tutti i campi per ricevere una tessera sanitaria valida!");
        }
    }
}
