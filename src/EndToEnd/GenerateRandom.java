package EndToEnd;


	import java.util.Random;

	public class GenerateRandom {
	    private static Random randomGenerator = new Random();
	    
	    private static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g",
	           "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
	            "u", "v", "w", "x", "y", "z" };

	   public static void main(String[] args) {
	       for (int i = 0; i < 10; ++i)
	           System.out.println(GenerateRandom.generateName("Test") + " "+ GenerateRandom.generateName("Employee"));
	       for (int i = 0; i < 10; ++i)
	           System.out.println(generatePhoneNumber());
	       for (int i = 0; i < 10; ++i)
	           System.out.println(generatemailAddress("mail"));
	   }
	   
	   public static String generateName(String name) {
	       int characterNumber = 3;
	       //
	       StringBuilder sb = new StringBuilder();
	       //
	       sb.append(name);
	       if (!"".equals(name))
	           sb.append("_");
	       
	       while (characterNumber > 0) {
	           sb.append(alphabet[randomGenerator.nextInt(26)]);
	           characterNumber--;
	           }
	       sb.append(randomGenerator.nextInt(100)
	               + (System.currentTimeMillis() / 100000000));
	       return sb.toString();
	       }
	   
	   public static String generatePhoneNumber() {
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < 11; ++i) {
	           sb.append(randomGenerator.nextInt(10));
	           }
	       
	       return sb.toString();
	       }        
	   
	   public static String generatemailAddress(String text) {
	       return generateName(text) + "@" + generateName("") + ".com";
	       }
	   
	   
				
		
		

	}

