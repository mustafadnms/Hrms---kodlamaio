package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")

public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false)
	private int id;
	
	@Email(message = "Gecerli Email adresi giriniz!")
    @NotBlank(message = "Email alani bos birakilamaz!")
    @Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Size(min = 6, max = 26, message = "Sifreniz 6 ile 26 karakter arasinda olmalidir!")
	@Column(name = "password", nullable = false)
	private String password;
	
	@Size(min = 6, max = 26, message = "Sifreniz 6 ile 26 karakter arasinda olmalidir!")
	@Transient
	private String repeatedPassword;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
	private Date updatedAt;
	
	@Column(name = "is_verified", nullable = false)
	private boolean isVerified;	
	
}
