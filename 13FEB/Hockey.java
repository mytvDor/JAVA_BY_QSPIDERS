import java.util.Scanner;
class Hockey {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("ENTER THE NUM");
String plr = sc.next();

int onecnt=0;

int zerocnt=0;

//if(plr.length()==0) return;

for(int i=0; i<=plr.length()-1; i++){

if(plr.charAt(i)=='1'){
zerocnt=0;
onecnt++;
if(onecnt>=7) {System.out.println("YES");
break;

};
}

if(plr.charAt(i)=='0'){
onecnt=0;
zerocnt++;
if(zerocnt>=7){ System.out.println("YES");
break;}

}
}

if(zerocnt<7 && onecnt<7 ) System.out.println("NO");


 }
}