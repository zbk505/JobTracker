
//Zachary Baker
import java.util.ArrayList;

public class JobTracker {
	private ArrayList<Job> applied;
	private int total;

	// constructor
	public JobTracker() {

		applied = new ArrayList<Job>();
		total = 0;
	}

	/*
	 * function to get the array list of jobs
	 * 
	 * @return applied array list
	 */
	public ArrayList<Job> getApplied() {

		return applied;
	}

	/*
	 * function to get total number of jobs
	 * 
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/*
	 * function to add a job to the list
	 * 
	 * @param company
	 * 
	 * @param link
	 * 
	 * @param dateApplied
	 */
	public void addJob(String company, String link, String dateApplied) {
		Job job = new Job(company, link, dateApplied);
		applied.add(job);
	}

	/*
	 * function to remove a job from the array
	 * 
	 * @param Job j
	 * 
	 */
	public void deleteJob(Job j) {
		applied.remove(j);
	}
}
