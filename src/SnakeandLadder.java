public class SnakeandLadder{
    public static void main(String[] args) {

        //UC7 Playing with two players
        Player p1 = new Player("Himanshu");
        Player p2 = new Player("Shiva");
        boolean turn = true; //True means turn of himanshu

        while(true){
            if(turn==true){
                int checker = p1.roll();
                //UC4 playing till position becomes 100
                if(p1.checkgame()==true){
                    System.out.println("Congrats Himanshu! you won the game");
                    p1.printmoves();
                    break;
                }
                if(checker!=2){
                    turn = false;
                }
            }
            else{
                int checker = p2.roll();
                if(p2.checkgame()==true){
                    System.out.println("Congrats Shiva! you won the game");
                    p2.printmoves();
                    break;
                }
                if(checker!=2){
                    turn = true;
                }
            }
        }

    }
}