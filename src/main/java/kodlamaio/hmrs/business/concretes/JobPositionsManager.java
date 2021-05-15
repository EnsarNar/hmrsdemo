package kodlamaio.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.abstracts.JobPositionsService;
import kodlamaio.hmrs.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.hmrs.entities.concretes.JobPosition;

@Service // -> Spring'e, buranın service katmanı oldugunu söylüyorm
public class JobPositionsManager implements JobPositionsService{

	@Autowired // mainde bunu newlememize gerek yok. Autowired, bunu arka planda yapacaktır.
	private JobPositionsDao jobPositionsDao;
	//Bu constructoru koyuyoruz çünkü başka bir dao gelirse onun için de autowired yazmamız gerekirdi
	//Fakat bu classı da autowired'in etkinliğine bırakırsak yeni bir dao gelirse otomatikmen eklenir,
	//hepsi outowiredlenmiş gibi olur.
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		this.jobPositionsDao = jobPositionsDao;
	};
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionsDao.findAll();
		//this desek de demesek de sıkıntı olmaz çünkü this demezsek zaten classın içindekini alıyor
		//this dersek bu classın içinde oldugunu da belirtiyor.
	}

}

//Entities'ten dataAccess'e, dataAccess'ten de JobPositions'a ulaştık
//Engin hocanın bahsettiği katmanlı mimari budur.
