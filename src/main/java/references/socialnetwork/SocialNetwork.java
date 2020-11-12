package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        Member member = new Member(name);
        members.add(member);
    }

    public void connect(String name, String anotherName) {
        Member member1 = findByName(name);
        Member member2 = findByName(anotherName);
        member1.connectMember(member2);
    }

    public List<String> bidirectionalConnections() {
        List<String> bidirectionalConnection = new ArrayList<>();
        for(Member member1 : members) {
            for(Member member2 : member1.getConnections()) {
                if(member2.getConnections().contains(member1)) {
                    bidirectionalConnection.add(member1.getName() + " - " + member2.getName());
                }
            }
        }
        return bidirectionalConnection;
    }

    private Member findByName(String name) {
        Member foundMember = null;
        for(Member member : members) {
            if(member.getName().equals(name)) {
                foundMember = member;
            }
        }
        return foundMember;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
