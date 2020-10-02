//Write a program in Java to create a Player class. Inherit the classes  Cricket Player, Football _Player and Hockey Player from Player class.
class Player
{
  void display()
  {
    System.out.println("Player class!");
  }
}

class Cricket_Player extends Player
{
  void display()
  {
    System.out.println("Cricket_Player class!");
  }
}

class Football_Player extends Player
{
  void display()
  {
    System.out.println("Football_Player class!");
  }
}

class Hockey_Player extends Player
{
  void display()
  {
    System.out.println("Hockey_Player class!");
  }
}

class Two
{
  public static void main(String[] args)
  {
    Player p1 = new Player();
    Cricket_Player c1 = new Cricket_Player();
    Football_Player f1 = new Football_Player();
    Hockey_Player h1 = new Hockey_Player();

    p1.display();
    c1.display();
    f1.display();
    h1.display();
  }
}
