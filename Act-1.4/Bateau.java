public class Bateau {
private int id;
private Coque coque;
private Cabine cabine;
private Pont pont;
private Mat mat;
private int age;
private int volume;

Bateau(int id, Coque coque, Cabine cabine, Pont pont) {
this.id = id;
this.coque=coque;
this.cabine=cabine;
this.pont=pont;
}

Bateau (int id, Coque coque, Cabine cabine, Pont pont, int age, int volume) {
this.id = id;
this.coque=coque;
this.cabine=cabine;
this.pont=pont;
this.age=age;
this.volume=volume;
}

public int getId() {				//pour chaque attribut get et set
return this.id;
}

public void setId(int id) {
this.id = id;
}

public int getCoque() {				//pour chaque attribut get et set
return this.coque;
}

public void setCoque(Coque coque) {
this.coque = coque;
}

public int getCabine() {
return this.cabine;
}

public void setCabine(Cabine cabine) {
this.cabine = cabine;
}

public int getPont() {
return this.pont;
}

public void setPont(Pont pont) {
this.pont = pont;
}


public String toString() {
   return "Le bateau n" + this.id + " est constitué de: \n"+ coque.toString()
+ "\n" + this.cabine.toString() + "\n" + this.pont.toString();
}
}
} 