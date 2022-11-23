package member;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MemberDAO {

    private  Long id;
    private String username;
    private int age;

    public MemberDAO(){

    }

    public MemberDAO(String username, int age) {

        this.username = username;
        this.age = age;
    }


   




}
