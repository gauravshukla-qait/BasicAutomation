
public class FourZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zero = {0, 0, 0, 0};
		for(int i = 0; i < 2; i++) {
			zero[i] = zero[i]^1;
		}
		String s = new String();
		for(Integer i : zero) 
			s = s.concat(i.toString());
		int i = Integer.parseInt(s, 2);
		i = i+i;
		System.out.println(i);
		
	}

}
