import java.util.ArrayList;
import java.awt.Frame;

//Zachary Baker
public class JobTracker {
	private ArrayList<Job> applied;
	private int total;

	public JobTracker() {
		applied = new ArrayList<Job>();
		total = 0;
	}
	
	public ArrayList<Job> getApplied() {
		return applied;
	}
	public int getTotal() {
		return total;
	}
	public void addJob(String company, String link, String dateApplied)
	{
		Job job = new Job(company, link, dateApplied);
		applied.add(job);
	}
	public void deleteJob(Job j)
	{
		applied.remove(j);
	}
	
	public static void main(String[] args) {

	}
}
