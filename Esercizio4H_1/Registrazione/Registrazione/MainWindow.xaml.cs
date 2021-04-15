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
using System.Text.RegularExpressions;//Libreria per importare la classe Regex

namespace Registrazione
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

        /// <summary>
        /// 
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void Button_Click(object sender, RoutedEventArgs e)
        {
            string elenco_campi = "";
            if (Nome.Text == "") { 
                elenco_campi = elenco_campi + "Nome \n";
            }
            if (Cognome.Text == "")
            {
                elenco_campi = elenco_campi + "Cognome \n";
            }
            if (Email.Text == "")
            {
                elenco_campi = elenco_campi + "Email \n";
            }
            else
            {   //ESPRESSIONE REGOLARE
                //[A-Z] lettera maiuscola; [a-z]; .(carattere jolly); \w(carattere alfanumerico); \W(carattere non alfanumerico); \s(spazio); \d(numero); \D (non numero)
                //^(la stringa parte da qui); $(la stringa finisce qui)
                //+ 1 o più corrispondenze; * 0 o più corrispondenze; {n} n corrispondenze precise; 
                //https://docs.microsoft.com/it-it/dotnet/standard/base-types/regular-expression-language-quick-reference
                string pattern = @"(@)(.+)$";
                try
                {
                    Regex validazioneEmail = new Regex(pattern);
                    bool emailValida = validazioneEmail.IsMatch(Email.Text);
                    if (emailValida == true)
                        MessageBox.Show("Valida!!!");
                }
                catch (ArgumentException A)
                {
                    
                    MessageBox.Show(A.Message);
                }

            }
            if (Password.Password == "")
            {
                elenco_campi = elenco_campi + "Password \n";
            }
            if (Privacy.IsChecked == false)
            {
                elenco_campi = elenco_campi + "Privacy";
            }
            if(elenco_campi == "")
            {
                elenco_campi = "Registrazione effettuata correttamente";
                Utente U = new Utente(Nome.Text, Cognome.Text, Email.Text, Password.Password,(bool)Privacy.IsChecked);
            }
            else
            {
                elenco_campi = "Errore nella registrazione. Mancano i seguenti campi:\n" + elenco_campi;
            }
            MessageBox.Show(elenco_campi);

        }

        private void Sesso_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if(Sesso.SelectedIndex == 2)
            {
                LabelAltroSesso.IsEnabled = true;
                TextAltroSesso.IsEnabled = true;
            }
            else
            {
                LabelAltroSesso.IsEnabled = false;
                TextAltroSesso.IsEnabled = false;
            }
            
        }

        private void TextAltroSesso_LostFocus(object sender, RoutedEventArgs e)
        {
            if (Sesso.Items.Count == 4)
            {
                Sesso.Items.RemoveAt(3);
            }
            Sesso.Items.Add(TextAltroSesso.Text);
            Sesso.Text = TextAltroSesso.Text;
            Sesso.SelectedIndex = Sesso.Items.Count - 1;
            if(Sesso.Items.Count == 4 && Sesso.Items.IndexOf("") == 3)
            {
                Sesso.Items.RemoveAt(3);
            }
        }

    private Boolean controllaEmail(string email)
        {
            Boolean b = true;
            if (!email.Contains("@") || email.IndexOf('@')==0 || email.LastIndexOf('.') <= (email.IndexOf('@') + 2) || email.LastIndexOf('.')>=email.Length-2)
                b = false;
            return b;
        }

        private void Email_LostFocus(object sender, RoutedEventArgs e)
        {
            if (!controllaEmail(Email.Text))
            {
                MessageBox.Show("Email non corretta");
            }
        }

        
    }
}
