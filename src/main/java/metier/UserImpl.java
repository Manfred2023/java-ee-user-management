package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import web.model.User;
import web.util.DBConnection; 

public class UserImpl implements UserMetier { 
	
 
	@Override
	public void saveUser(User user) {
		String sql = "INSERT INTO user(nom,prenom,grade,email,password) values (?, ?, ?, ?, ?)"; 
		
		try(Connection con = DBConnection.getConnection();PreparedStatement ps= con.prepareStatement(sql) ){
			 ps.setString(1, user.get_nom()); 
			 ps.setString(2, user.get_prenom()); 
			 ps.setString(3, user.get_grade()); 
			 ps.setString(4, user.get_email()); 
			 ps.setString(5, user.get_motPass());  
			 
			 ps.executeUpdate();
			 
		}catch(Exception e) {  
			e.printStackTrace();
		}		 
	}  

	@Override
	public User findById(int id) {
		 String sql = "SELECT * FROM user WHERE id = ?";
	        User user = null;
	        
	        try (Connection con = DBConnection.getConnection();
	                PreparedStatement ps = con.prepareStatement(sql)) {

	               ps.setInt(1, id);
	               ResultSet rs = ps.executeQuery();
 
	               if (rs.next()) {  
	            	   user = new User(
	            			   rs.getInt("id"), 
	            			   rs.getString("nom"), 
	            			   rs.getString("prenom"), 
	            			   rs.getString("grade"), 
	            			   rs.getString("email"), 
	            			   rs.getString("password"), 
	            			   rs.getString("password")
	            		);   
	               } 

	           } catch (Exception e) {
	               e.printStackTrace();
	           }
	        
	        return user;
	         
	} 

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		String sql = "SELECT * FROM prof";
 
		
		   try (Connection con = DBConnection.getConnection();
		             PreparedStatement ps = con.prepareStatement(sql);
		             ResultSet rs = ps.executeQuery()) {

		            while (rs.next()) {
		            	users.add(
		                		new User(
		 	            			   rs.getInt("id"), 
			            			   rs.getString("nom"), 
			            			   rs.getString("prenom"), 
			            			   rs.getString("grade"), 
			            			   rs.getString("email"), 
			            			   rs.getString("password"), 
			            			   rs.getString("password")
			            		)
		               );
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        return users;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	 	 

}
