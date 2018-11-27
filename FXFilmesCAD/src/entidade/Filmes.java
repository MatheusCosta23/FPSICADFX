package entidade;

public class Filmes {

	protected int Id;
	protected String NomeFilme;
	protected String Diretor;
	protected int Ano;
	protected String Genero;
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNomeFilme() {
		return NomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		NomeFilme = nomeFilme;
	}
	public String getDiretor() {
		return Diretor;
	}
	public void setDiretor(String diretor) {
		Diretor = diretor;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Ano;
		result = prime * result + ((Diretor == null) ? 0 : Diretor.hashCode());
		result = prime * result + ((Genero == null) ? 0 : Genero.hashCode());
		result = prime * result + Id;
		result = prime * result + ((NomeFilme == null) ? 0 : NomeFilme.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filmes other = (Filmes) obj;
		if (Ano != other.Ano)
			return false;
		if (Diretor == null) {
			if (other.Diretor != null)
				return false;
		} else if (!Diretor.equals(other.Diretor))
			return false;
		if (Genero == null) {
			if (other.Genero != null)
				return false;
		} else if (!Genero.equals(other.Genero))
			return false;
		if (Id != other.Id)
			return false;
		if (NomeFilme == null) {
			if (other.NomeFilme != null)
				return false;
		} else if (!NomeFilme.equals(other.NomeFilme))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Filmes [Id=" + Id + ", NomeFilme=" + NomeFilme + ", Diretor=" + Diretor + ", Ano=" + Ano + ", Genero="
				+ Genero + "]";
	}
	
	
	
	
	
}
