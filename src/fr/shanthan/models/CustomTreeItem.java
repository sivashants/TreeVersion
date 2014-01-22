package fr.shanthan.models;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;

public class CustomTreeItem extends com.google.gwt.user.client.ui.Composite{

	private String name;
	private boolean folder;
	private HorizontalPanel panel;
	private com.google.gwt.user.client.ui.Image img;
	public CustomTreeItem(String name, boolean folder) {
		panel=new HorizontalPanel();
		this.folder=folder;
		this.name=name;
		if(folder)
			img=new Image("folders.ico");
		else
			img=new Image("files.ico");
		panel.add(img);
		panel.add(new HTML(name));
		
		initWidget(panel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFolder() {
		return folder;
	}
	public HTML gethtml(){
		return new HTML(this.name);
	}

	
	
}
