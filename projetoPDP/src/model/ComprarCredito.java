package model;

public class ComprarCredito {
	
	private String TipoCartao;
	private int NumeroCartao;
	private String DataValidade;
	private int CodigoSeguranca;
	public String getTipoCartao() {
		return TipoCartao;
	}
	public void setTipoCartao(String tipoCartao) {
		TipoCartao = tipoCartao;
	}
	public int getNumeroCartao() {
		return NumeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		NumeroCartao = numeroCartao;
	}
	public String getDataValidade() {
		return DataValidade;
	}
	public void setDataValidade(String dataValidade) {
		DataValidade = dataValidade;
	}
	public int getCodigoSeguranca() {
		return CodigoSeguranca;
	}
	public void setCodigoSeguranca(int codigoSeguranca) {
		CodigoSeguranca = codigoSeguranca;
	}
	
	
}
