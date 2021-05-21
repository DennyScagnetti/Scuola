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

namespace QuizAprile
{
    
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        public string RispostaScelta = "null";
        public string RispostaData = "null";
        public int conta = 0;
        public string Risposta_Scelta = "null";
        private void PrimaOpzione_Checked(object sender, RoutedEventArgs e)
        {
             RispostaScelta = "lato + lato";
        }

        private void SecondaOpzione_Checked(object sender, RoutedEventArgs e)
        {
            RispostaScelta = "lato * lato";
            conta++;
        }

        private void TerzaOpzione_Checked(object sender, RoutedEventArgs e)
        {
            RispostaScelta = "Basemax + Basemin * h / 2";
        }

        private void QuartaOpzione_Checked(object sender, RoutedEventArgs e)
        {
            RispostaScelta = "Base * h / 2";
        }

        private void txtRisposta_TextChanged(object sender, TextChangedEventArgs e)
        {
            if (txtRisposta.Text == "20")
            {
                RispostaData = txtRisposta.Text;
                conta++;
            }
            else
                RispostaData = txtRisposta.Text;
        }

        private void cbScelta1_Checked(object sender, RoutedEventArgs e)
        {
            Risposta_Scelta = "1";
        }

        private void cbScelta2_Checked(object sender, RoutedEventArgs e)
        {
            Risposta_Scelta = "2";
        }

        private void cbScelta3_Checked(object sender, RoutedEventArgs e)
        {
            Risposta_Scelta = "3";
            conta = conta + 2;
        }
        private void btnAvanti_Click(object sender, RoutedEventArgs e)
        {
            SecondaPagina S = new SecondaPagina();
            S.conta
            S.Show();
            this.Close();
        }
    }
}
