

public class Game369 {
	public static void main(String[] args) {
		
		for(int i=1; i<100; i++){

			String number = String.valueOf(i);
			int count = 0;
			
			for(int j=0; j < number.length(); j++)
			{
				
				int n = Integer.valueOf(number.charAt(j))-'0';
				
				if( n%3==0 && n != 0)
				    ++count;

			}
			
			if(count>0){
				
				System.out.print(i+" ");
				for(int k=0; k<count; k++){
					System.out.print("짝");
				}
				
				System.out.println();
			}
			
		}
	}
}
