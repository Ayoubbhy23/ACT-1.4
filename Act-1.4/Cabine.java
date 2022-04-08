public class Cabine {
private int id;
private  int volume;
private String couleur;


Cabine(int id){
this.id = id;
}

Cabine(int id, int volume,String couleur){
this.id=id;
this.volume=volume;
this.couleur=couleur;

}

public int getId() {
return this.id;
}

public void setId(int id) {
this.Id = id;
}

public String toString() {
return "La cabine n" + this.id;
}

}