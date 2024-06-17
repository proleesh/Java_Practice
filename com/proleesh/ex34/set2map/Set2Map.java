package com.proleesh.ex34.set2map;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

class SimpleEntry<K, V> implements Map.Entry<K, V>, Serializable{
    private final K key;
    private V value;

    public SimpleEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public SimpleEntry(Map.Entry<? extends K, ? extends V> entry){
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleEntry<?, ?> that = (SimpleEntry<?, ?>) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "SimpleEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class Set2Map {
}
