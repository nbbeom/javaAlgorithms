배열 다루기

Arrays.sort(T[] arrays)
Arrays.sort(T[] arrays, Collections.reverseOrder());
Arrays.sort(T[] arrays, new Comparator<T>(){
    public int compare(T o1, T o2){ return i;} 
})

Arrays.asList(T[] arrays);   // java.util.Arrays.ArrayList 크기 변경 불가

Arrays.copyOf(T[] arr, int length);
Arrays.fill(T[] arr, Object o);

Arrays.binarySearch(T[] arr, Object key)  // 정렬 후 사용, 값 중복 시 인덱시 랜덤







리스트 다루기

T[] arrays = list.toArray(new T[size]);  //minimum size는 list.size()

Collections.sort(collections c);
Collections.sort(collections c, Collections.reverseOrder());
Collections.sort(collections c, new comparator<T>(){
   public int compare(T ob1, T ob2){return i;}	
})

List -> ArrayList, LinkedList, Queue, PriorityQueue
Set -> HashSet, LinkedSet, TreeSet
Map -> HashMap

1. List
list.size();
list.isEmpty();
list.contains(Object o);

list.add(int index, E element);

list.get(int index);
list.indexOf(Object o);

list.clear();
list.remove(int index);
list.remove(Object o);

1-1 ArrayList
arraylist.clone();
arraylist.toArray();
arraylist.ensureCapacity(int mincapacity);  // 최소 사이즈 지정
arraylist.trimToSize();  // 사용하지 않는 부분 자르기

1-2 LinkedList 
linkedlist.clone();
linkedlist.toArray();

add(int index, E e) / addFirst() / addLast()
offer(E e) / offerFirst(E e) / offerLast(E e)
get(int index) / getFirst() / getLast()
peek() / peekFirst() / peekLast()  // 반환만
poll() / pollFirst() / pollLast()     // 제거하고 반환

1-3 Queue
offer(E e)
peek()
poll()

1-4 PriorityQueue
PriorityQueue pq = new PriorityQueue<>() 
PriorityQueue pq = new PriorityQueue<>(new Collections.reverseOrder())

offer()
add()
peek()
poll()

2. Set / HashSet
set.size();
set.isEmpty();
set.contains(Object o);

set.add(int index, E element); 
remove(Object o);

3. Map / HashMap
map.clear()
map.size()

map.containsKey(Object key);
map.containsValue(Object value);

map.get(Object key);
map.getOfDelfault(Object key, V defaultValue);

map.keySet(); 
map.values();

map.put(K key, V value);

map.remove();
map.replaec(K key, V value);