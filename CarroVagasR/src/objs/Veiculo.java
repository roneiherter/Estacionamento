package objs;

public class Veiculo {

	private String modelo;
	private String tamanho;
	private Vaga vaga;
	private String placa;
	private double preco;
	private int horaEnt;
	private int minutoEnt;
	private int horaSaida;
	private int minutoSaida;
	private int horasTot;
	private int minutosTot;
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", tamanho=" + tamanho + ", vaga=" + vaga.getNumero() + ", placa=" + placa + ", preco="
				+ preco + ", horaEntrada=" + horaEnt + ":" + minutoEnt + ", horaSaida=" + horaSaida
				+ ":" + minutoSaida + ", tempoEstacionado=" + horasTot + ":" + minutosTot + "]";
	}
	public Veiculo(String modelo, String tamanho, Vaga vaga, String placa, double preco, int horaEnt, int minutoEnt,
			int horaSaida, int minutoSaida, int horasTot, int minutosTot) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.vaga = vaga;
		this.placa = placa;
		this.preco = preco;
		this.horaEnt = horaEnt;
		this.minutoEnt = minutoEnt;
		this.horaSaida = horaSaida;
		this.minutoSaida = minutoSaida;
		this.horasTot = horasTot;
		this.minutosTot = minutosTot;
	}
	public Veiculo() {
		super();
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getHoraEnt() {
		return horaEnt;
	}
	public void setHoraEnt(int horaEnt) {
		this.horaEnt = horaEnt;
	}
	public int getMinutoEnt() {
		return minutoEnt;
	}
	public void setMinutoEnt(int minutoEnt) {
		this.minutoEnt = minutoEnt;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	public int getMinutoSaida() {
		return minutoSaida;
	}
	public void setMinutoSaida(int minutoSaida) {
		this.minutoSaida = minutoSaida;
	}
	public int getHorasTot() {
		return horasTot;
	}
	public void setHorasTot(int horasTot) {
		this.horasTot = horasTot;
	}
	public int getMinutosTot() {
		return minutosTot;
	}
	public void setMinutosTot(int minutosTot) {
		this.minutosTot = minutosTot;
	}
	
	
}
