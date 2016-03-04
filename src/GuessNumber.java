import java.util.Scanner;



public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		System.out.println("1-100");
		
		Boolean isFound = true;
		int random = 1+ (int)(Math.random()*100);
		
		int i=1;
		int min=1;
		int max=100;
		String answer;
		
		do{
			while(isFound){
				
				System.out.print(i+">>");
				int guess = sc.nextInt();
				
				if( guess>random ){
					max = guess;
					System.out.println("더 낮게");
					System.out.println(min+"-"+max);
					
				}else if( guess<random ){
					min = guess;
					System.out.println("더 높게");
					System.out.println(min+"-"+max);
				}else{
					isFound = false;
				}
				
				i++;
			}
			
			System.out.println("정답입니다.");
			System.out.println("다시 하시겠습니까?");
			
			answer = sc.next();
			
		}while(answer =="y");
	}
}
