package web.model;

public class Composer {
	private Integer id;
	private float note;
	private Eleve eleve;
	private Matiere matiere;
	
	public Composer(Eleve eleve, Matiere matiere, float note) {
		this.id = null;
		this.eleve = eleve;
		this.matiere = matiere;
		this.note = note;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 
}
