package ensat.tp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


public class user {
	private String nom;
	  private String prenom; 
	  private String sexe;
	  private List transport;
	  private int code;

	    public int getcode() {
	        return code;
	    }

	    public void setcode(int code) {
	        this.code = code;
	    }
	  
	  
	    public String getSexe() {
	        return sexe;
	    }

	    public void setSexe(String sexe) {
	        this.sexe = sexe;
	    }


	    public List getTransport() {
	        return transport;
	    }

	    public void setTransport(List transport) {
	        this.transport = transport;
	    }

	    

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }
	  
	  
	  
	  public void returnAction(FacesContext context, UIComponent toValidate,
	            Object value) throws ValidatorException{
	        
	        String eMail =(String) value;
	        if (eMail.indexOf("@") < 0){
	            FacesMessage message =new FacesMessage("Adresse Email invalide !");
	            throw new ValidatorException(message);
	        }
	    }
}
