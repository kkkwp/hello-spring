package hello.hellospring.domain;

import javax.persistence.*;

@Entity // ORM mapping
public class Member {

//  pk
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 ID를 자동 생성하는 전략
    private Long id;

//  @Column(name = "username")  // 만약 name이 DB에 username이라는 컬럼으로 저장될 경우
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
