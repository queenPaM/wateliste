package com.example.warteliste;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;



public class MainView extends CustomComponent implements View {
	
	

    public static final String NAME = "";

    Label text = new Label("hello");

      
    public MainView() {
    	
    }

    @Override
    public void enter(ViewChangeEvent event) {
    	
        
    	VerticalLayout layout = new VerticalLayout();
    	HorizontalLayout tabellenlayout = new HorizontalLayout();
    	MenuEditorSuperUser menuSuperUser = new MenuEditorSuperUser();

    	MenuEditor menu = new MenuEditor();

    	// Get the user name from the session
    	String username = String.valueOf(getSession().getAttribute("user"));
    	String superUser = "test@test.com";
    	//JENDRIK, if abfrage erkennt test@test.com leider nciht, daher ruft er immer menu auf statt menuSuperUser
    	if(username == superUser){
    		layout.addComponent(menuSuperUser);
    	}else{
    		layout.addComponent(menu);
    	}
    	
    	UIUserEditor warteliste = new UIUserEditor();
    	KidsInKitaEditor angemeldetView = new KidsInKitaEditor();
    	
        text.setValue("Hello " + username);
    	tabellenlayout.addComponents(warteliste, angemeldetView);
    	layout.addComponents(text, tabellenlayout);
    	layout.setComponentAlignment(tabellenlayout, Alignment.TOP_CENTER);
        setCompositionRoot(layout);
        

    }
}
