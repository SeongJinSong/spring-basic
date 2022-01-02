package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;//1000원 할일

    @Override
    public int disocunt(Member member, int price) {
        if(member.getGarde() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
