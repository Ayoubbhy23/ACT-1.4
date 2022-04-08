public class Voile{
private int id;
public int largueur ;
private int longueur ; 
private int hauteur ; 
protected String couleur;
private boolean enroule;
private boolean deroule;

Voile(int id){
this.id = id;
}

Voile(int id, int largueur,int longueur,int hauteur,String couleur,boolean enroule,boolean deroule){
this.id = id;
this.largueur=largueur;
this.longueur=longueur;
this.couleur=couleur;
this.hauteur=hauteur;
this.enroule=enroule;
this.deroule=deroule;
}

public int getId() {				
return this.id;
}

public void setId(int id) {
this.id = id;
}

boolean enrouler(Boolean enroule){ 
this.enroule = enroule; // maj
}

boolean derouler(Boolean deroule){ 
this.deroule = deroule;
}
}