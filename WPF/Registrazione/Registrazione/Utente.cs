using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Registrazione
{
    class Utente
    {
        string nome;
        string cognome;
        string email;
        string password;
        bool privacy;
        public Utente(string nome, string cognome, string email, string password, bool privacy)
        {
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.password = password;
            this.privacy = privacy;
        }
        
    }
}
