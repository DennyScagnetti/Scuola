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

namespace BoxLista
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
		public MainWindow()
		{
			InitializeComponent();
			//creiamo una lista di oggetti TodoItem (che è una classe creata in fondo al documento)
			List<TodoItem> items = new List<TodoItem>();
			TodoItem P1 = new TodoItem() { Title = "Complete this WPF tutorial", Completion = 45 };
			//aggiungiamo l'elemento P1 creato poco fa
			items.Add(P1);
			TodoItem P2 = new TodoItem();
			P2.Title = "Learn C#";
			P2.Completion = 80;
			//aggiungiamo l'elemento P2 creato poco fa
			items.Add(P2);
			items.Add(new TodoItem() { Title = "Wash the car", Completion = 0 });
			//consideriamo la lista come un array e applichiamo le modifiche necessarie
			items.ToArray()[2].Title = "Wash the Motorbike";
			items.ToArray()[2].Completion = 100;
			lbTodoList.ItemsSource = items;
		}

		private void lbTodoList_SelectionChanged(object sender, System.Windows.Controls.SelectionChangedEventArgs e)
		{
			//evento che si scatena quando cambia la selezione di un oggetto nella lista
			if (lbTodoList.SelectedItem != null)
				this.Title = (lbTodoList.SelectedItem as TodoItem).Title;
		}

		private void btnShowSelectedItem_Click(object sender, RoutedEventArgs e)
		{
			//quando si clicca il bottone, stampiamo con una MessageBox  l'oggetto selezionato
			foreach (object o in lbTodoList.SelectedItems)
				MessageBox.Show((o as TodoItem).Title);
		}

		private void btnSelectLast_Click(object sender, RoutedEventArgs e)
		{
			//considerate che gli elementi selezionati sono una lista, per selezionare l'ultimo basta prendere l'ultimo di questa lista
			lbTodoList.SelectedIndex = lbTodoList.Items.Count - 1;
		}

		private void btnSelectNext_Click(object sender, RoutedEventArgs e)
		{
			//seleziona l'elemento successivo della lista, presente nella listBox, rispetto all'ultimo elemento selezionato 
			int nextIndex = 0;
			if ((lbTodoList.SelectedIndex >= 0) && (lbTodoList.SelectedIndex < (lbTodoList.Items.Count - 1)))
				nextIndex = lbTodoList.SelectedIndex + 1;
			lbTodoList.SelectedIndex = nextIndex;
		}

		private void btnSelectCSharp_Click(object sender, RoutedEventArgs e)
		{
			//ci passiamo tutta la lista e cerchiamo l'oggetto che contiene nel titolo la parola C#
			foreach (object o in lbTodoList.Items)
			{
				if ((o is TodoItem) && ((o as TodoItem).Title.Contains("C#")))
				{
					lbTodoList.SelectedItem = o;
					break;
				}
			}
		}

		private void btnSelectAll_Click(object sender, RoutedEventArgs e)
		{//prendi tutta la lista e li aggiungi in quella lista dei selezionati

			foreach (object o in lbTodoList.Items)
				lbTodoList.SelectedItems.Add(o);
		}


	}

	//classe che si riferisce al tipo di oggetti presenti nella lista
	public class TodoItem
	{
		public string Title { get; set; }
		public int Completion { get; set; }
	}
}
