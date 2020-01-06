package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

/**
 * klasa odpowiedzialna za zwracanie instancji klas z DefaultCountingOutRhymer
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * @return zwracana nowy obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return zwracana nowy obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return zwracana nowy obiekt klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * @@return zwracana nowy obiekt klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }
    
}
