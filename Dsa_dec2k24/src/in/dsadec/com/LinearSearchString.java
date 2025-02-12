package in.dsadec.com;

public class LinearSearchString {

	public static void main(String[] args) {
		String name="anand";
		char target='5';
		System.out.println(Search(name,target));
		
	}
	static String Search(String name,char target)
	{
		if(name.length()==0)
		{
			return "String is empty";
		}
		for(int i=0;i<name.length();i++)
		{
			if(target==name.charAt(i))
			{
				return ""+target+" found";
			}
		}
		return ""+target+" not found";
	}

}
