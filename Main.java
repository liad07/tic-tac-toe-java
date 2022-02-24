package com.company;

import java.util.Scanner;

public class Main {
    public static int checkwin(char[][]board){
        int count=0;
        if (board[1][1]=='o'&&board[1][2]=='o'&&board[1][3]=='o'){
            System.out.println("o win");
            count++;
        }
        if (board[2][1]=='o'&&board[2][2]=='o'&&board[2][3]=='o'){
            System.out.println("o win");
            count++;
        }
        if (board[3][1]=='o'&&board[3][2]=='o'&&board[3][3]=='o'){
            System.out.println("o win");
            count++;

        }
        if (board[1][1]=='o'&&board[2][1]=='o'&&board[3][1]=='o'){
            System.out.println("o win");
            count++;
        }
        if (board[1][2]=='o'&&board[2][2]=='o'&&board[3][2]=='o'){
            System.out.println("o win");
            count++;

        }
        if (board[1][3]=='o'&&board[2][3]=='o'&&board[3][3]=='o'){
            System.out.println("o win");
            count++;

        }
        if (board[1][1]=='o'&&board[2][2]=='o'&&board[3][3]=='o'){
            System.out.println("o win");
            count++;
        }
        if (board[1][3]=='o'&&board[2][2]=='o'&&board[3][1]=='o'){
            System.out.println("o win");
            count++;
        }

        if (board[1][1]=='x'&&board[1][2]=='x'&&board[1][3]=='x'){
            System.out.println("x win");
            count++;
        }
        if (board[2][1]=='x'&&board[2][2]=='x'&&board[2][3]=='x'){
            System.out.println("x win");
            count++;
        }
        if (board[3][1]=='x'&&board[3][2]=='x'&&board[3][3]=='x'){
            System.out.println("x win");
            count++;

        }
        if (board[1][1]=='x'&&board[2][1]=='x'&&board[3][1]=='x'){
            System.out.println("x win");
            count++;

        }
        if (board[1][2]=='x'&&board[2][2]=='x'&&board[3][2]=='x'){
            System.out.println("x win");
            count++;

        }
        if (board[1][3]=='x'&&board[2][3]=='x'&&board[3][3]=='x'){
            System.out.println("x win");
            count++;

        }
        if (board[1][1]=='x'&&board[2][2]=='x'&&board[3][3]=='x'){
            System.out.println("x win");
            count++;

        }
        if (board[1][3]=='x'&&board[2][2]=='x'&&board[3][1]=='x'){
            System.out.println("x win");
            count++;
        }
        return count;
    }
    public static void prind_arr(char[][] arr)
    {
        for(int i =1;i<=3;i++)
        {
            for(int j =1;j<=3;j++)
            {
                System.out.print(" |"+arr[i][j]+"|");
            }
            System.out.println("\n------------");
        }
    }
    public static boolean checkspace(char[][]arr){
        boolean ret = false;
        for(int i =1;i<=3;i++)
        {
            for(int j =1;j<=3;j++)
            {
                if(arr[i][j]=='o'||arr[i][j]=='x'){
                    ret=true;
                }
            }
        }
        return ret;

    }

    public static Scanner reader=new Scanner (System.in);
    public static void main(String[] args) {
        int game = 0;
        int turn = 1;
        char tur;
        System.out.println(" |1| |2| |3|");
        System.out.println("------------");
        System.out.println(" |4| |5| |6|");
        System.out.println("------------");
        System.out.println(" |7| |8| |9|");
        System.out.println("------------");
        char[][] board = new char[4][4];
        char ch = '1';

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                board[i][j] = ch++;
            }
        }

        while (true) {
            if (turn % 2 == 1) {
                tur = 'x';

            } else {
                tur = 'o';

            }

            System.out.println("now turn " + tur);
            System.out.println("where to put");
            int num = reader.nextInt();

            int row = num / 3;
            int col = num % 3;
            // prind_arr(board);
            row++;

            if (col == 0) {
                col = 3;
                row--;
            }
            System.out.println();

            if (board[row][col] == 'o' || board[row][col] == 'x') {
                System.out.println("Occupancy slot");
                System.out.println();
            }
            else{
                board[row][col] = tur;
            }
            prind_arr(board);

            int checkwin=checkwin(board);
           game++;
           if (checkwin==1){
               break;
           }

           if (checkwin==2){
    System.out.println("double win");
    break;

}
            turn++;
            if (turn==10&&checkwin==0){
                System.out.println("draw");
                break;
            }

        }
        }
    }
