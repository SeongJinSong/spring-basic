package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void autoWiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{
        @Autowired(required = false) //의존관계가 없으면 수정자 메서드 자체가 호출이 안된다.
        public void setNoBean1(Member member){
            System.out.println("setNoBean1 = " + member);
        }
        @Autowired
        public void setNoBean2(@Nullable Member member){
            System.out.println("setNoBean2 = " + member);
        }
        @Autowired
        public void setNoBean2(Optional<Member> member){
            System.out.println("setNoBean3 = " + member);
        }
    }
}
