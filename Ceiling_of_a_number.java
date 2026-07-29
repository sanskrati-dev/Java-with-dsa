import java.util.Scanner;
class Ceiling_of_a_number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int target=sc.nextInt();
int[] arr={1,2,3,4,6,7};
int ans= Binary(arr,target);
System.out.print(ans);}

static int Binary(int[] arr,int target){
int start=0;
int end=arr.length-1;
while(start<=end){
int mid=(start+end)/2;
if(target==arr[mid]){
return mid;}
if(target>arr[mid]){
start=mid+1;}
else if(target<arr[mid]){
end=mid-1;}
}
 return( arr[start]);
}}