public class experimento1310 {
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define sc1(a) scanf("%d", &a)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define for(i,a,n) for(int (i) = (a); (i) < (n); (i)++)

	public static int[] a = new int[51];

	public static int Main() {
		int n;
		int custo;
		int x;
		int max;
		int tmax;

		while (scanf("%d", n) == 1) {
			String tempVar = ConsoleInput.scanfRead();
			
			if (tempVar != null){
				custo = Integer.parseInt(tempVar);
			}
			max = 0; 
			tmax = 0;

			for ((int)i = (0); (i) < (n); (i)++) {
				String tempVar2 = ConsoleInput.scanfRead();
				
				if (tempVar2 != null) {
					x = Integer.parseInt(tempVar2);
				}
				a[i] = x - custo;
			}

			for ((int)i = (0); (i) < (n); (i)++) {
				tmax += a[i];
				if (tmax < 0) {
					tmax = 0;
				}
				
				if (max < tmax) {
					max = tmax;
				}
			}

			System.out.printf("%d\n", max);
		}

		return 0;
	}
}

//package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2017 Tangible Software Solutions Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to convert basic C++ 'cin' behavior.
// //----------------------------------------------------------------------------------------
// public final class ConsoleInput
// {
// 	private static boolean goodLastRead = false;
// 	public static boolean lastReadWasGood()
// 	{
// 		return goodLastRead;
// 	}

// 	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace)
// 	{
// 		String input = "";
// 		char nextChar;
// 		while (Character.isWhitespace(nextChar = (char)System.in.read()))
// 		{
// 			//accumulate leading white space if skipLeadingWhiteSpace is false:
// 			if (!skipLeadingWhiteSpace)
// 			{
// 				input += nextChar;
// 			}
// 		}
// 		//the first non white space character:
// 		input += nextChar;

// 		//accumulate characters until white space is reached:
// 		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
// 		{
// 			input += nextChar;
// 		}

// 		goodLastRead = input.length() > 0;
// 		return input;
// 	}

// 	public static String scanfRead()
// 	{
// 		return scanfRead(null, -1);
// 	}

// 	public static String scanfRead(String unwantedSequence)
// 	{
// 		return scanfRead(unwantedSequence, -1);
// 	}

// 	public static String scanfRead(String unwantedSequence, int maxFieldLength)
// 	{
// 		String input = "";

// 		char nextChar;
// 		if (unwantedSequence != null)
// 		{
// 			nextChar = '\0';
// 			for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
// 			{
// 				if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
// 				{
// 					//ignore all subsequent white space:
// 					while (Character.isWhitespace(nextChar = (char)System.in.read()))
// 					{
// 					}
// 				}
// 				else
// 				{
// 					//ensure each character matches the expected character in the sequence:
// 					nextChar = (char)System.in.read();
// 					if (nextChar != unwantedSequence.charAt(charIndex))
// 						return null;
// 				}
// 			}

// 			input = (new Character(nextChar)).toString();
// 			if (maxFieldLength == 1)
// 				return input;
// 		}

// 		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
// 		{
// 			input += nextChar;
// 			if (maxFieldLength == input.length())
// 				return input;
// 		}

// 		return input;
// 	}
// }
