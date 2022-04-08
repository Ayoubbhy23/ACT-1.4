public class Pont {
private int id;
private Voile voile;
private int volume;
private String couleur;

Pont(int id, Voile voile){
this.id = id;
this.voile = voile;
}

Pont(int id,Voile voile,String couleur){
this.id=id;
this.voile=voile;
this.volume=volume;
this.couleur=couleur;
}

public int getId() {
return this.id;
}

public void setId(int id) {
this.Id = id;
}

public Voile getVoile() {
return this.Voile;
}

public void setVoile(Voile voile) {
this.Voile = voile;
}

public String toString() {
return "Le pont n" + this.id + " est constitué de la Voile n " + this.voile.getId();
}
}