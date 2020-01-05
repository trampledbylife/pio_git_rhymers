
package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

    public defaultCountingOutRhymer GetStandardRhymer();

    public defaultCountingOutRhymer GetFalseRhymer();

    public defaultCountingOutRhymer GetFIFORhymer();

    public defaultCountingOutRhymer GetHanoiRhymer();

}
=======
package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface Rhymersfactory {
	
		public DefaultCountingOutRhymer GetStandardRhymer();
		
		public DefaultCountingOutRhymer GetFalseRhymer();
		
		public DefaultCountingOutRhymer GetFIFORhymer();
		
		public DefaultCountingOutRhymer GetHanoiRhymer();
		
	}

