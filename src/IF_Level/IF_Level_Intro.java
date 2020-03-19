package IF_Level;

	import java.awt.Image;
import javax.swing.ImageIcon;

import forms.Phase_Form;
import graphics.Assets;

	public class IF_Level_Intro extends Phase_Form {
		
		public IF_form g;

		public IF_Level_Intro() {
			setTitle("Introduction to the game");
		}
		@Override
		public void setNoOfImages() {
			NoOfImages = Assets.IntroPhaseData_lvl2.length;
			
		}

		@Override
		public void DisplayImg(int i) 
		{
			ImageIcon icon = new ImageIcon(Assets.IntroPhaseData_lvl2[i]);
	        Image img = icon.getImage();
	        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon newImc = new ImageIcon(newImg);
	        pic.setIcon(newImc);
			
		}
		@Override
		public void finish() {
			g = new IF_form();
			g.start();
		}

	}


