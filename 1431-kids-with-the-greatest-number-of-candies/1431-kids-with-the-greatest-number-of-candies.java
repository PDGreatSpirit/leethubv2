class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int x = Arrays.stream(candies).max().getAsInt();
        List<Boolean> greatestAmong = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= x){
                greatestAmong.add(true);
            } else {
                greatestAmong.add(false);
            }

        }
        return greatestAmong;
    }
}