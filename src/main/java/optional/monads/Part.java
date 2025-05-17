package optional.monads;


import lombok.Getter;
import lombok.Setter;

import java.util.Optional;


@Setter
@Getter
public class Part {
    public int partNumber;
    public String partName;
    public boolean outOfStock;

    public Part (int partNumber, String partName) {
        this.partName = partName;
        this.partNumber = partNumber;
    }

    public boolean isOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(boolean outOfStock){
        this.outOfStock = outOfStock;
    }

    public Optional<Part> outOfStok(boolean outOfStok) {
        this.outOfStock = outOfStok;
        return Optional.of (this);
    }

    public Optional<Part> partName (String partName) {
        this.partName = partName;
        return Optional.of (this);
    }
    public Optional<Part> replicatePartMonad () {
        System.out.println ("Part replicated: " + this);
        return Optional.of (this);
    }

    @Override
    public String toString() {
        return "Part{" + "partNumber = " + partNumber + ",  " +
         " partName = " + partName + ", outOfStock = " + outOfStock + "}";
    }

    protected static void replicatePart (Part part) {
        System.out.println ("Part replicated: " + part);
    }
}
