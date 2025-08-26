package JAVARuntime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** @Author Lucas Leandro (ITsMagic Founder) A bridge that calls between java runtime and Java Collections.synchronizedList Collections.synchronizedList was not made by ITsMagic */
@ClassCategory(cat = {"Lists"})
public class SynchronizedList implements List {

  private transient List list;

  public SynchronizedList() {}

  public SynchronizedList(List list) {}

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  @MethodArgs({"value"})
  public boolean contains(Object o) {
    return list.contains(o);
  }

  public Iterator iterator() {
    return list.iterator();
  }

  public Object[] toArray() {
    return list.toArray();
  }

  @MethodArgs({"value"})
  public boolean add(Object o) {
    return list.add(o);
  }

  @MethodArgs({"value"})
  public boolean remove(Object o) {
    return list.remove(o);
  }

  @MethodArgs({"value"})
  public boolean addAll(Collection collection) {
    return list.addAll(collection);
  }

  @MethodArgs({"idx", "value"})
  public boolean addAll(int i, Collection collection) {
    return list.addAll(i, collection);
  }

  public void clear() {
    list.clear();
  }

  @MethodArgs({"value"})
  public boolean equals(Object o) {
    return list.equals(o);
  }

  public int hashCode() {
    return list.hashCode();
  }

  @MethodArgs({"idx"})
  public Object get(int i) {
    return list.get(i);
  }

  @MethodArgs({"idx", "value"})
  public Object set(int i, Object o) {
    return list.set(i, o);
  }

  @MethodArgs({"idx", "value"})
  public void add(int i, Object o) {
    list.add(i, o);
  }

  @MethodArgs({"idx"})
  public Object remove(int i) {
    return list.remove(i);
  }

  @MethodArgs({"value"})
  public int indexOf(Object o) {
    return list.indexOf(o);
  }

  @MethodArgs({"value"})
  public int lastIndexOf(Object o) {
    return list.lastIndexOf(o);
  }

  public ListIterator listIterator() {
    return list.listIterator();
  }

  public ListIterator listIterator(int i) {
    return list.listIterator(i);
  }

  @MethodArgs({"i", "i1"})
  public List subList(int i, int i1) {
    return list.subList(i, i1);
  }

  @MethodArgs({"value"})
  public boolean retainAll(Collection collection) {
    return list.retainAll(collection);
  }

  @MethodArgs({"value"})
  public boolean removeAll(Collection collection) {
    return list.removeAll(collection);
  }

  @MethodArgs({"value"})
  public boolean containsAll(Collection collection) {
    return list.containsAll(collection);
  }

  @MethodArgs({"value"})
  public Object[] toArray(Object[] objects) {
    return list.toArray(objects);
  }
}
