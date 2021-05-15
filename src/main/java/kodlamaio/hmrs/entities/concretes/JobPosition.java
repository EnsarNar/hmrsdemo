package kodlamaio.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity// -> Sen bir veritabanı tablosusun. JobTitle bir veritabanı tablosunun karşılıgıdır
@Data //Lombok, bizim yerimize getter ve settersleri getirdi.
@Table(name ="job_positions") // -> Veritabanındaki job_positions ile eşleştirdik.
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
	
	@Id //-> JobPositions'un primary keyi iddir. (veritabanındaki idyi belirttik)
	@GeneratedValue(strategy =GenerationType.IDENTITY)// Bir bir artacak.
	
	@Column(name="id") //-> Sen veritabanındaki bir kolonsun ve veritabanındaki karşılığın iddir.
	private int id;
	@Column(name="position")
	private String position;
	
}
