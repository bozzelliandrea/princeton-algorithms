package github.algorithms.symbol_table;

import java.io.Serializable;
import java.util.NoSuchElementException;

public interface SymbolTable<K, V> extends Serializable {

    RuntimeException INVALID_NULL_KEY = new IllegalArgumentException("Null key is invalid!");

    RuntimeException EMPTY = new NoSuchElementException("Symbol Table is Empty!");

    static <K> RuntimeException KEY_NOT_FOUND(K key) {
        return new NoSuchElementException("Key " + key + " not found");
    }

    V get(K key);

    void put(K key, V value);

    void delete(K key);

    boolean contains(K key);

    int size();

    default boolean isEmpty() {
        return this.size() == 0;
    }

    Iterable<K> keys();
}
