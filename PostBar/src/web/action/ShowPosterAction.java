package web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Poster;

import service.PosterService;

public class ShowPosterAction extends ActionSupport implements
		ModelDriven<Poster> {

	private PosterService posterService;
	private Poster poster = new Poster();

	public void setPosterService(PosterService posterService) {
		this.posterService = posterService;
	}

	@Override
	public String execute() throws Exception {
		poster = posterService.findbyId(poster.getId());
		return SUCCESS;
	}

	@Override
	public Poster getModel() {
		// TODO Auto-generated method stub
		return poster;
	}

}
