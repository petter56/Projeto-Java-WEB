package model;

public class Cartao {
	
	private int CartaoID;
	private String TipoCartao;
	private String NumeroCartao;
	private String DataValidade;
	private String CodigoSeguranca;
	
	public int getCartaoID() {
		return CartaoID;
	}
	public void setCartaoID(int cartaoID) {
		CartaoID = cartaoID;
	}
	public String getTipoCartao() {
		return TipoCartao;
	}
	public void setTipoCartao(String tipoCartao) {
		TipoCartao = tipoCartao;
	}
	public String getNumeroCartao() {
		return NumeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		NumeroCartao = numeroCartao;
	}
	public String getDataValidade() {
		return DataValidade;
	}
	public void setDataValidade(String dataValidade) {
		DataValidade = dataValidade;
	}
	public String getCodigoSeguranca() {
		return CodigoSeguranca;
	}
	public void setCodigoSeguranca(String codigoSeguranca) {
		CodigoSeguranca = codigoSeguranca;
	}
	

}
