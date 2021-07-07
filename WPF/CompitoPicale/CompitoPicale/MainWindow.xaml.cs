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

namespace CompitoPicale
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
        string nome_squadra="";
        string nome_giocatore = "";
        string cognome_giocatore = "";
        string ruolo_giocatore = "";
        string ruolo_specifico = "";
        private void at_Checked(object sender, RoutedEventArgs e)
        {
            lblR.Visibility = Visibility.Visible;
            cb.Visibility = Visibility.Visible;
            ruolo_giocatore = "attaccante";
            cb.Items.Clear();
            cb.Items.Add("PP");
            cb.Items.Add("SP");
            cb.Items.Add("ALA");
           
        }

        private void ce_Checked(object sender, RoutedEventArgs e)
        {
            lblR.Visibility = Visibility.Hidden;
            cb.Visibility = Visibility.Hidden;
            ruolo_giocatore = "centrocampista";
            
        }

        private void di_Checked(object sender, RoutedEventArgs e)
        {
            lblR.Visibility = Visibility.Visible;
            cb.Visibility = Visibility.Visible;
            ruolo_giocatore = "difensore";
            cb.Items.Clear();
            cb.Items.Add("DC");
            cb.Items.Add("TER");
           
        }

        private void po_Checked(object sender, RoutedEventArgs e)
        {
            lblR.Visibility = Visibility.Hidden;
            cb.Visibility = Visibility.Hidden;
            ruolo_giocatore = "portiere";
        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {
            nome_squadra = squadra.Text;
        }

        private void nome_TextChanged(object sender, TextChangedEventArgs e)
        {
            nome_giocatore = n_giocatore.Text;
        }

        private void cognome_TextChanged(object sender, TextChangedEventArgs e)
        {
            cognome_giocatore = c_giocatore.Text;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (nome_squadra == "")
                MessageBox.Show("Ti sei dimenticato di inserire la squadra!");
            else if (nome_giocatore == "")
                MessageBox.Show("Ti sei dimenticato di inserire il nome del giocatore!");
            else if (cognome_giocatore == "")
                MessageBox.Show("Ti sei dimenticato di inserire il cognome del giocatore!");
            else if (ruolo_giocatore == "")
                MessageBox.Show("Ti sei dimenticato di inserire il ruolo del giocatore!");
            else if ((ruolo_giocatore == "attaccante" || ruolo_giocatore == "difensore") && ruolo_specifico == "")
                MessageBox.Show("Ti sei dimenticato di inserire il ruolo specifico del giocatore!");
            else {
                
            Parte2 P = new Parte2();
            P.Show();
            this.Hide();
            P.sq.Content = nome_squadra;
            P.gioc.Content = nome_giocatore + " " + cognome_giocatore;
            P.ruol.Content = ruolo_giocatore + " nello specifico: "+ ruolo_specifico;
            }
        }

        private void cb_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ruolo_specifico = cb.SelectedItem.ToString();
        }
    }
}
