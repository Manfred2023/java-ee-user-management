package web.model;

public class Eleve {
	private Integer id;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String classe;
	private User prof;
	
	public Eleve(String nom, String prenom, String dateNaissance, String classe, User prof) {
		this.id = null;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance= dateNaissance;
		this.dateNaissance= classe;
		this.prof = prof;
	}
    public Eleve(Integer id, String nom, String prenom, String dateNaissance, String classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.classe = classe;
    }
 
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getClasse() {
		return classe;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getProf() {
		return prof;
	}
	public void setProf(User prof) {
		this.prof = prof;
	}
	
}
