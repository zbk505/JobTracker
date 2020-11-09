import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

//Zachary Baker
public class AppUi implements ActionListener, WindowListener {
	private int windowX = 900;
	private int windowY = 100;
	private Frame f = new Frame();
	private TextField company_input;
	private TextField link_input;
	private TextField date_input;
	private JButton add;
	private JobTracker jt = new JobTracker("Users\\bakerz\\eclipse-workspaces\\JobTracker\\src\\jt.csv");
	

	public AppUi() {
		f.setLayout(new FlowLayout());
		
		f.setTitle("Job Tracker");
		f.setSize(windowX, windowY);
		
		Label c = new Label("Company:");
		f.add(c); 
		
		company_input = new TextField(10);
		f.add(company_input);
		
		Label l = new Label("Link:");
		f.add(l);
		
		link_input = new TextField(10);
		f.add(link_input);
		
		Label d = new Label("Date:");
		f.add(d);
		
		date_input = new TextField(10);
		f.add(date_input);
		
		add = new JButton("add job");
		add.setLocation(0,0);
		add.setSize(10,10);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String company = company_input.getText();
				String link = link_input.getText();
				String date = date_input.getText();
				
				Job job = new Job(company, link, date);
				jt.addJob(job);
				System.out.println("Job Added!");
				
				company_input.setText("");
				link_input.setText("");
				date_input.setText("");
			}
		});
		f.add(add);
		
		f.addWindowListener(this);
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		AppUi u = new AppUi();
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	/*
	 * not currently in use
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
