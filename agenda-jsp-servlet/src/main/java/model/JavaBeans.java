package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The idcon. */
	private String idcon;
	
	/** The name. */
	private String name;
	
	/** The fone. */
	private String fone;
	
	/** The email. */
	private String email;
	
	
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();
	}
	
	/**
	 * Instantiates a new java beans.
	 *
	 * @param idcon the idcon
	 * @param name the name
	 * @param fone the fone
	 * @param email the email
	 */
	public JavaBeans(String idcon, String name, String fone, String email) {
		super();
		this.idcon = idcon;
		this.name = name;
		this.fone = fone;
		this.email = email;
	}
	
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "JavaBeans [idcon=" + idcon + ", name=" + name + ", fone=" + fone + ", email=" + email + "]";
	}

	/**
	 * Gets the idcon.
	 *
	 * @return the idcon
	 */
	// Getters e Setters
	public String getIdcon() {
		return idcon;
	}
	
	/**
	 * Sets the idcon.
	 *
	 * @param idcon the new idcon
	 */
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the fone.
	 *
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}
	
	/**
	 * Sets the fone.
	 *
	 * @param fone the new fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
