
public class TreeNode<K, V> {

	private V value;
	private K id;
	private TreeNode<K, V> left;
	private TreeNode<K, V> right;
	private TreeNode<K, V> parent;
	
	public TreeNode(K id, V value) {
		setId(id);
		setValue(value);
		setLeft(null);
		setRight(null);
		setParent(null);
	}
	
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	/**
	 * @return the id
	 */
	public K getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(K id) {
		this.id = id;
	}
	/**
	 * @return the left
	 */
	public TreeNode<K, V> getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode<K, V> left) {
		this.left = left;
	}
	
	public TreeNode<K, V> getRight() {
		return right;
	}

	public void setRight(TreeNode<K, V> right) {
		this.right = right;
	}

	public TreeNode<K, V> getParent() {
		return parent;
	}

	public void setParent(TreeNode<K, V> parent) {
		this.parent = parent;
	}
}
