package domain;

import java.util.List;

public class Poster {

	private Long id;
	private String title;
	private String text;

	private String posterIP;
	private String createTime;
	private String lastReplyTime;

	private Poster parentPoster;
	private List<Poster> childPosters;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPosterIP() {
		return posterIP;
	}

	public void setPosterIP(String posterIP) {
		this.posterIP = posterIP;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastReplyTime() {
		return lastReplyTime;
	}

	public void setLastReplyTime(String lastReplyTime) {
		this.lastReplyTime = lastReplyTime;
	}

	public Poster getParentPoster() {
		return parentPoster;
	}

	public void setParentPoster(Poster parentPoster) {
		this.parentPoster = parentPoster;
	}

	public List<Poster> getChildPosters() {
		return childPosters;
	}

	public void setChildPosters(List<Poster> childPosters) {
		this.childPosters = childPosters;
	}

	@Override
	public String toString() {
		return "Poster [id=" + id + ", title=" + title + ", text=" + text
				+ ", posterIP=" + posterIP + ", createTime=" + createTime
				+ ", lastReplyTime=" + lastReplyTime + ", parentPoster="
				+ parentPoster + ", childPosters=" + childPosters + "]";
	}
	
	
}
