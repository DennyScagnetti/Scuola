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

namespace Nuovo_Progetto
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


        private void Evento_Bottone(object sender, RoutedEventArgs e)
        {
            //evento scatenato dal click del bottone che moltiplica il numero inserito per 10
            //convertendolo prima in Double(per effettuare la moltiplicazione) poi in stringa,
            // perchè nella textbox si possono inserire solo stringhe 
            double numInserito = Double.Parse(textInput.Text);
            double numeroFinale = numInserito * 10;
            textOutput.Text = numeroFinale.ToString();
            textOutput.Text = Convert.ToString(numeroFinale);
        }

        private void pnlMainGrid_MouseUp(object sender, MouseButtonEventArgs e)
        {
            MessageBox.Show("Hai cliccato " + e.GetPosition(this).ToString());
        }

        private void pnlMainGrid_Mousewheel(object sender, MouseWheelEventArgs e)
        {

            MessageBox.Show(this.Background.ToString());
        }

        private void ChiusuraFinestra(object sender, RoutedEventArgs e)
        {//chiude la finestra
            Close();
            //per ridurla ad icona --> Hide();
        }


        private void ControllaSelezione(object sender, RoutedEventArgs e)
        {
            //controllo cosa è stato selezionato e me lo segno sulla stringa scelta
            String scelta = "";
            if (Opz1.IsChecked == true)
            {
                scelta = scelta + Opz1.Content + " ";
            }
            if (Opz2.IsChecked == true)
            {
                scelta = scelta + Opz2.Content + " ";
            }
            if (Opz3.IsChecked == true)
            {
                scelta = scelta + Opz3.Content;
            }

            if (scelta.Equals(""))
            {//se scelta è ancora vuota, vuol dire che non ha selezionanto niente
                MessageBox.Show("Non hai selezionato niente");
            }
            else
            {//altrimenti stampiamo cosa ha selezionato nella solita finestrella
                MessageBox.Show("Hai selezionanto " + scelta);
            }
        }

        private void Opz1_Checked(object sender, RoutedEventArgs e)
        {

        }
        int cont = 0;
        private void checkR3(object sender, RoutedEventArgs e)
        {
            /*   cont++;
               TxtRB.Text =  cont.ToString();*/
        }

        private void checkR2(object sender, RoutedEventArgs e)
        {
            TxtRB.Text = "Hai scelto la seconda opzione";
        }

        private void checkR1(object sender, RoutedEventArgs e)
        {
            TxtRB.Text = "Hai scelto la prima opzione";
        }

        private void clickR3(object sender, RoutedEventArgs e)
        {
            cont++;
            TxtRB.Text = cont.ToString();
        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void ComboBox_ContextMenuOpening(object sender, ContextMenuEventArgs e)
        {
        }

        private void ComboBox_Loaded(object sender, RoutedEventArgs e)
        {//aggiungo gli oggetti nella combobox al caricamento della stessa combobox
            ComboBox.Items.Add("Opzione 1");
            ComboBox.Items.Add("Opzione 2");
            ComboBox.Items.Add("Opzione 3");
            ComboBox.Items.Add("Opzione 4");
         
        }

        private void Click_Password_Confermata(object sender, RoutedEventArgs e)
        {//da ricordare che per selezionare il contenuto della passwordbox, bisogna scrivere passwordbox.password
            string psw = PswBox.Password;
            MessageBox.Show("La tua password è " + psw);
        }
    }
}