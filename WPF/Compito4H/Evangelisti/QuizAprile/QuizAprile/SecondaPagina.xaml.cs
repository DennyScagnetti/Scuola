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

namespace QuizAprile
{
    /// <summary>
    /// Logica di interazione per SecondaPagina.xaml
    /// </summary>
    public partial class SecondaPagina : Window
    {
        public SecondaPagina()
        {
            InitializeComponent();
        }
        public string OpzioneScelta = "null";
        public string Risposta_Data = "null";
        public int Punteggio = 0;

        private void rbVero_Checked(object sender, RoutedEventArgs e)
        {
            Risposta_Data = "Vero";

        }

        private void rbFalso_Checked(object sender, RoutedEventArgs e)
        {
            Risposta_Data = "Falso";
        }
       
        private void cbSceltaUno_Checked(object sender, RoutedEventArgs e)
        {
            OpzioneScelta = "l'ipotenusa è sempre maggiore dei singoli cateti";
            Punteggio++;
        }

        private void cbSceltaDue_Checked(object sender, RoutedEventArgs e)
        {
            OpzioneScelta = "la somma degli angoli interni è 180°";
        }

        private void cbSceltaTre_Checked(object sender, RoutedEventArgs e)
        {
            OpzioneScelta = "ha almeno due angoli retti";
        }

        private void cbSceltaQuattro_Checked(object sender, RoutedEventArgs e)
        {
            OpzioneScelta = "ha sempre e solo un angolo retto";
            Punteggio++;
        }

        MainWindow M = new MainWindow();
        Punteggio = M.Conta;
    }
}
