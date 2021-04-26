using Microsoft.Win32;
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

namespace Ripasso
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        int conta = 0, conta1=0;
        public MainWindow()
        {
            InitializeComponent();
        }

        private void saluto(object sender, TextChangedEventArgs e)
        {
            if(txtSaluto.Text == "ciao")
            {
                lblSaluto.Content = "Ciao anche a te";
                lblSaluto.Opacity= 0.5;
                pswSaluto.Password = "1234567";
            }
            else
            {
                lblSaluto.Content = "";
            }
        }

        private void RB1_Checked(object sender, RoutedEventArgs e)
        {
            conta1++;
            lblCheck.Content = conta1;
        }

        private void RB3_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("/cb3e1bcac903e82f6d7eb4a344c178d7.jpg", UriKind.Relative);
            sfondo.Source = new BitmapImage(immagine);
        }

        private void RB2_Checked(object sender, RoutedEventArgs e)
        {
            Uri immagine = new Uri("C:/Users/utente/Pictures/sfondi/hd-pc-wallpapers-download-group-92-con-sfondi-hd-pc-e-wallpaper2you-290363-7-con-sfondi-hd-pc-e-1920x1080px.jpg");
            sfondo.Source = new BitmapImage(immagine);
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            if (openFileDialog.ShowDialog() == true)
            {
                Uri immagine = new Uri(openFileDialog.FileName, UriKind.Absolute);
                sfondo.Source = new BitmapImage(immagine);
            }
        }

        private void RB1_Click(object sender, RoutedEventArgs e)
        {

            conta++;
        //  lblClick.Content += "hai clickato RB3";
        }
    }
}
