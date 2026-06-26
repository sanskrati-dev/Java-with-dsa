class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> res=new ArrayList<>();
       
        for(int i=0;i<candies.length;i++){
                boolean max=false;
            int ind=candies[i]+extraCandies;

            for(int j=0;j<candies.length;j++){
               
                if(ind<candies[j]){
                max=false;
                break;}
                else
                max=true;
            
               
            } 
            res.add(max);
        }
        return res;
        
    }
}