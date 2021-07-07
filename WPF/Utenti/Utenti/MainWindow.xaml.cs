using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
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

namespace Utenti
{
    /// <summary>
    /// Logica di interazione per MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
		private ObservableCollection<User> users = new ObservableCollection<User>();

		public MainWindow()
		{
			InitializeComponent();
			//aggiungo 2 utenti alla lista users che contiene oggetti di tipo Users
			users.Add(new User() { Name = "John Doe" });
			users.Add(new User() { Name = "Jane Doe" });

			lbUsers.ItemsSource = users;
		}

		private void btnAddUser_Click(object sender, RoutedEventArgs e)
		{//aggiungiamo un utente con nome generico "New user"
			users.Add(new User() { Name = "New user" });
		}

		private void btnChangeUser_Click(object sender, RoutedEventArgs e)
		{//verifichiamo se è selezionato un utente e, se c'è, gli cambiamo nome con "Random Name"
			if (lbUsers.SelectedItem != null)
				(lbUsers.SelectedItem as User).Name = "Random Name";
		}

		private void btnDeleteUser_Click(object sender, RoutedEventArgs e)
		{//verifichiamo se è selezionato un utente e, e se c'è lo rimuoviamo dalla lista
			if (lbUsers.SelectedItem != null)
				users.Remove(lbUsers.SelectedItem as User);
		}
	}
	//creiamo una classe che corrisponderà all'oggetto presente nella listbox;
	//INotifyPropertyChanged è un'interfaccia che permette la notifica in tempo reale
	//dei cambiamenti a quegli oggetti di tipo User
	public class User : INotifyPropertyChanged
	{
		private string name;
		public string Name
		{
			get { return this.name; }
			set
			{
				if (this.name != value)
				{
					this.name = value;
					this.NotifyPropertyChanged("Name");
				}
			}
		}

		public event PropertyChangedEventHandler PropertyChanged;

		public void NotifyPropertyChanged(string propName)
		{
			if (this.PropertyChanged != null)
				this.PropertyChanged(this, new PropertyChangedEventArgs(propName));
		}
	}
}
