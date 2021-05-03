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

namespace CompitoAprile
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

            bool risp = true;
            string risp_manc = "";
            if (e4_1.IsChecked == false && c4_1.IsChecked == false && c4_2.IsChecked == false && c4_3.IsChecked == false)
            {
                risp = false;
                risp_manc += " 4";
            }

            if (e5.IsChecked == false && c5.IsChecked == false)
            {
                risp = false;
                risp_manc += " 5";
            }

            if (e6_1Iso.IsChecked == false && e6_2Iso.IsChecked == false && c6_1Iso.IsChecked == false && c6_2Iso.IsChecked == false && c6_3Iso.IsChecked == false)
            {
                risp = false;
                risp_manc += " 6 (prima riga)";
            }
            if (c1_1Ret.IsChecked == false && c1_2Ret.IsChecked == false && c2_1Ret.IsChecked == false && c2_2Ret.IsChecked == false && c12Ret.IsChecked == false)
            {
                risp = false;
                risp_manc += " 6 (seconda riga)";
            }
            if (e6_1Sca.IsChecked == false && e6_2Sca.IsChecked == false && c6_1Sca.IsChecked == false && c6_2Sca.IsChecked == false && c6_3Sca.IsChecked == false)
            {
                risp = false;
                risp_manc += " 6 (terza riga)";
            }
            if (risp == true)
            {
                int tot = Convert.ToInt32(conteggio.Text);
                if (c4_1.IsChecked == true && c4_2.IsChecked == true && c4_3.IsChecked == true)
                    tot += 2;
                if (c5.IsChecked == true)
                    tot += 2;
                if (c6_1Iso.IsChecked == true && c6_2Iso.IsChecked == true && c6_3Iso.IsChecked == true)
                    tot += 1;
                if (c6_1Sca.IsChecked == true && c6_2Sca.IsChecked == true && c6_3Sca.IsChecked == true)
                    tot += 1;
                if ((c1_1Ret.IsChecked == true && c1_2Ret.IsChecked == true && c12Ret.IsChecked == true) || (c2_1Ret.IsChecked == true && c2_2Ret.IsChecked == true && c12Ret.IsChecked == true))
                    tot += 1;
                MessageBox.Show("Hai fatto "+tot);
            }
            else
            {
               
                MessageBoxResult MR = MessageBox.Show("Hai tralasciato le seguenti risposte: " + risp_manc, "Risposte mancanti", MessageBoxButton.OKCancel, MessageBoxImage.Warning, MessageBoxResult.OK);
                if (MR == MessageBoxResult.OK)
                    MessageBox.Show("Stai più attento");
            }
        }
    }
}
