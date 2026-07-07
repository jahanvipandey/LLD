
class Player{
    String name;
    String address;
}

// Aggregation - Object creation in not controlled by another class.

class Team1 {
    Player p;

    void setPalyer(Player p){
        this.p = p
    }
}

// Composition - object creation happnes inside the class, if that class dosent exist then object is not created.
class Team2 {
    Player p;

    void setPalyer(String name, String address){
        this.p = new Player(name, address);
    })
}


class Relationship {
    public static void main(String[] args){
        // Aggregation
        Player p1 = new Player();
        Team1 t1 = new Team1();
        t1.setPalyer(p1);

        // Composition
        Team2 t2 = new Team2();
        t2.setPalyer("Messi", "Argentina");
    }

}
