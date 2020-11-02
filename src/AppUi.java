import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Zachary Baker
public class AppUi implements ActionListener, WindowListener {
	private int windowX = 600;
	private int windowY = 600;
	private Frame f = new Frame();

	public AppUi() {
		f.setLayout(new GridLayout());
		
		f.setTitle("Job Tracker");
		f.setSize(windowX, windowY);
		f.addWindowListener(this);
	
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new AppUi();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	/*
	 * not currently in use
	 */
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
