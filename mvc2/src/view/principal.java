package view;

import controller.MediaController;
import model.MediaModel;

public class principal {
	public static void main(String[] args) {
		MediaView view = new MediaView(); 
		MediaModel model = new MediaModel(); 
		MediaController controller = new MediaController(view, model); 
		
		view.setVisible(true);
	}
}
