/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author rudra
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class BlackJack extends Game {

  public static void main(String[] args) {
    BlackJack app = new BlackJack("BlackJack");
    app.play();
  }

  public BlackJack(String givenName) {
    super("BlackJack");
  }

  @Override
  public void  play() {
    Output output = new Output();
    Input input = new Input(output);
    output.Name();
    output.greeting(input.getName());
    output.Cash();
    
    User user = new User();
    Dealer dealer = new Dealer();
    user.setCash(input.getCash());
    
    while (user.getCash() > 0) {
      GroupOfCards deck = new GroupOfCards(52);

      deck.shuffle();
      user.getNewHand(deck);
      dealer.getNewHand(deck);

      output.CashShow(user.getCash());
      output.askForBet();

      user.setBet(input.getBet(user.getCash()));
      user.setCash(user.getCash());

      output.CashShow(user.getCash());
      output.BetShow(user.getBet());
      output.showHand(user);
      output.showDealerFirstCard(dealer);
      System.out.println("Your Hand Value is:" + user.getHand(1).getHandValue());

      if (user.hasBlackJack(1) && dealer.hasBlackJack(1)) {
        output.userBlackJack();
        output.dealerBlackJack();
        output.push();
        user.push();
      } else if (user.hasBlackJack(1)) {
        user.blackJack();
        output.userBlackJack();
        output.showDealerHand(dealer);
        output.win();
      } else if (dealer.hasBlackJack(1)) {
        output.dealerBlackJack();
        output.showDealerHand(dealer);
        output.lose();
      } else {
          
        output.hitOrStand();
        while (input.choiceisHit()) {
          user.getHand(1).Hit(deck);
          output.showHand(user);
          System.out.println(user.getHand(1).getHandValue());
          output.hitOrStand();
          if (user.hasBusted()) {
            output.busted();
            output.lose();
            break;
          }
        }
        if (!user.hasBusted()) {
          System.out.println(dealer.takeTurn(deck));
          output.showDealerHand(dealer);
          if (dealer.hasBusted()) {
            output.dealerBusted();
            System.out.println("Dealer hand value was" + dealer.getHand(1).getHandValue());
            output.win();
            user.win();
          } else {
            if ((21 - user.getHand(1).getHandValue()) < (21 - dealer
                .getHand(1).getHandValue())) {
              output.win();
              user.win();
              System.out.println("Your Hand Value is:" + user.getHand(1).getHandValue());
            }
            if ((21 - user.getHand(1).getHandValue()) == (21 - dealer
                .getHand(1).getHandValue())) {
              output.push();
              user.push();
              System.out.println("Your Hand Value is:" + user.getHand(1).getHandValue());
            }
            if ((21 - user.getHand(1).getHandValue()) > (21 - dealer
                .getHand(1).getHandValue())) {
              output.lose();
              System.out.println("Your Hand Value is:" + user.getHand(1).getHandValue());
            }
          }
        }
      }
      output.CashShow(user.getCash());
      output.playAgain();
      if (!input.choiceIsYes()) {
        break;
      }

    }
    if (user.getCash() == 0) {
      output.cashTotalZero(user.getCash());
    }
    output.cashTotal(user.getCash());
    
  }

  public class Output {

    Output() {
    }

    public void Name() {
      System.out.println("Hi! Enter your name?");
    }

    public void greeting(String name) {
      System.out.println("Hello, " + name + ", let's play Blackjack!");
    }

    public void Cash() {
      System.out.println("How much cash do you want to start with?");
    }

    public void StartCash(int cash) {
      System.out.println("You started the game with cash: " + cash);
    }

    public void CashShow(int cash) {
      System.out.println("Cash on hand: " + cash);
    }

    public void cannotBet() {
      System.out.println("You cannot bet more money than you have!");
    }

    public void askForBet() {
      System.out.println("How much would you like to bet?");
    }

    public void BetShow(int bet) {
      System.out.println("Money on the table: " + bet);
    }

    public void showHand(User user) {
      System.out.println("Here is your hand: ");
      System.out.println(user.getHand(1));
    }

    public void showDealerFirstCard(Dealer dealer) {
      System.out.println("The dealer is showing:");
      Hand hand = dealer.getHand(1);
      System.out.println(hand.getCard(1));
    }
    

    public void showDealerHand(Dealer dealer) {
      System.out.println("Here is the dealer's hand:");
      System.out.println(dealer.getHand(1));
    }

    public void yesOrNo() {
      System.out.println("Please answer yes or no.");
    }

    public void dealerBlackJack() {
      System.out.println("The dealer has Blackjack!");
    }

    public void userBlackJack() {
      System.out.println("You have BlackJack!");
      System.out.println("You win 2x your money back!");
    }

    public void win() {
      System.out.println("Congratulations, you win the game!");
    }

    public void lose() {
      System.out.println("Sorry, you lose! Better luck next time");
    }

    public void push() {
      System.out.println("It's a push!");
      System.out.println("You get your money back.");
    }

    public void hitOrStand() {
      System.out.println("Would you like to hit or stay?(hit/stand)");
    }

    public void enterHitorStand() {
      System.out.println("Please enter hit or stand.");
    }

    public void playAgain() {
      System.out.println("Would you like to play again?(yes/no)");
    }

    public void cashTotal(int cash) {
      System.out.println("Your total cash is: " + cash);
      System.out.println("Enjoy your winnings!");
    }

    public void cashTotalZero(int cash) {
      System.out.println("Your total cash is: " + cash);
      System.out.println("You are out of cash!");
    }

    public void busted() {
      System.out.println("You busted!");
    }

    public void dealerBusted() {
      System.out.println("The dealer busted!");
    }
  }

  public class Input {

    private Output op;

    Input(Output outputs) {
      op = outputs;
    }

    public String getName() {
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      return name;
    }

    public int getCash() {
      Scanner money = new Scanner(System.in);
      int cash = money.nextInt();
      return cash;
    }

    public int getBet(int cash) {
      Scanner sc = new Scanner(System.in);
      int bet = sc.nextInt();
      while (bet > cash) {
        op.cannotBet();
        op.askForBet();
        bet = sc.nextInt();
      }
      return bet;
    }

    public boolean choiceIsYes() {
      Scanner doubledown = new Scanner(System.in);
      String doubled = doubledown.nextLine();
      while (!isyesorno(doubled)) {
        op.yesOrNo();
        doubled = doubledown.nextLine();
      }
      return doubled.equals("yes");
    }

    public boolean isyesorno(String answer) {
      return (answer.equals("yes") || answer.equals("no"));
    }

    public boolean choiceisHit() {
      Scanner hitter = new Scanner(System.in);
      String hit = hitter.nextLine();
      while (!ishitorstand(hit)) {
        op.yesOrNo();
        hit = hitter.nextLine();
      }
      return hit.equals("hit");
    }

    public boolean ishitorstand(String hit) {
      return (hit.equals("hit") || hit.equals("stand"));
    }

  }

}

