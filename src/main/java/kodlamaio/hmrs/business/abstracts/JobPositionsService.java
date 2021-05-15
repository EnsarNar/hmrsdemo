package kodlamaio.hmrs.business.abstracts;

import java.util.List;

import kodlamaio.hmrs.entities.concretes.JobPosition;

public interface JobPositionsService {

	List<JobPosition> getAll();
}
