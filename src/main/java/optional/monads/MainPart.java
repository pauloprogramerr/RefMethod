package optional.monads;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MainPart {
    public static void main(String[] args) {

        Map<Integer, Part> parts = new HashMap<> ();
        parts.put (123, new Part (123, "bolt "));
        parts.put (456, new Part (456, "nail"));
        parts.put (789, new Part (789, "wire"));

        int partId = 123;
        Part part = parts.get (partId);
        part.setOutOfStock (true);
        part.setPartName (part.getPartName () + " out of stock");
        System.out.println (part);

        Optional<Part> optPart = Optional.of (parts.get (456));
        System.out.println (optPart
                .flatMap (x -> x.outOfStok (true))
                .flatMap (x -> x.partName(x.getPartName () + " out of stock"))
                .flatMap (Part::replicatePartMonad)
                .orElseThrow (() -> new RuntimeException ()));
    }
}
