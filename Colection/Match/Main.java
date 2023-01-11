package Colection.Match;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Team> teams= new ArrayList<>();
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Trabzonspor"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Başakşehir"));

        ArrayList<Fixture> fixtureArrayList = Fixture.FixtureGenerator(teams);
        Fixture.print(fixtureArrayList);


    }
}
