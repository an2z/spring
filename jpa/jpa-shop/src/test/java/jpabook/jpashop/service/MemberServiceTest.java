package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional // 테스트에서 사용시 DB를 자동으로 롤백해줌
public class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
//    @Rollback(false) // 롤백하지 않도록 지정
    public void 회원가입() throws Exception {
        // given
        Member member = new Member();
        member.setName("jolly");

        // when
        Long savedId = memberService.join(member);

        // then
        assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test(expected = IllegalStateException.class) // 해당 예외가 발생해야 함을 지정해줄 수 있다.
    public void 중복_회원_예외() throws Exception {
        // given
        Member member1 = new Member();
        member1.setName("jolly");

        Member member2 = new Member();
        member2.setName("jolly");

        // when
        memberService.join(member1);
        memberService.join(member2); // 이 시점에 예외가 발생해야 함!

        // then
        fail("예외가 발생해야 한다."); // 이 코드로 도달할 경우 실패가 뜬다.
    }

}
