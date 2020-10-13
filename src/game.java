import utils.Input;

import java.util.Arrays;

public class game {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to AdventureGame");
        Input input = new Input();
        boolean begin = input.yesNo("Are you ready to begin?  [yes/no]");
        if (begin){
            player player1 = new player(input.getString("What is your name, player?"));
            System.out.printf("Nice to meet you, %s!", player1.getName());
        } else {
            System.out.println("Have a good one!");
        }
    }
}
