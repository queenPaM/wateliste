package com.example.warteliste;


import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.MenuBar.MenuItem;

public class MenuEditor extends menu {

	
	public MenuEditor(){
	// A feedback component
	final Label selection = new Label("-");
	

	// Define a common menu command for all the menu items.
	MenuBar.Command mycommand = new MenuBar.Command() {
	    public void menuSelected(MenuItem selectedItem) {
	    	 selection.setValue("Du hast die " +
                     selectedItem.getText() +
                     " Kita ausgewählt");
	    }  
	};
	
	
	MenuBar.Command logOutFunction = new MenuBar.Command() {
	    public void menuSelected(MenuItem selectedItem) {
	        selection.setValue("Ordered a " +
	                           selectedItem.getText() +
	                           " from menu.");
	        getSession().setAttribute("user", null);

            // Refresh this view, should redirect to login view
            getUI().getNavigator().navigateTo(MainView.NAME);
	    }  
	};

		      
		      
		  
	
	// Put some items in the menu hierarchically
	
	MenuBar.MenuItem logOut =
		menub.addItem("Abmelden", null, logOutFunction);
	//Fals oben der User Angezwigt werden soll
	//logOut.addItem("Abmelden", null, null);


	// Fals wir die Einrichtung auswahl haben wollen
	MenuBar.MenuItem einrichtung =
	    menub.addItem("Einrichtung", null, null);
	einrichtung.addItem("Poßmoorweg", null, mycommand);
	einrichtung.addItem("Krämerstieg", null, mycommand);
	einrichtung.addItem("Fuhsbüttler Straße", null, mycommand);


      addComponent(selection);
      
}
}
