package com.bunny.android.lotterypicker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class gameNumbers extends ArrayList<Integer> {

      public ArrayList setPick3() {
           ArrayList<Integer>gameList = new ArrayList<>();
            for (int count = 1; count <= 3; count++) {
                Random randomNum = new Random();
                int selectedNum = randomNum.nextInt(9);
                gameList.add(selectedNum);
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setPick4(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 4; count++) {
                Random randomNum = new Random();
                int selectedNum = randomNum.nextInt(9);
                gameList.add(selectedNum);
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setCash5(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 5; count++) {
                Random randomNumber = new Random();
                int selectedNum = randomNumber.nextInt(34) + 1;
                boolean sameNumber = gameList.contains(selectedNum);
                if (!sameNumber) {
                    gameList.add(selectedNum);
                } else {
                    count--;
                }
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setPowerBall(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 6; count++) {
                if(count == 6){
                    Random lastPick = new Random();
                    int powerBallPick = lastPick.nextInt(26)+1;
                    gameList.add(powerBallPick);
                    break;
                }
                Random randomNumber = new Random();
                int selectedNum = randomNumber.nextInt(69) + 1;
                boolean sameNumber = gameList.contains(selectedNum);
                if (!sameNumber) {
                    gameList.add(selectedNum);
                } else {
                    count--;
                }
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setMegaMillion(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 6; count++) {
                if(count == 6){
                    Random lastPick = new Random();
                    int megaBallPick = lastPick.nextInt(25)+1;
                    gameList.add(megaBallPick);
                    break;
                }
                Random randomNum = new Random();
                int selectedNum = randomNum.nextInt(70) + 1;
                boolean sameNumber = gameList.contains(selectedNum);
                if (!sameNumber) {
                    gameList.add(selectedNum);
                } else {
                    count--;
                }
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setCash4Life(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 6; count++) {
                if(count == 6){
                    Random lastPick = new Random();
                    int cashBallPick = lastPick.nextInt(4)+1;
                    gameList.add(cashBallPick);
                    break;
                }
                Random randomNum = new Random();
                int selectedNum = randomNum.nextInt(60) + 1;
                boolean sameNumber = gameList.contains(selectedNum);
                if (!sameNumber) {
                    gameList.add(selectedNum);
                } else {
                    count--;
                }
                Collections.sort(gameList);
            }
            return gameList;
        }
        public ArrayList setBankAmillion(){
          ArrayList<Integer> gameList = new ArrayList<>();
            for (int count = 1; count <= 6; count++) {
                Random randomNum = new Random();
                int selectedNum = randomNum.nextInt(40) + 1;
                boolean sameNumber = gameList.contains(selectedNum);
                if (!sameNumber) {
                    gameList.add(selectedNum);
                } else {
                    count--;
                }
                Collections.sort(gameList);
            }
            return gameList;
        }

    }

