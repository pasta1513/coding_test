class Solution {
    public long solution(int price, int money, int count) {
        long entire_price = 0;
        
        for (int i=1; i<=count; i++) {
            entire_price += i * price;
        }
        
        return money-entire_price<0 ? entire_price-money : 0;
    }
}