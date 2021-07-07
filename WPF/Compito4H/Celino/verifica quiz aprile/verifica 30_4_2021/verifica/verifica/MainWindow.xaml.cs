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

namespace verifica
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private const string V = " ";
        private int punteggio;
        private object ris;

        public MainWindow()
        {
            InitializeComponent();
            
        }

        private void rispostaScritta(object sender, DependencyPropertyChangedEventArgs e)
        {
            domanda2.Text = V;
        }

       

        private void domanda2_TextChanged(object sender, TextChangedEventArgs e)
        {
            if(domanda2.Text == "25")
            {
                punteggio++;
            }
        }
/*
        private void controllo1(object sender, RoutedEventArgs e)
        {
            check2.IsChecked == false;
             check3.IsChecked == false;  

        }

        private void controllo2(object sender, RoutedEventArgs e)
        {
            check1.IsChecked == false;
            check3.IsChecked == false;
        }

        private void controllo3(object sender, RoutedEventArgs e)
        {
            check2.IsChecked == false;
            check1.IsChecked == false;
        }

        int punteggio;
        
private void r2_Checked(object sender, RoutedEventArgs e)
        {
            punteggio == punteggio + 2;
        }
    
   */



        
        private void check3_Checked(object sender, RoutedEventArgs e)
        {
            check1.IsChecked = false;
            check2.IsChecked = false;
            punteggio = punteggio + 2;
        }

        private void check2_Checked(object sender, RoutedEventArgs e)
        {
            check1.IsChecked = false;
            check3.IsChecked = false;
        }

        private void check1_Checked(object sender, RoutedEventArgs e)
        {
            check2.IsChecked = false;
            check3.IsChecked = false;
        }



        private void cambioPagina(object sender, RoutedEventArgs e)
        {
            if (r1.IsChecked == false && r2.IsChecked == false && r3.IsChecked == false && r4.IsChecked == false && domanda2.Text == " " && check1.IsChecked == false && check2.IsChecked == false && check3.IsChecked == false)
            {
                MessageBox.Show("Compila tutti i campi");
            }
            else
                parte2 pag2 = new parte2();
            pag2.punteggio2 = punteggio;               
            verifica.parte2.Show();
            this.Hide();

        }
    }




