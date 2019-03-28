package org.drools.reteoo;

import org.drools.FactException;
import org.drools.spi.PropagationContext;


public class LeftInputAdapterNode 
{
    private ObjectSource objectSource;

    private int          column;

    public LeftInputAdapterNode(
                                int column,
                                ObjectSource source)
    {
        this.column = column;
        this.objectSource = source;
    }
}