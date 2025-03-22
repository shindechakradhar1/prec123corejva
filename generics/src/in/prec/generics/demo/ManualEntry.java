package in.prec.generics.demo;

public class ManualEntry<K, V> {
	private K key;
	private V value;

	public ManualEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ManualEntry [key=" + key + ", value=" + value + "]";
	}

}
