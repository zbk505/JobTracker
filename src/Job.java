//Zachary Baker
public class Job {
	public String company;
	public String link;
	public String dateApplied;
	public boolean answered;

	//constructor
	public Job(String company, String link, String dateApplied) {
		this.company = company;
		this.link = link;
		this.dateApplied = dateApplied;
		this.answered = false;
	}

	/*
	 * function to update value of answered.
	 * To be used when a company responds to an application. 
	 */
	public void updateStatus() {
		this.answered = true;
	}
}
