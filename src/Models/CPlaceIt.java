package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CPlaceIt extends abPlaceIt {

    List<Category> _cat;
    
	public CPlaceIt() {
		// TODO Auto-generated constructor stub
		super();
		_cat = new ArrayList<Category>();
	}


	public CPlaceIt(String title, String description, ArrayList<Category> clist) {
		// TODO Auto-generated constructor stub
		super(title,description);
		_cat = clist;
	}

	public void setCat(List<Category> clist){
		this._cat = clist;
	}
	
	public List<Category> getCat(){
		return this._cat;
	}

}
