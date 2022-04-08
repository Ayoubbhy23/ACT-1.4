public class Mat {
private int id;
private int volume;
private String couleur;

Mat(){
}

Mat(int id, int volume,String couleur){
this.id = id;
this.volume=volume;
this.couleur=couleur;
}

public int getId() {
return this.id;
}

public void setId(int id) {
this.Id = id;
}


}