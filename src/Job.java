//Zachary Baker
public class Job {
	private String company;
	private String link;
	private String dateApplied;
	private boolean answered;

	//constructor
	public Job(String company, String link, String dateApplied) {
		this.company = company;
		this.link = link;
		this.dateApplied = dateApplied;
		this.answered = false;
	}
	// getters
	public String getCompanyName()
	{
		return company;
	}
	public String getLink()
	{
		return link;
	}
	public String getDate()
	{
		return dateApplied;
	}
	public boolean getAnswered()
	{
		return answered;
	}
	/*
	 * function to update value of answered.
	 * To be used when a company responds to an application. 
	 */
	public void updateStatus() {
		this.answered = true;
	}
	public String toString()
	{
		return String.format("%s, %s, %s, %s", company, link, dateApplied, "Answered: " + answered);
	}
}
