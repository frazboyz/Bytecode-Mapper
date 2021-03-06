package org.mapper.identity;

import jdk.internal.org.objectweb.asm.tree.FieldNode;
import org.mapper.knn.instance.Instance;

/**
 * Created by Francis on 24/02/16.
 * Project Bytecode-Mapper.
 *
 * Represents a java field identity
 */
public class FieldIdentity extends Identity<FieldNode> {

    /**
     * Constructs a new {@link FieldIdentity}.
     *
     * @param name     the mapped name.
     * @param instance the {@link Instance} of this {@link FieldIdentity}.
     */
    public FieldIdentity(final String name, final Instance<FieldNode> instance) {
        super(name, instance);
    }
}
