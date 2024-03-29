package models;

import java.sql.SQLException;

import persistence.indicadoresDAO;

public class indicadores{
	
	private int indicadorID;
    private int quantidadeDeAdvertencias;
    private int quantidadeDeAcidentes;
    private int cargaHorariaSemanalDeTrabalho;
    private int cargaHorariaTotalDeTreinamento;
    private String cargo;
    private String setor;
    private String dataNascimento;
    private static String employeeID;
    
	public void setIndicadorID(int indicadorID) {
		this.indicadorID = indicadorID;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setQuantidadeDeAdvertencias(int quantidadeDeAdvertencias) {
		this.quantidadeDeAdvertencias = quantidadeDeAdvertencias;
	}
	public void setQuantidadeDeAcidentes(int quantidadeDeAcidentes) {
		this.quantidadeDeAcidentes = quantidadeDeAcidentes;
	}
	public void setCargaHorariaSemanalDeTrabalho(int cargaHorariaSemanalDeTrabalho) {
		this.cargaHorariaSemanalDeTrabalho = cargaHorariaSemanalDeTrabalho;
	}
	public void setCargaHorariaTotalDeTreinamento(int cargaHorariaTotalDeTreinamento) {
		this.cargaHorariaTotalDeTreinamento = cargaHorariaTotalDeTreinamento;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setEmployeeID(String employeeID) {
		indicadores.employeeID = employeeID;
	}
	public int getIndicadorID() {
		return indicadorID;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public int getQuantidadeDeAdvertencias() {
		return quantidadeDeAdvertencias;
	}
	public int getQuantidadeDeAcidentes() {
		return quantidadeDeAcidentes;
	}
	public int getCargaHorariaSemanalDeTrabalho() {
		return cargaHorariaSemanalDeTrabalho;
	}
	public int getCargaHorariaTotalDeTreinamento() {
		return cargaHorariaTotalDeTreinamento;
	}
	public String getCargo() {
		return cargo;
	}
	public String getSetor() {
		return setor;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	
	
	//M�todos de DAO
	public boolean create(){
		return indicadoresDAO.create(this);
	}
	public boolean update(){
		return indicadoresDAO.update(this);
	}
	public indicadores getAll(String param) throws SQLException{
		return indicadoresDAO.getIndicadores(param);
	}
}
