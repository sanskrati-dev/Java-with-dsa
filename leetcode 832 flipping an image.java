class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    
        for(int i=0;i<image.length;i++){
            
            int start=0;
                int end=image[i].length-1;
            while(start<end){
                
               
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]= temp;
                start++;
                end--;

            }

        }
        for(int j=0;j<image.length;j++){
            for(int d=0;d<image.length;d++){
                if(image[j][d]==0)
                image[j][d]=1;
                else if(image[j][d]==1)
                image[j][d]=0;
 
            }
        }
        return image;
        
    }
}