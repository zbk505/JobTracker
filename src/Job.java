//Zachary Baker
public class Job {
	public String company;
	public String link;
	public String dateApplied;
	public boolean answered;

	public Job(String company, String link, String dateApplied) {
		this.company = company;
		this.link = link;
		this.dateApplied = dateApplied;
		this.answered = false;
	}

	public void answer() {
		this.answered = true;
	}
}
