package Colection.Match;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fixture {
    private Team leftSide;
    private Team rightSide;
    private static int totalRounds;
    private static int eachRoundMatches;
    public Fixture(Team leftSide,Team rightSide){
        this.leftSide=leftSide;
        this.rightSide=rightSide;
    }

    public Team getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Team leftSide) {
        this.leftSide = leftSide;
    }

    public Team getRightSide() {
        return rightSide;
    }

    public void setRightSide(Team rightSide) {
        this.rightSide = rightSide;
    }


    public static synchronized ArrayList<Fixture> FixtureGenerator(List<Team> teams) {
        if (teams.size() % 2 != 0) {
            teams.add(new Team("Bay"));
        }

        ArrayList<Fixture> fixtureArrayList = new ArrayList<>();
        ArrayList<Team> tempTeams = new ArrayList<>();
        int totalTeams = teams.size();
        totalRounds = (totalTeams - 1);
        eachRoundMatches = totalTeams / 2;

        Collections.shuffle(teams);

        for (int i = 0; i < totalRounds; i++) {
            for (int j = 0; j < eachRoundMatches; j++) {
                int leftSide = j;
                int rightSide = ((teams.size() - 1) - j);
                fixtureArrayList.add(new Fixture(teams.get(leftSide), teams.get(rightSide)));
            }

            tempTeams.clear();

            tempTeams.add(teams.get(0));
            tempTeams.add(teams.get(teams.size() - 1));

            for (int k = 1; k < teams.size() - 1; k++) {
                tempTeams.add(teams.get(k));
            }

            for (int j = 0; j < eachRoundMatches; j++) {
                int leftSide = j;
                int rightSide = ((tempTeams.size() - 1) - j);
                fixtureArrayList.add(new Fixture(tempTeams.get(rightSide), tempTeams.get(leftSide)));
            }

            teams.clear();
            teams.addAll(tempTeams);
        }

        return fixtureArrayList;
    }

    public static void print(List<Fixture> fixtureList) {
        int round = 1;

        for (int i = 0; i < fixtureList.size(); i++) {
            if (i % eachRoundMatches == 0) {
                System.out.println(" * Round: " + round++);
            }
            System.out.println(fixtureList.get(i).getLeftSide().getTeamName() + " vs. " + fixtureList.get(i).getRightSide().getTeamName());
        }

    }
}