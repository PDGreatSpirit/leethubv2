class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        
        if(flowerbed.length == 1 ){
            if(flowerbed[0] == 1) return false;
            if(flowerbed[0] != 1) return true;
        }
            
        if(flowerbed[0] == flowerbed[1])  {
            flowerbed[0] = 1;
            n--;
            if(n <= 0) return true;
            
        }
        for (int i = 1; i <flowerbed.length-1; i++){
            if(flowerbed[i-1] == flowerbed[i] && flowerbed[i] == flowerbed[i+1]){
                flowerbed[i] = 1;
                n--;
                if(n <= 0) return true;
            }
        }
        if(flowerbed[flowerbed.length-2] == flowerbed[flowerbed.length-1])  {
            flowerbed[flowerbed.length-1] = 1;
            n--;
            if(n <= 0) return true;
        }
        return false;
    }
}