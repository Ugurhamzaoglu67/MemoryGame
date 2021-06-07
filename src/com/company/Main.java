package com.company;

import java.util.Scanner;

public class Main {

    private static SquareOfBoard[][] square = new SquareOfBoard[4][4];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        square[0][0] = new SquareOfBoard('E');
        square[0][1] = new SquareOfBoard('A');
        square[0][2] = new SquareOfBoard('B');
        square[0][3] = new SquareOfBoard('F');
        square[1][0] = new SquareOfBoard('G');
        square[1][1] = new SquareOfBoard('A');
        square[1][2] = new SquareOfBoard('D');
        square[1][3] = new SquareOfBoard('H');
        square[2][0] = new SquareOfBoard('F');
        square[2][1] = new SquareOfBoard('C');
        square[2][2] = new SquareOfBoard('D');
        square[2][3] = new SquareOfBoard('H');
        square[3][0] = new SquareOfBoard('E');
        square[3][1] = new SquareOfBoard('H');
        square[3][2] = new SquareOfBoard('B');
        square[3][3] = new SquareOfBoard('C');



        while(isGameOver() == false){           //False olduğu sürece while dönsün.
            System.out.println("for copy select 1 : ");
            System.out.println("Bring the game board (2) :  ");
            int copySelect = scanner.nextInt();

            switch (copySelect){
                case 1:
                    giveTheCopy(); break;

                case 2:
                    gameBoard();
                    doPredict(); break;

                default:
                    System.out.println("404");
            }


        }


    }

    public static void giveTheCopy(){
        for(int i =0 ; i < square.length ; i++){
            System.out.println("********************");
            for(int j=0 ; j < square.length ; j++){
                    System.out.print("| "+square[i][j].getCurrentValue()+" |");
            }
            System.out.println();
        }
        System.out.println("\n");
    }



    //DO PREDICT
    public static void doPredict(){

        System.out.print("Enter 1st predict of i & j values ( [i][j]  ) :  ");


        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        //Showing your predict
        square[i1][j1].setMyPredict(true);
        gameBoard();


        System.out.print("Enter 2st predict of i & j values ( [i][j]  ) :  ");

        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();



        // COMPARE PREDICTS
        if(square[i1][j1].getCurrentValue() == square[i2][j2].getCurrentValue()){                   //1.predict == 2.predict
            System.out.println("You win . . . ");
            square[i2][j2].setMyPredict(true);                  // Show 2.predict...
        }else {
            System.out.println("Try Again!");                   //1.predict != 2.predict
            square[i2][j2].setMyPredict(false);                 // XXXXXXXXXXXXXX TRY AGAIN
        }



    }


    //IS GAME OVER
    public static boolean isGameOver(){                //if game is over, show blank
        for(int i=0 ; i < square.length ; i++){
            for(int j = 0 ; j < square.length ; j++){

                if(square[i][j].isMyPredict() == false){
                   return false;
                }
            }

        }
        return true;
    }


    //GAME BOARD
    public static void gameBoard(){
        for(int i =0 ; i < square.length ; i++){
            System.out.println("********************");
            for(int j=0 ; j < square.length ; j++){
                if(square[i][j].isMyPredict()){             //Show game board if my guess in current is correct

                    System.out.print("| "+square[i][j].getCurrentValue()+" |");
                }else {                                     //My predict false -> show blank board.
                    System.out.print(" | | ");
                }

            }
            System.out.println();
        }
        System.out.println("********************");
    }
}
