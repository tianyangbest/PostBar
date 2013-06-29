package web.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import service.PosterService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Poster;

public class PublishPosterAction extends ActionSupport implements
		ModelDriven<Poster> {

	private Poster poster = new Poster();
	private PosterService posterService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("PublishPosterAction Exectuted");
		poster.setPosterIP(ServletActionContext.getRequest().getRemoteAddr());
		poster.setCreateTime(new Date().toString());
		poster.setLastReplyTime(new Date().toString());
		posterService.publish(poster);
		return SUCCESS;
	}

	public PosterService getPosterService() {
		return posterService;
	}

	public void setPosterService(PosterService posterService) {
		this.posterService = posterService;
	}

	@Override
	public Poster getModel() {
		// TODO Auto-generated method stub
		return poster;
	}

}
