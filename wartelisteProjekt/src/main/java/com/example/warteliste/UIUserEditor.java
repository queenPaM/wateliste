package com.example.warteliste;

import java.util.List;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import backend.Child;
import backend.ChildBackend;



public class UIUserEditor extends UIUser{
	
	
	public UIUserEditor(){
			//Läd die Array Liste aus ChildBackend
		   final List<Child> list= ChildBackend.getChildren();
		   
		   //pckt die Child Liste in einen BeanItem Container (diesen kann man dann in das Grid(artTabelle)rein packen)
	       final BeanItemContainer<Child> container = new BeanItemContainer<>(Child.class, list);
	       //verbindet Grid und Bean Item Container
	       kindListe.setContainerDataSource(container);
	       //entfehrnt EINE Bestimte Reihe aus der Tabelle
	       //kindListe.removeColumn("note");
	       //alle Spalten die angezeight werden sollen plus Reihenfolge
	       kindListe.setColumns("name","surname","address");
	       gender.addItems("Junge", "Mädchen", "Alle");
	       accepted.addItems("nicht Angenommen", "Angenommen", "Alle");
	       
	       //Click listener für die Kind Tabelle
	       kindListe.addItemClickListener(new ItemClickEvent.ItemClickListener() {
	    
	    	   private Alignment TOP_RIGHT;

			@Override
	    	    
	    	    public void itemClick(ItemClickEvent itemClickEvent) {
	    		   //öffnet ein Window mit der Id des geklicken objekts
	    	        final Window window = new Window(itemClickEvent.getItemId().toString());
	    	        
	    	        
	    	        
	    	        Button save = new Button("Speichern");
	    	        save.setStyleName("friendly");
	    	        save.addClickListener(new Button.ClickListener() {
	    	            public void buttonClick(ClickEvent event) {
	    	                Notification.show("You pressed Save");
	    	            }
	    	        });
	    	        
	    	        Button cancel = new Button("Abbrechen");
	    	        cancel.setStyleName("danger");
	    	        cancel.addClickListener(new Button.ClickListener() {
	    	            public void buttonClick(ClickEvent event) {
	    	               // Notification.show("Do not press this button again");
	    	                window.close();
	    	            }
	    	        });
	    	        
	    	        //final FormLayout content = new FormLayout();
	    	        //final Label label = new Label(itemClickEvent.getButtonName().toString());
	    	        final VerticalLayout layout = new VerticalLayout();
	    	        final HorizontalLayout buttonlayout = new HorizontalLayout();
	    	        buttonlayout.setSpacing(true);
	    	        buttonlayout.setMargin(true);
	    	        
	    	        final KindBearbeiten2 windowKind = new KindBearbeiten2();
	    	       
	    	        
	    	        buttonlayout.addComponents(save, cancel);
	    	        layout.addComponents(windowKind, buttonlayout);
	    	        layout.setComponentAlignment(buttonlayout, Alignment.TOP_RIGHT);
	    	        	    	        
	    	        window.setContent(layout);
	    	        
	    	        window.setModal(true);
	    	        window.setClosable(false);
	    	        
	    	        window.setResizable(false);
	    	       
	    	        UI.getCurrent().addWindow(window);
	    	        
	    	        
	    	    }
	    	});
	       //kindListe.setEditorEnabled(true);
	}
}

