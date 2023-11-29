import java.util.Random;
import java.util.ArrayList;
class Player{
    String name;
    int posi;
    int moves;
    ArrayList<Integer> track;

    //UC1(Initializing player with posi 0)
    public Player(String name){
        this.name = name;
        this.posi = 0;
        this.moves = 0;
        this.track = new ArrayList<>();
        this.track.add(0);

    }
    

    public int roll(){
        //UC2(Rolled the dice)
        Random random = new Random();
        int result = random.nextInt(6) + 1;
        //UC3(Checking for No play, Ladder, Snake)
        int checker = random.nextInt(3)+1;

        switch (checker) {
            case 1://No play
                break;
            
            case 2://Ladder
                //UC5(Player getting exact 100)
                if(this.posi + result<=100){
                    this.posi+=result;
                }
                break;
            case 3://Snake
                if(this.posi-result<0){
                    this.posi = 0;
                }
                else{
                    this.posi = this.posi-result;
                }

                break;
        }
        this.track.add(posi);
        this.moves++;
        return checker;
    }
    public boolean checkgame(){
        if(this.posi==100){
            return true;
        }
        return false;
    }
    //UC6(Printing number of moves and location of dice at every turn)
    public void printmoves(){
        System.out.println("Number of moves for player "+this.name+" to win were:- "+this.moves);
        System.out.println("And the location of dice was:- "+this.track.toString());
    }
}