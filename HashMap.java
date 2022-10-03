package hashtable;

public class HashMap<K, V> {

	LinkedList<K> linkedList;

	public HashMap() {
		this.linkedList = new LinkedList<>();
	}

	public V get(K key) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			this.linkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMap [linkedList = " + linkedList + "]";
	}

}
