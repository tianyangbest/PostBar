package web.action;

import java.util.List;

import service.PosterService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Poster;

public class ListPostersAction extends ActionSupport {

	private PosterService posterService = new PosterService();
	private List<Poster> allPosters;

	public PosterService getPosterService() {
		return posterService;
	}

	public void setPosterService(PosterService posterService) {
		this.posterService = posterService;
	}

	public List<Poster> getAllPosters() {
		return allPosters;
	}

	@Override
	public String execute() throws Exception {
		allPosters = posterService.findAllPosters();
		return SUCCESS;
	}

}
