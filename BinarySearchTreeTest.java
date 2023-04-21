import static org.junit.jupiter.api.Assertions.*;
//Paula Rebeca Barillas 22764
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void InsertOneElementTest() {
        BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        myBST.insert("woman", "mujer");
        assertEquals(1, myBST.count());
        assertEquals("mujer", myBST.getElements().get(0));
	}
	
	@Test
	void InsertMultipleElementsTest() {
        BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
      
	}
	
	@Test
	void InOrderWalkTest() {
        BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
        
        EjemploRecorrido<String> miRecorrido = new EjemploRecorrido<String>();
        myBST.inOrder(miRecorrido);
        /*
        assertEquals("diez", miRecorrido.miLista.get(0));
        assertEquals("veinte", miRecorrido.miLista.get(1));
        assertEquals("treinta", miRecorrido.miLista.get(2));
        assertEquals("cincuenta", miRecorrido.miLista.get(3));
        assertEquals("sesenta", miRecorrido.miLista.get(4));
        assertEquals("ochenta", miRecorrido.miLista.get(5));
        assertEquals("noventa", miRecorrido.miLista.get(6));
        */
	}
	

	@Test
	void findTest() {
		BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        
        assertEquals(true, myBST.isEmpty());
        
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
        
        assertEquals(false, myBST.isEmpty());
        
        assertEquals("si", myBST.find("yes"));
	}
	
	@Test
	void DeleteRootOnlyOneElementTest() {
		BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        
        assertEquals(true, myBST.isEmpty());
        
        myBST.insert("word", "palabra");
        
        assertEquals(1, myBST.count());
        
        assertEquals("palabra", myBST.delete("word"));
        
        assertEquals(0, myBST.count());
        
        assertEquals(true, myBST.isEmpty());
        
	}

	
	@Test
	void DeleteLeaftTest() {
		BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        
        assertEquals(true, myBST.isEmpty());
        
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
        
        assertEquals("dinero", myBST.delete("money"));

        EjemploRecorrido<String> miRecorrido = new EjemploRecorrido<String>();
        myBST.inOrder(miRecorrido);
        
        /*
        assertEquals("diez", miRecorrido.miLista.get(0));
        assertEquals("veinte", miRecorrido.miLista.get(1));
        assertEquals("treinta", miRecorrido.miLista.get(2));
        assertEquals("cincuenta", miRecorrido.miLista.get(3));
        assertEquals("sesenta", miRecorrido.miLista.get(4));
        assertEquals("ochenta", miRecorrido.miLista.get(5));
        */
	}
	
	@Test
	void DeleteRootMoreThanOneElementTest() {
		BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        
        assertEquals(true, myBST.isEmpty());
        
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
        
        assertEquals("miel", myBST.delete("honey"));

        EjemploRecorrido<String> miRecorrido = new EjemploRecorrido<String>();
        myBST.inOrder(miRecorrido);
        
        /*
        assertEquals("diez", miRecorrido.miLista.get(0));
        assertEquals("veinte", miRecorrido.miLista.get(1));
        assertEquals("treinta", miRecorrido.miLista.get(2));
        assertEquals("sesenta", miRecorrido.miLista.get(3));
        assertEquals("ochenta", miRecorrido.miLista.get(4));
        assertEquals("noventa", miRecorrido.miLista.get(5));
        */
	}
	
	
	@Test
	void DeleteIntermediateNodeMoreThanOneElementTest() {
		BinarySearchTree<String, String> myBST = new BinarySearchTree<String, String>(new StringComparator<String>());
        
        assertEquals(true, myBST.isEmpty());
        
        myBST.insert("yes", "si");
        myBST.insert("money", "dinero");
        myBST.insert("honey", "miel");
        myBST.insert("ice cream", "helado");
        myBST.insert("dessert", "postre");
        
        assertEquals(5, myBST.count());
                
        assertEquals("dinero", myBST.delete("money"));

        EjemploRecorrido<String> miRecorrido = new EjemploRecorrido<String>();
        myBST.inOrder(miRecorrido);
        
        /*
        assertEquals("diez", miRecorrido.miLista.get(0));
        assertEquals("treinta", miRecorrido.miLista.get(1));
        assertEquals("cincuenta", miRecorrido.miLista.get(2));
        assertEquals("sesenta", miRecorrido.miLista.get(3));
        assertEquals("ochenta", miRecorrido.miLista.get(4));
        assertEquals("noventa", miRecorrido.miLista.get(5));
        */
	}


}
