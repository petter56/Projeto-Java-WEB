package model;

public class Usuario {
	
	private int UsuarioID;
	private String CPF;
	private String Nome;
	private String PlacaDoCarro;
	private String Senha;
	
	
	public int getUsuarioID() {
		return UsuarioID;
	}
	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPlacaDoCarro() {
		return PlacaDoCarro;
	}
	public void setPlacaDoCarro(String placaDoCarro) {
		PlacaDoCarro = placaDoCarro;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	

}
