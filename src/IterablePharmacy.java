

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Medicine> { // поддерживает форич
    private int index;
    private final List<Medicine> components;

    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Medicine ... components){
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.medicines, medicines);

    }

    public List<Medicine> getMedicines() {
        return components;
    }

    //@NotNull
    @Override
    public Iterator<Medicine> iterator() {

        return new Iterator<Medicine>() {
            @Override
            public boolean hasNext() {
                return index < medicines.size();
            }
            @Override
            public Medicine next() {
                return getMedicines().get(index++);
            }
        };
    }

}