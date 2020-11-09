
//Zachary Baker
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JobTracker {
	private ArrayList<Job> applied;
	private int total;
	private File file;

	/*
	 * @param filename
	 * 
	 * Constructor to read
	 */
	public JobTracker(String filename) {

		this.file = new File(filename);
		this.applied = new ArrayList<Job>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String st = br.readLine();// reads first line to ignore headings

			while ((st = br.readLine()) != null) {
				int c = st.indexOf("Company:");

				// get all info from file
				String company = st.substring(c, st.indexOf(","));
				st = st.substring(company.length() + 2);
				int l = st.indexOf("Link: ");
				// System.out.printf("company: %s, st: %s, l: %d", company, st, l);

				String link = st.substring(l, st.indexOf(","));
				st = st.substring(link.length() + 2);
				int d = st.indexOf("Date: ");

				String date = st.substring(d, st.indexOf(","));
				st = st.substring(date.length() + 2);

				// create new job and add it to array
				Job j = new Job(company, link, date);

				applied.add(j);
			}
			this.total = applied.size();
			br.close();
		} catch (IOException e) {
			this.file = new File("jt.txt");

			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(this.file));
				bw.write("Company, Link, Date Applied, Answered");
				bw.close();
			} catch (IOException f) {
				e.printStackTrace();
			}
			System.out.printf("new file 'jt.txt' created\n");
		}
	}

	/*
	 * function to get the array list of jobs
	 * 
	 * @return applied array list
	 */
	public ArrayList<Job> getApplied() {

		return applied;
	}

	public void save() {

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
	public void addJob(Job job) {
		Job j = job;
		applied.add(job);
		
		String company = j.getCompanyName();
		String link = j.getLink();
		String dateApplied = j.getDate();

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.file));
			bw.write(String.format("%s,%s,%s,%s", company, link, dateApplied, j.getAnswered()));
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
