package chapter1;

import java.lang.reflect.Member;

public class Team {
    Member member;

    public Team(Member member) {
        this.member = member;
    }



    public static void main(String[] args) {
        chapter1.Member myMember = new chapter1.Member("Aurieel", "light", 10, 1);
        Team myTeam = new Team((Member) myMember);

    }
}
