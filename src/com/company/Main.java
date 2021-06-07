package com.company;

public class Main {

    private static SquareOfBoard[][] square = new SquareOfBoard[4][4];


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

        gameBoard();


    }

    //GAME BOARD
    public static void gameBoard(){
        for(int i =0 ; i < 4 ; i++){
            System.out.println("********************");
            for(int j=0 ; j < 4 ; j++){
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
