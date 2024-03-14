import java.util.*;

public class Main {
    public static void main(String[] args) {

        Medicine pineceline = new Medicine("Pineceline", "10mg", 100);
        Medicine salt = new Medicine("Salt", "20gr", 10);
        Medicine sugar = new Medicine("Sugar", "87gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, pineceline);

//        for (Component c : pharmacy2){
//            System.out.println(c);
//        }

        List<Medicine> list = new ArrayList<>();
        list.add(pineceline);
        list.add(salt);
        list.add(sugar);


        Collections.sort(list);
        System.out.println(list);


        IterablePharmacy pharm1 = new IterablePharmacy();
        pharm1.addComponents(salt, pineceline);

        IterablePharmacy pharm2 = new IterablePharmacy();
        pharm2.addComponents(salt, pineceline);

        System.out.println(pharm1);

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharm1);
        result.add(pharm2);
        System.out.println(result.size());

    }

}