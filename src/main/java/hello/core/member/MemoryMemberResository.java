package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberResository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();
    //동시성을 위해 concurrentHashMap을 사용해야한다.

    @Override
    public void save(Member member){
        store.put(member.getId(), member);
    }
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
