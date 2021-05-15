package kodlamaio.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs.entities.concretes.JobPosition;
//JpaRpository, CRUD işlemlerini bizim için kendisi yapar.
//<CRUD operasyonlarını kim için oluşturayım ? , birincil anahtarının türü ney ?>
public interface JobPositionsDao extends JpaRepository<JobPosition,Integer> {

}
