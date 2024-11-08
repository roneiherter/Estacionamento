package objs;

public class Vaga {
	
	private Boolean disponivel;
	private int numero;
	private String tamanho;
	@Override
	public String toString() {
		return "Vaga [disponivel=" + disponivel + ", numero=" + numero + ", tamanho=" + tamanho + "]";
	}
	public Vaga(Boolean disponivel, int numero, String tamanho) {
		super();
		this.disponivel = disponivel;
		this.numero = numero;
		this.tamanho = tamanho;
	}
	public Vaga() {
		super();
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
