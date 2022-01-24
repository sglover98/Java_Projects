import javax.swing.JOptionPane;


public class StudentIDsystem {


	public static void main(String[] args) {
		
		int[] ID = new int[]{1234,2456,3456,4567, 5678, 6789, 7890, 8910,9012};
		String[] names = new String[] { "Dave", "Dom", "Mick", "Stan", "Car", "Sid", "Vin", "Tyler", "Pop", "Hat"};
		double[] grades= new double []{80, 58, 45, 99, 80, 60, 86, 78, 88, 19};
		boolean stop = false;
		String sid = null;
		



		while(!stop) {
			
			sid = JOptionPane.showInputDialog("Please enter your ID");

			
			if(!number(sid)) {
				JOptionPane.showMessageDialog(null, sid +" Sorry please recheck tour ID");
			}
			
			
			else {
				int idd = Integer.parseInt(sid);
				int index = indexOf(ID, idd);
				
				
				if(index!=-1) 
				{
					JOptionPane.showMessageDialog(null, "Name = "+names[index]
							+ "\nGrade = "+grades[index]);
					stop=!stop;
				}
				
				
				else {
					JOptionPane.showMessageDialog(null, sid +"invalid student id");				
				}
			}
		}
		
	}
    
    
    public static int indexOf(int[] arr, int k) {
		for(int i=0; i<arr.length; i++)
			
		if(arr[i]==k)
				return i;
		return -1;
	}
	public static boolean number(String number) {
		
		try
		{
			Long.parseLong(number);
		}
		
		catch(Exception e) {
			return false;
		}
		return true;
	}
	

}

