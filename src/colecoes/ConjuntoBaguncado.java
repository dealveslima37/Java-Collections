package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        Set<Object> conjunto = new HashSet<Object>();

        conjunto.add(97.5);
        conjunto.add("Alexandre");
        conjunto.add(34);
        conjunto.add('s');

        System.out.println("Tamanho é " + conjunto.size());

        Set<Integer> nums = new HashSet<>();

        nums.add(13);
        nums.add(34);
        nums.add(55);
        nums.add(27);
        nums.add(87);

        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

    }
}
