package spring.ladybug.ladybugapp.pojos;
// Generated 19 Jan, 2020 1:05:57 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "ladybug_app_main")
  @JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class,
  property = "email")
public class Login implements java.io.Serializable {

	private String email;
	private Employee emp;
	private String password;
	private String role;
	private Date lastLogin;
	private String resetToken;

	public Login() {
		System.out.println("in login d controller");
	}

	public Login(String email, String password) {
		this.email = email;
		this.password = password;
		System.out.println("in login e and p constructor");
	}

	public Login(String email, Employee emp, String password, String role, Date lastLogin, String resetToken) {
		this.email = email;
		this.emp = emp;
		this.password = password;
		this.role = role;
		this.lastLogin = lastLogin;
		this.resetToken = resetToken;
	}

	@Id
	@Column(name = "email", unique = true, nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@OneToOne
	@JoinColumn(name = "emp_id")
	public Employee getEmp() {
		return this.emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role", length = 45)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login", length = 19)
	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(name = "reset_token", length = 45)
	public String getResetToken() {
		return this.resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

}
