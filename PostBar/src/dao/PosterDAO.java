package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Poster;

public class PosterDAO extends HibernateDaoSupport {

	public void save(Poster poster) {
		System.out.println("PosterDAO Exectuted");
		System.out.println(poster);
		this.getHibernateTemplate().save(poster);

	}

	public List<Poster> findAllPosters() {
		// TODO Auto-generated method stub
		List<Poster> allPosters = this.getHibernateTemplate().find("from Poster where parentPoster is null");
		return allPosters;
	}

	public Poster findbyId(Long id) {
		// TODO Auto-generated method stub
		Poster poster = this.getHibernateTemplate().get(Poster.class, id);
		return poster;
	}

}
