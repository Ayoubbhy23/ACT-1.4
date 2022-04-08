public class Coque{ 
privte int id;
private int volume;
private String couleur;

Coque(int id){
this.id = id;
}
Coque(int id, int volume,String couleur){
this.id = id;
this.volume=volume;
this.couleur=couleur;

}

public int getId() {
return this.id;
}

public void setId(int id) {
this.id = id;
}

public String toString() {
return "La coque n" + this.id;
}
}