package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MediaModel;
import view.MediaView;


public class MediaController {
	private MediaModel model;
	private MediaView view;
	
	public MediaController(MediaView view, MediaModel model) {
		this.view = view; 
		this.model = model; 
		
		this.view.MediaListener(new MediaListener());
	}
	
	class MediaListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			double numero1 = 0;
			double numero2 = 0;
			double numero3 = 0;
			double numero4 = 0;
			
			try { 
				numero1 = view.getNUmero1();
				numero2 = view.getNUmero2();
				numero3 = view.getNUmero3();
				numero4 = view.getNUmero4();
				
				model.calcularMedia(numero1, numero2, numero3, numero4);
				
				view.setResultado(model.retornarResultado());
				
			} catch(NumberFormatException ex) {
				view.displayErrorMessage("teste");
			}
		}
	}

}
