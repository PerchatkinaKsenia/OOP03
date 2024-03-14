import java.util.Iterator;

public class MedicineIterator implements Iterator<Medicine> {
    private int index = 0;
    private IterablePharmacy pharmacy;

    public MedicineIterator(IterablePharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.getMedicines()().size();
    }

    @Override
    public Medicine next() {
        //component c = components.get(index);
        //index++;
        //return c;
        return pharmacy.getMedicines().get(index++);
    }
}