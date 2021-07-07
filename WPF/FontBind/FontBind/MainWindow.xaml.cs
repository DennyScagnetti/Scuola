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

namespace FontBind
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            //voglio che il contenuto del radiobutton selezionato sia il colore della textbox sopra 
            Binding coloraTB = new Binding("Text");
            coloraTB.Source = txtboxColor;
            coloraTextBlock.SetBinding(TextBlock.ForegroundProperty, coloraTB);

        }

   }
}
