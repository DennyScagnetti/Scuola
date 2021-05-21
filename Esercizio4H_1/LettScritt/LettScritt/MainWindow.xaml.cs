using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IO;
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

namespace LettScritt
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        ObservableCollection<Cosa> cosa = new ObservableCollection<Cosa>();
        public MainWindow()
        {
            InitializeComponent();

            Cosa cosa1 = new Cosa();
            cosa1.nome = "succo";
            cosa1.quantità = 3;
            cosa.Add(cosa1);
            cosa.Add(new Cosa() { nome = "latte", quantità=10 }) ;
            cosa.Add(new Cosa() { nome = "cereali", quantità = 3 });
            lst.ItemsSource = cosa;
            
        }

        private void bttAdd_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                Convert.ToInt32(txtQta.Text);
                Convert.ToString(txtNome.Text);
                if ((txtQta.Text != "" || txtQta.Text != "0") && txtNome.Text != "")
                {
                    cosa.Add(new Cosa() { nome = Convert.ToString(txtNome.Text), quantità = Convert.ToInt32(txtQta.Text) });
                }
                txtQta.Text = "";
                txtNome.Text = "";
            }
            catch (Exception exc)
            {
                MessageBox.Show(exc.Message+" Controlla se hai inserito bene i valori da aggiungere");
            }
            
        }

        private void bttEmpty_Click(object sender, RoutedEventArgs e)
        {
            cosa.Clear();
        }

        private void bttRemove_Click(object sender, RoutedEventArgs e)
        {
            cosa.Remove((Cosa)lst.SelectedItem);
        }

        private void bttSend_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                //apri il file
                StreamWriter spesa = new StreamWriter("D:/Scuola/Esercizio4H_1/LettScritt/LettScritt/Spesa.txt", false, Encoding.ASCII);
                
                //Write out the numbers 1 to 10 on the same line.
                foreach(Cosa c in cosa)
                {
                    
                    spesa.WriteLine(c.nome + " " +c.quantità);
                    
                }

                //chiudi il file
                spesa.Flush();
                spesa.Close();
                MessageBox.Show("Spesa Salvata!");
                DaComprare d = new DaComprare();
                d.Show();
                this.Hide();
            }
            catch (Exception exce)
            {
                MessageBox.Show("ERROREE");
            }
        }
    }
}
