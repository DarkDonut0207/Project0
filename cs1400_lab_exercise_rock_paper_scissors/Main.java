/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs1400_lab_exercise_rock_paper_scissors;
import java.util.Scanner;
/**
 *
 * @author Drake
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Object to handle user input
        char P1Move;
        char P2Move;
        int P1Wins = 0;
        int P2Wins = 0;
        int ties = 0;
        char game = 'n';
        do {
            System.out.println("---Rock, Paper, Scissors---");
            System.out.println("Paper covers Rock, Rock Smashes Scissors, Scissors cuts Paper");
            System.out.println("Make a move of either R for rock, P for paper, or S for scissors.");
            System.out.println("Input move P1: ");
            P1Move = keyboard.next().charAt(0);
            P1Move = Character.toUpperCase(P1Move);
            while (P1Move != 'R' && P1Move != 'P' && P1Move != 'S') {
                System.out.println("P1 did not input a valid move");
                System.out.println("Make a move of either R for rock, P for paper, or S for scissors.");
                System.out.println("Input move P1: ");
                P1Move = keyboard.next().charAt(0);
                P1Move = Character.toUpperCase(P1Move);
            }
            System.out.println("Input move P2: ");
            P2Move = keyboard.next().charAt(0);
            P2Move = Character.toUpperCase(P2Move);
            while (P2Move != 'R' && P2Move != 'P' && P2Move != 'S') {
                System.out.println("P2 did not input a valid move");
                System.out.println("Make a move of either R for rock, P for paper, or S for scissors.");
                System.out.println("Input move P2: ");
                P2Move = keyboard.next().charAt(0);
                P2Move = Character.toUpperCase(P2Move);
            }
            if (P1Move == 'R') {
                if (P2Move == 'R') {
                    System.out.println("Tie");
                    ties++;
                } else if (P2Move == 'P') {
                    System.out.println("P2 Wins");
                    P2Wins++;
                } else if (P2Move == 'S') {
                    System.out.println("P1 Wins");
                    P1Wins++;
                } else {
                    System.out.println("P2 did not input a correct value");
                }
            } else if (P1Move == 'P') {
                if (P2Move == 'R') {
                    System.out.println("P1 Wins");
                    P1Wins++;
                } else if (P2Move == 'P') {
                    System.out.println("Tie");
                    ties++;
                } else if (P2Move == 'S') {
                    System.out.println("P2 Wins");
                    P2Wins++;
                } else {
                    System.out.println("P2 did not input a correct value");
                }
            } else if (P1Move == 'S') {
                if (P2Move == 'R') {
                    System.out.println("P2 Wins");
                    P2Wins++;
                } else if (P2Move == 'P') {
                    System.out.println("P1 Wins");
                    P1Wins++;
                } else if (P2Move == 'S') {
                    System.out.println("Tie");
                    ties++;
                } else {
                    System.out.println("P2 did not input a correct value");
                }
            } else {
                System.out.println("P1 did not input a correct value");
            }
            System.out.println("Start new game? (Enter Y for yes, anything else for no) ");
            game = keyboard.next().charAt(0);
            game = Character.toUpperCase(game);
        } while (game=='Y');
        System.out.println("P1 Won " + P1Wins + " time(s)");
        System.out.println("P2 Won " + P2Wins + " time(s)");
        System.out.println("Game tied " + ties + " time(s)");
    }  
}
