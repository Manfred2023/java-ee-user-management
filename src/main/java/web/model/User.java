package web.model;
 
public class User {
	private Integer _id;
	private String _nom;
	private String _prenom;
	private String _grade;
	private String _email;
	private String _motPass;
	private String _rMotPass;
	
 public User(Integer id, String nom, String prenom,String grade,String email,String motPass,String rMotPass) {
	 _id = id;
	 _nom = nom;
	 _prenom = prenom;
	 _email=email;
	 _grade = grade;
	 _motPass  = motPass;
	 _rMotPass  = rMotPass; 
}
 public Integer get_id() {
	return _id;
}
 public void set_id(Integer _id) {
	this._id = _id;
}

 public String get_nom() {
	return _nom;
}
 public void set_nom(String _nom) {
	this._nom = _nom;
}
 public String get_prenom() {
	return _prenom;
}
 public void set_prenom(String _prenom) {
	this._prenom = _prenom;
}
 public String get_grade() {
	return _grade;
}
 public void set_grade(String _grade) {
	this._grade = _grade;
}
 public String get_email() {
	return _email;
}
 public void set_email(String _email) {
	this._email = _email;
}
 public String get_motPass() {
	return _motPass;
}
 public void set_motPass(String _motPass) {
	this._motPass = _motPass;
}
 public String get_rMotPass() {
	return _rMotPass;
}
 public void set_rMotPass(String _rMotPass) {
	this._rMotPass = _rMotPass;
}
 
 @Override
 public String toString() {
     return "User{" +
             "nom='" + _nom + '\'' +
             ", prenom='" + _prenom + '\'' +
             ", grade='" + _grade + '\'' +
             ", email='" + _email + '\'' +
             '}';
 }
 
}
