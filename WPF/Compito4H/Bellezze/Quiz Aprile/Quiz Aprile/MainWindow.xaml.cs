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

namespace Quiz_Aprile
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

        int errori = 0;
        int giuste = 0;
        string domanda1 = "";
        int domanda2 = "";
        string domanda3 = "";

        Window1 parte2 = new Window1();

        private void risposta1_Checked(object sender, RoutedEventArgs e)
        {
            domanda1 = risposta1.Content.ToString();
            errori++;
        }

        private void risposta2_Checked(object sender, RoutedEventArgs e)
        {
            domanda1 = risposta2.Content.ToString();
            giuste++;
        }

        private void risposta3_Checked(object sender, RoutedEventArgs e)
        {
           domanda1 = risposta3.Content.ToString();
           errori++;
        }

        private void risposta4_Checked(object sender, RoutedEventArgs e)
        {

          domanda1 = risposta4.Content.ToString();
          errori++;

        }

        private void risposta5_TextChanged(object sender, TextChangedEventArgs e)
        {
            if (risposta5.Text == 20)
            {
                domanda2 = risposta5.Text();
                giuste++;
            };
        ;


        Uri tri1 = (Immagini/tr1.png, Uri.Absolute);
        img1.Source = Uri tri1;
        Uri tri2 = (Immagini/tr2.png, Uri.Absolute);
        img2.Source = Uri tri2;
        Uri tri3 = (Immagini/tr3.png, Uri.Absolute);
        img3.Source = Uri tri3;


        private void risposta6_Checked(object sender, RoutedEventArgs e)
        {
            domanda3 = risposta6.Content.ToString();
            errori++;
        }

        private void risposta7_Checked(object sender, RoutedEventArgs e)
        {
            domanda3 = risposta7.Content.ToString();
            errori++;
        }

        private void risposta8_Checked(object sender, RoutedEventArgs e)
        {
            domanda3 = risposta8.Content.ToString();
            giuste++;
        }

        private void avanti_Click(object sender, RoutedEventArgs e)
        {

            if (domanda1 = "")
            {
                string messaggio1 = "Rispondi alla prima domanda.";
                messaggio1.Show();
            };

            if (domanda2 = "")
            {
                string messaggio2 = "Rispondi alla seconda domanda.";
                messaggio2.Show();
            };

            if (domanda3 = "")
            {
                string messaggio3 = "Rispondi alla terza domanda.";
                messaggio3.Show();
            };

            if(domanda1 != "" && domanda2 != "" && domanda3 != "")
            {
                parte2.Show();
                this.Hide();
            }
        }
    }
}
