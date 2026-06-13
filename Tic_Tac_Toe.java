import java.util.Scanner;
class Tic_Tac_Toe{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
char[][] grid=new char[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
grid[i][j]=' ';

if(j<2){
System.out.print(" "+grid[i][j]+"|");
}
else if(j==2){
System.out.print(" "+grid[i][j]);
}
}
if(i<2){
System.out.println();
System.out.print("_________\n");

}}
System.out.println();}}