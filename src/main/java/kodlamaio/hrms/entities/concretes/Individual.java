package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "individuals")
@NoArgsConstructor
public class Individual extends User{

    @NotBlank(message = "Isim alani bos birakilamaz!")
    @Column(name = "first_name", length = 25, nullable = false)
    private String firstName;

    @NotBlank(message = "Soyisim alani bos birakilamaz!")
    @Column(name = "last_name", length = 25, nullable = false)
    private String lastName;

    @NotBlank(message = "T.C. Kimlik numarasi bos birakilamaz!")
    @Size(min = 11, max = 11, message = "T.C. Kimlik numarasi 11 haneli olmalidir!")
    @Column(name = "identification_number", length = 11, unique = true, nullable = false)
    private String identificationNumber;

    @NotNull(message = "Dogum tarihi alani bos birakilamaz!")
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

}
