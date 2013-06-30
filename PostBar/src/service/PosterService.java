package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.PosterDAO;
import domain.Poster;

@Transactional
public class PosterService {

	private PosterDAO posterDAO;

	public PosterDAO getPosterDAO() {
		return posterDAO;
	}

	public void setPosterDAO(PosterDAO posterDAO) {
		this.posterDAO = posterDAO;
	}

	public void publish(Poster poster) {
		System.out.println("PsterService Exectuted");
		posterDAO.save(poster);
	}

	public List<Poster> findAllPosters() {
		return posterDAO.findAllPosters();
	}

	public Poster findbyId(Long id) {
		return posterDAO.findbyId(id);
	}

}
