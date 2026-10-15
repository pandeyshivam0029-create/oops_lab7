package labsheet07.question15;

import demo.AccessMembers;

class AccessMembersChild extends AccessMembers {
    void showProtectedMember() {
        System.out.println(protectedMessage);
    }
}

public class Question15AccessTest {
    public static void main(String[] args) {
        AccessMembers members = new AccessMembers();
        System.out.println(members.publicMessage);

        AccessMembersChild child = new AccessMembersChild();
        child.showProtectedMember();
    }
}
