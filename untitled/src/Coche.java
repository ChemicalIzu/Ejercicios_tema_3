public class Coche {
    public int numPuertas;
    public int numDoor;


    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
        numDoor();
        System.out.println(" El coche tiene " + (numPuertas + 1)+ " puertas");
    }

    public int getNumPuertas() {return numPuertas;}

    public void setNumPuertas(int numPuertas) {this.numPuertas = numPuertas;}

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public int numDoor() {
        return numPuertas;
    }


}

