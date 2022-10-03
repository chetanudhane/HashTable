package hashtable;

public class HashMapMain {

	public static void main(String[] args) {

		givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency();
	}

	private static void givenASentence_WhenWordAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> myHashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		System.out.println("Frequency of give word 'to' is " + frequency);
	}

}
