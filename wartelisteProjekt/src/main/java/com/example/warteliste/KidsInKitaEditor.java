package com.example.warteliste;

import java.util.List;

import com.vaadin.data.util.BeanItemContainer;

import backend.Child;
import backend.ChildBackend;

public class KidsInKitaEditor extends KidsInKita {
	
	public KidsInKitaEditor(){
	 final List<Child> list= ChildBackend.getChildren();
     final BeanItemContainer<Child> container = new BeanItemContainer<>(Child.class, list);
     accepted.setContainerDataSource(container);
     
	}

}
