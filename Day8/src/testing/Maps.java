package testing;

import javafx.scene.shape.Rectangle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Maps {
    public static void main(String[] args) {
        Map look = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };

        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        look.put("small", r1);
        Rectangle r2 = new Rectangle(0, 0, 15, 15);
        look.put("medium", r2);
        Rectangle r3 = new Rectangle(0, 0, 25, 25);
        look.put("large", r3);


        Rectangle rect = (Rectangle) look.get("large");
        System.out.println(rect);


        //Makes no sense!!!

        int size = look.size();
        System.out.println(size);

        boolean isEmpty = look.isEmpty();
        System.out.println(isEmpty);

        HashMap hash = new HashMap(20, 0.5F);

        Rectangle box = new Rectangle(0, 0, 5, 5);
        boolean isThere = hash.containsValue(box);

        System.out.println(isThere);
    }
}