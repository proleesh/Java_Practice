package com.proleesh.ex34.set2map;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
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
public class Set2Map<K, V> extends HashSet<SimpleEntry<K, V>> {
    public void clear(){
        super.clear();
    }

    public boolean containsKey(K key){
        for(SimpleEntry<K, V> entry : this){
            if(entry.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    boolean containsValue(Object value){
        for(SimpleEntry<K,V> se : this){
            if(se.getValue().equals(value)){
                return true;
            }
        }
        return false;
    }

    public V get(Object key){
        for(SimpleEntry<K, V> se : this){
            if(se.getKey().equals(key)){
                return se.getValue();
            }
        }
        return null;
    }

    public V put(K key, V value){
        add(new SimpleEntry<K, V>(key, value));
        return value;
    }

    public void putAll(Map<? extends K, ? extends V> m){
        for(K key : m.keySet()){
            add(new SimpleEntry<K, V>(key, m.get(key)));
        }
    }

    public V removeEntry(Object key){
        for(Iterator<SimpleEntry<K, V>> it = this.iterator();  it.hasNext();){
            SimpleEntry<K, V> en = (SimpleEntry<K, V>)
                    it.next();
            if(en.getKey().equals(key)){
                V v = en.getValue();
                it.remove();
                return v;
            }
        }
        return null;
    }
    public int size(){
        return super.size();
    }


}
