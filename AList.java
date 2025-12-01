package JAVARuntime;

//
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Lists"})
public class AList<T> implements List<T> {

    private final transient List<T> list;

    public AList() {
        this.list = new ArrayList();
    }

    public AList(List<T> list) {
        this.list = new ArrayList(list);
    }

    @JRDoc_EN("Returns the list size (number of elements).")
    @JRDoc_PT("Retorna o tamanho da lista (número de elementos).")
    public int size() {
        return list.size();
    }

    @JRDoc_EN("Returns whether the list is empty.")
    @JRDoc_PT("Retorna se a lista está vazia.")
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @JRDoc_EN("Returns whether the list contains the element.")
    @JRDoc_PT("Retorna se a lista contém o elemento.")
    @MethodArgs({"value"})
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @JRDoc_EN("Returns an iterator over the elements in the list.")
    @JRDoc_PT("Retorna um iterador sobre os elementos da lista.")
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @JRDoc_EN("Returns an array with all elements in the list.")
    @JRDoc_PT("Retorna um array com todos os elementos da lista.")
    public Object[] toArray() {
        return list.toArray();
    }

    @JRDoc_EN("Returns an array with all elements in the list, using the provided array.")
    @JRDoc_PT("Retorna um array com todos os elementos da lista, utilizando o array fornecido.")
    @MethodArgs({"value"})
    public <E> E[] toArray(E[] array) {
        return list.toArray(array);
    }

    @JRDoc_EN("Add the element to the list.")
    @JRDoc_PT("Adiciona o elemento à lista.")
    @MethodArgs({"value"})
    public boolean add(T t) {
        return list.add(t);
    }

    @JRDoc_EN("Removes the element from the list.")
    @JRDoc_PT("Remove o elemento da lista.")
    @MethodArgs({"value"})
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @JRDoc_EN("Adds all the elements from the collection to the list.")
    @JRDoc_PT("Adiciona todos os elementos da coleção à lista.")
    @MethodArgs({"value"})
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @JRDoc_EN("Adds all the elements from the collection to the list at the specified index.")
    @JRDoc_PT("Adiciona todos os elementos da coleção à lista no índice especificado.")
    @MethodArgs({"idx", "value"})
    public boolean addAll(int index, Collection<? extends T> c) {
        return list.addAll(index, c);
    }

    @JRDoc_EN("Removes all elements from the list.")
    @JRDoc_PT("Remove todos os elementos da lista.")
    public void clear() {
        list.clear();
    }

    @JRDoc_EN("Compares whether the list is equal to the specified object.")
    @JRDoc_PT("Compara se a lista é igual ao objeto especificado.")
    @MethodArgs({"value"})
    public boolean equals(Object o) {
        return list.equals(o);
    }

    @JRDoc_EN("Returns the hash code of the list.")
    @JRDoc_PT("Retorna o código hash da lista.")
    public int hashCode() {
        return list.hashCode();
    }

    @JRDoc_EN("Returns the element at the specified index.")
    @JRDoc_PT("Retorna o elemento no índice especificado.")
    @MethodArgs({"idx"})
    public T get(int index) {
        return list.get(index);
    }

    @JRDoc_EN("Sets the element at the index to the provided value.")
    @JRDoc_PT("Define o elemento no índice para o valor fornecido.")
    @MethodArgs({"idx", "value"})
    public T set(int index, T element) {
        return list.set(index, element);
    }

    @JRDoc_EN("Adds the element at the specified index.")
    @JRDoc_PT("Adiciona o elemento no índice especificado.")
    @MethodArgs({"idx", "value"})
    public void add(int index, T element) {
        list.add(index, element);
    }

    @JRDoc_EN("Removes the element at the specified index.")
    @JRDoc_PT("Remove o elemento no índice especificado.")
    @MethodArgs({"idx"})
    public T remove(int index) {
        return list.remove(index);
    }

    @JRDoc_EN("Returns the index of the first occurrence of the specified element.")
    @JRDoc_PT("Retorna o índice da primeira ocorrência do elemento especificado.")
    @MethodArgs({"value"})
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @JRDoc_EN("Returns the index of the last occurrence of the specified element.")
    @JRDoc_PT("Retorna o índice da última ocorrência do elemento especificado.")
    @MethodArgs({"value"})
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @JRDoc_EN("Returns a list iterator over the elements in the list.")
    @JRDoc_PT("Retorna um iterador de lista sobre os elementos da lista.")
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @JRDoc_EN("Returns a list iterator over the elements in the list, starting at the specified index.")
    @JRDoc_PT("Retorna um iterador de lista sobre os elementos da lista, começando no índice especificado.")
    @MethodArgs({"i"})
    public ListIterator<T> listIterator(int index) {
        return list.listIterator(index);
    }

    @JRDoc_EN("Returns a list of elements between specified indices.")
    @JRDoc_PT("Retorna uma lista com os elementos entre os índices especificados.")
    @MethodArgs({"fromIndex","toIndex"})
    public List<T> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @JRDoc_EN("Retains only the elements in the list that are contained in the specified collection.")
    @JRDoc_PT("Retém apenas os elementos da lista que estão contidos na coleção especificada.")
    @MethodArgs({"value"})
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @JRDoc_EN("Removes from the list all elements that have the same value from the specified collection.")
    @JRDoc_PT("Remove da lista todos os elementos que possuem o mesmo valor da coleção especificada.")
    @MethodArgs({"value"})
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @JRDoc_EN("Checks if the list contains all elements of the specified collection.")
    @JRDoc_PT("Verifica se a lista contém todos os elementos da coleção especificada.")
    @MethodArgs({"value"})
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    // -------- Java 8+ methods --------

    @JRDoc_EN("Executes the given action for each element in the list.")
    @JRDoc_PT("Executa a ação fornecida para cada elemento da lista.")
    @MethodArgs({"action"})
    public void forEach(Consumer<? super T> action) {
        list.forEach(action);
    }

    @JRDoc_EN("Replaces each element with the result of applying the operator.")
    @JRDoc_PT("Substitui cada elemento pelo resultado da aplicação do operador.")
    @MethodArgs({"operator"})
    public void replaceAll(UnaryOperator<T> operator) {
        list.replaceAll(operator);
    }

    @JRDoc_EN("Sorts the list using the provided comparator.")
    @JRDoc_PT("Ordena a lista usando o comparador fornecido.")
    @MethodArgs({"comparator"})
    public void sort(Comparator<? super T> c) {
        list.sort(c);
    }

    @JRDoc_EN("Removes all elements that satisfy the given predicate.")
    @JRDoc_PT("Remove todos os elementos que satisfazem o predicado fornecido.")
    @MethodArgs({"filter"})
    public boolean removeIf(Predicate<? super T> filter) {
        return list.removeIf(filter);
    }

    @JRDoc_EN("Returns a spliterator over the elements in the list.")
    @JRDoc_PT("Retorna um spliterator sobre os elementos da lista.")
    public Spliterator<T> spliterator() {
        return list.spliterator();
    }

    @JRDoc_EN("Returns a sequential stream of the list.")
    @JRDoc_PT("Retorna um stream sequencial da lista.")
    public Stream<T> stream() {
        return list.stream();
    }

    @JRDoc_EN("Returns a possibly parallel stream of the list.")
    @JRDoc_PT("Retorna um stream possivelmente paralelo da lista.")
    public Stream<T> parallelStream() {
        return list.parallelStream();
    }

    @JRDoc_EN("Returns the internal list (for advanced use).")
    @JRDoc_PT("Retorna a lista interna (para uso avançado).")
    public List<T> getInternalList() {
        return list;
    }
}
