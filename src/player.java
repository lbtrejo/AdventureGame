public class player {
    private String name;
    private short healthPoints = 100;
    private short attackPower = 15;

    public player(String playerName){
        this.name = playerName;
    }

    public String getName(){
//        System.out.println("name = " + this.name);
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void drinkPotion(){
        if (this.healthPoints + 20 >= 100){
            System.out.printf("Player health: %d", 100);
        } else {
            System.out.printf("Player health: %d", (this.healthPoints + 20));
        }
    }
}
