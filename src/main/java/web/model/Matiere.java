package web.model;

public class Matiere {
	private Integer id;
	private String nom;
	private Integer coef;

	public Matiere(String nom, Integer  coef) {
		this.id = null;
		this.nom = nom;
		this.coef = coef;
	}
	
	public Matiere(Integer id, String nom, Integer  coef) {
		this.id = id;
		this.nom = nom;
		this.coef = coef;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getCoef() {
		return coef;
	}
	public void setCoef(Integer coef) {
		this.coef = coef;
	}

}
