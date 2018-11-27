package gi.view;

import javax.swing.JFrame;
import gui.controller.*;

public class SampleFrame extends JFrame 
{
	private GuiController appController;
	private SamplePanel appPanel;
	
	public SampleFrame(GuiController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Second GUI App");
		this.setResizable(false);
		this.setVisible(true);
	}
}

