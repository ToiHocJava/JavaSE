/**
 * #######################################
 * ProjectName: JavaSE
 * PackageName: chapter02
 * FileName: ImageViewer.java
 * GitHub: https://github.com/ToiHocJava/JavaSE
 * GitInfo: qwerty | tinhcx@gmail.com
 * CreatedTime: Jan 21, 2017 | 6:44:25 AM
 * #######################################
 */
package chapter02;

import java.awt.MenuBar;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.sun.javafx.event.EventQueue;

/**
 * @author w
 *
 */
public class ImageViewer {

	/**
	 * 
	 */
	public ImageViewer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(() -> {
			J
		}	
		);

	}
	/**
	 * A frame with a label to show an image
	 */
	class ImageViewerFrame extends JFrame
	{
		private JLabel label;
		private JFileChooser chooser;
		private static final int DEFAULT_WIDTH=300;
		private static final int DEFAULT_HEIGHT=400;
		
		public ImageViewerFrame()
		{
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			
//			Use a label to display the images;
			label = new JLabel();
			add(label);
			
//			setup a file choose;
			chooser =  new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			
//			setup the menu bar
			JMenu menuBar =  new JMenu("File");
			setJMenuBar(menuBar);
			
			JMenu menu = new JMenu("File");
			menuBar.add(menu);
			
			JMenuItem openItem = new JMenuItem("Open");
			menu.add(openItem);
			
			openItem.addActionListener(event -> {
//				show file chooser dialog;
				int result = chooser.showOpenDialog(null);
				
//				if file selected, set it as icon of the label
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}				
			});
			//
			
			
		}
	}

}
