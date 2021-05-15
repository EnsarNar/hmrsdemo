package kodlamaio.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobPositionsService;
import kodlamaio.hmrs.entities.concretes.JobPosition;

@RestController //-> Kişi pcden de telefondan da televizyondan da nereden baglanırsa baglansın burayı oraya uygun hale getiriyor.
@RequestMapping("/api/jobpositions") //Hangi yolla erişeceğimizi söyler
public class JobPositionsControllers {
	
	private JobPositionsService jobPositionsService;
	
	@Autowired //->Arka planda  JobPositionsService için gelen manageri newler ve referansını tutar !!!!!!!
	public JobPositionsControllers(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	};
	@RequestMapping("/getall")
	public List<JobPosition> getAll(){
		//JobPositionsService.getAll() derken, bu servicenin referansını tuttuğu yerden çekiyoruz getAll()'ı
		return this.jobPositionsService.getAll();
	};
	
}
